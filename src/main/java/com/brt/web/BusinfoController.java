package com.brt.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brt.entity.BusStation;
import com.brt.entity.Businfo;
import com.brt.entity.Station;
import com.brt.mapper.BusinfoMapper;
import com.brt.mapper.StationMapper;
import com.brt.util.HTTPRequestUtil;
import com.brt.util.JsonUtil;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping(value = "/bus")
public class BusinfoController {

	@Autowired
	private BusinfoMapper businfoMapper;

	private JsonUtil jsonutil = new JsonUtil();
	private HTTPRequestUtil requestutil = new HTTPRequestUtil();

	@RequestMapping(value = "/lists", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String findQuerys(HttpServletRequest request) throws IOException {
		List<Businfo> list = this.businfoMapper.query();
		PageInfo<Businfo> pageInfo = new PageInfo<Businfo>(list);
		return jsonutil.toJson(pageInfo);
	}
	
	@RequestMapping("/add")
	public JSONPObject insert(HttpServletRequest request){
		String result = "";
		try {
			String jsonString = requestutil.charReader(request);
			Businfo add = jsonutil.fromJson(jsonString, Businfo.class);
			Date currentTime = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = formatter.format(currentTime);
			add.setCreatetime(formatter.parse(dateString));
			this.businfoMapper.insert(add);
			result = "success";
		}catch (Exception e) {
			result = "failure";
			e.printStackTrace();
		}
		return new JSONPObject("callback", result);
	}
	
	@RequestMapping("/update")
	public JSONPObject update(Businfo bs){
		String result = "";
		try {
			this.businfoMapper.update(bs);
			result = "success";
		}catch (Exception e) {
			result = "failure";
			e.printStackTrace();
		}
		return new JSONPObject("callback", result);
	}
	
	@RequestMapping("/delete")
	public JSONPObject delete(HttpServletRequest request){
		String result = "";
		try {
			String jsonString = requestutil.charReader(request);
			Map<String, Object> map = jsonutil.json2map(jsonString);
			int businfoid = Integer.parseInt((String)map.get("businfoid")) ;
			this.businfoMapper.delete(businfoid);
			result = "success";
		}catch (Exception e) {
			result = "failure";
			e.printStackTrace();
		}
		return new JSONPObject("callback", result);
	}	
}
