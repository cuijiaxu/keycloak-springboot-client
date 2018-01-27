package com.brt.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.LedInfo;



public interface LedInfoMappper {
	@Select("select * from TB_LEDINFO ")
	  
	@Results({
		@Result(property = "LEDINFOID", column = "LEDINFOID"),
		@Result(property = "LEDNO", column = "LEDNO"),
		@Result(property = "COMMMODE", column = "COMMMODE"),
		@Result(property = "SERIALPORT", column = "SERIALPORT"),	
		@Result(property = "IPADDRESS", column = "IPADDRESS"),
		@Result(property = "IPPORT", column = "IPPORT"),
		@Result(property = "MANUFACTURERNO", column = "MANUFACTURERNO"),
		@Result(property = "EQUIPTYPE", column = "EQUIPTYPE"),			
		@Result(property = "EQUIPSTATUS", column = "EQUIPSTATUS"),
		@Result(property = "CREATEUSERID", column = "CREATEUSERID"),
		@Result(property = "CREATETIME", column = "CREATETIME"),
		@Result(property = "OFFLINECONTENT", column = "OFFLINECONTENT"),		
		@Result(property = "NOTIFYCONTENT", column = "NOTIFYCONTENT"),
		@Result(property = "REFRESHSTATUSTIME", column = "REFRESHSTATUSTIME"),
		@Result(property = "RESOLUTION", column = "RESOLUTION"),
		@Result(property = "POSITION", column = "POSITION"),			
		@Result(property = "STATIONNO", column = "STATIONNO")			
		
	})
	List<LedInfo> query();

	@Insert("insert into tb_city (code, name, parent_code,en_name) "
			   + "values (#{code}, #{name},#{parentcode}, #{enname})")
		void insert(LedInfo led);

	@Update("update tb_city set name=#{name}, parent_code=#{parentcode},en_name=#{enname} where code=#{code}")
		void update(LedInfo led);

	@Delete("delete from tb_city where code = #{code}")
		void delete(int id);	
}
