package com.brt.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.StationPlatForm;

public interface StationPlatFormMappper {
	@Select("select * from tb_stationplatform ")
	  
	@Results({
		@Result(property = "id", column = "ID"),
		@Result(property = "region", column = "REGION"),
		@Result(property = "street", column = "STREET"),
		@Result(property = "stationname", column = "STATIONNAME"),	
		@Result(property = "direction", column = "DIRECTION"),
		@Result(property = "longitude", column = "LONGITUDE"),
		@Result(property = "latitude", column = "LATITUDE"),
		@Result(property = "arrivalradius", column = "ARRIVALRADIUS"),			
		@Result(property = "departureradius", column = "DEPARTURERADIUS"),
		@Result(property = "stationtatus", column = "STATIONTATUS"),
		@Result(property = "stationtype", column = "STATIONTYPE"),
		@Result(property = "draftsman", column = "DRAFTSMAN"),		
		@Result(property = "drafttime", column = "DRAFTTIME"),
		@Result(property = "auditman", column = "AUDITMAN"),
		@Result(property = "audittime", column = "AUDITTIME"),
		@Result(property = "voice", column = "VOICE"),			
		@Result(property = "stationid", column = "STATIONID"),
		@Result(property = "stationno", column = "STATIONNO"),
		@Result(property = "shortname", column = "SHORTNAME"),
		@Result(property = "substationid", column = "SUBSTATION_ID")			
		
	})
	List<StationPlatForm> query();
	
}
