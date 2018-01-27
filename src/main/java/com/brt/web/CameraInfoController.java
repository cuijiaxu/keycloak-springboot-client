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

import com.brt.entity.CameraInfo;
import com.brt.entity.City;
import com.brt.mapper.CameraInfoMappper;
import com.brt.util.HTTPRequestUtil;
import com.brt.util.JsonUtil;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping(value = "/cam")
public class CameraInfoController {

	@Autowired
	private CameraInfoMappper camerainfomappper;

	private JsonUtil jsonutil = new JsonUtil();
	private HTTPRequestUtil requestutil = new HTTPRequestUtil();

	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody	
	public String Lquery(HttpServletRequest request) throws IOException {	
		List<CameraInfo> list=this.camerainfomappper.query();
		PageInfo<CameraInfo> pageInfo = new PageInfo<CameraInfo>(list);
		return jsonutil.toJson(pageInfo);
	}	

	@RequestMapping("/add")
	public String insert(HttpServletRequest request){
		String result = "";
		try {
			String jsonString = requestutil.charReader(request);
			CameraInfo add = jsonutil.fromJson(jsonString, CameraInfo.class);
			this.camerainfomappper.insert(add);
			result = "success";
		}catch (Exception e) {
			result = "failure";
			e.printStackTrace();
		}
		return jsonutil.toJson(result);
	}
	
	@RequestMapping("/update")
	public JSONPObject update(CameraInfo ci){
		String result = "";
		try {
			this.camerainfomappper.update(ci);
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
			this.camerainfomappper.delete(id);
			result = "success";
		}catch (Exception e) {
			result = "failure";
			e.printStackTrace();
		}
		return jsonutil.toJson(result);
	}
}