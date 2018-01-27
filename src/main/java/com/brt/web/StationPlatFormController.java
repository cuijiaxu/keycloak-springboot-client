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

import com.brt.entity.StationPlatForm;
import com.brt.mapper.StationPlatFormMappper;
import com.brt.util.HTTPRequestUtil;
import com.brt.util.JsonUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping(value = "/station")
public class StationPlatFormController {

	@Autowired
	private StationPlatFormMappper stationplatformmappper;

	private JsonUtil jsonutil = new JsonUtil();
	private HTTPRequestUtil requestutil = new HTTPRequestUtil();

	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody	
	public String Lquery(HttpServletRequest request) throws IOException {	
		List<StationPlatForm> list=this.stationplatformmappper.query();
		PageInfo<StationPlatForm> pageInfo = new PageInfo<StationPlatForm>(list);
		return jsonutil.toJson(pageInfo);
	}	
	
}