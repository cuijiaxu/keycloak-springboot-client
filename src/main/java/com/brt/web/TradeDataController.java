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

import com.brt.entity.TradeData;
import com.brt.mapper.TradeDataMappper;
import com.brt.util.HTTPRequestUtil;
import com.brt.util.JsonUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping(value = "/trade")
public class TradeDataController {

	@Autowired
	private TradeDataMappper tradedataMapper;

	private JsonUtil jsonutil = new JsonUtil();
	private HTTPRequestUtil requestutil = new HTTPRequestUtil();
	@RequestMapping(value = "/lists", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String findQuerys(HttpServletRequest request) throws IOException {
		List<TradeData> list = this.tradedataMapper.query();
		PageInfo<TradeData> pageInfo = new PageInfo<TradeData>(list);
		return jsonutil.toJson(pageInfo);
	}
	
	@RequestMapping(value = "/Llist", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody	
	public String Lquery(HttpServletRequest request) throws IOException {
		String paramstr = requestutil.charReader(request);
		Map<String, Object> map = jsonutil.json2map(paramstr);
		String begintime = (String)map.get("beginTime");	
		String endtime = (String) map.get("endTime");	
		List<TradeData> list=this.tradedataMapper.queryLcnt(begintime,endtime);
		PageInfo<TradeData> pageInfo = new PageInfo<TradeData>(list);
		return jsonutil.toJson(pageInfo);
	}	

	@RequestMapping(value = "/Rlist", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody	
	public String Rquery(HttpServletRequest request) throws IOException {
		String paramstr = requestutil.charReader(request);
		Map<String, Object> map = jsonutil.json2map(paramstr);
		String begintime = (String)map.get("beginTime");	
		String endtime = (String) map.get("endTime");	
		List<TradeData> list=this.tradedataMapper.queryRcnt(begintime,endtime);
		PageInfo<TradeData> pageInfo = new PageInfo<TradeData>(list);
		return jsonutil.toJson(pageInfo);
	}	
}