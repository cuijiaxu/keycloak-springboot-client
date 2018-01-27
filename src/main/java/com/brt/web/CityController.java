package com.brt.web;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brt.entity.City;
import com.brt.entity.Province;
import com.brt.mapper.CityMapper;
import com.brt.util.HTTPRequestUtil;
import com.brt.util.JsonUtil;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping(value="/ci")

public class CityController {
	@Autowired
	private CityMapper cityMapper;
	
	private JsonUtil jsonutil = new JsonUtil();
	private HTTPRequestUtil requestutil = new HTTPRequestUtil();
	
	@RequestMapping(value="/list", produces="application/json")
	@ResponseBody
	public String select(String id){
			//this.cityMapper.getByParentCode(Integer.parseInt(id));
		List<City> list = this.cityMapper.getByParentCode(Integer.parseInt(id));
		return jsonutil.toJson(list);
	}	
	
	@RequestMapping("/add")
	public String insert(HttpServletRequest request){
		String result = "";
		try {
			String jsonString = requestutil.charReader(request);
			City add = jsonutil.fromJson(jsonString, City.class);
			this.cityMapper.insert(add);
			result = "success";
		}catch (Exception e) {
			result = "failure";
			e.printStackTrace();
		}
		return jsonutil.toJson(result);
	}
	
	@RequestMapping("/update")
	public JSONPObject update(City ci){
		String result = "";
		try {
			this.cityMapper.update(ci);
			result = "success";
		}catch (Exception e) {
			result = "failure";
			e.printStackTrace();
		}
		return new JSONPObject("callback", result);
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request){
		String result = "";
		try {
			String jsonString = requestutil.charReader(request);
			Map<String, Object> map = jsonutil.json2map(jsonString);
			int id = Integer.parseInt((String)map.get("id")) ;	
			this.cityMapper.delete(id);
			result = "success";
		}catch (Exception e) {
			result = "failure";
			e.printStackTrace();
		}
		return jsonutil.toJson(result);
	}

	
}
