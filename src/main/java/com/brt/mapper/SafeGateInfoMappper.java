package com.brt.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.SafeGateInfo;

public interface SafeGateInfoMappper {
	@Select("select * from tb_stationplatform ")

	@Results({
		@Result(property = "SAFEGATEINFOID", column = "SAFEGATEINFOID"),
		@Result(property = "SAFEGATENO", column = "SAFEGATENO"),
		@Result(property = "SAFEGATEIP", column = "SAFEGATEIP"),
		@Result(property = "SAFEGATEPORT", column = "SAFEGATEPORT"),	
		@Result(property = "MANUFACTURERNO", column = "MANUFACTURERNO"),
		@Result(property = "EQUIPTYPE", column = "EQUIPTYPE"),			
		@Result(property = "EQUIPSTATUS", column = "EQUIPSTATUS"),
		@Result(property = "DEFINEID", column = "DEFINEID"),			
		@Result(property = "DEFINEDATE", column = "DEFINEDATE"),
		@Result(property = "IPADDRESS", column = "IPADDRESS")			
	})
	List<SafeGateInfo> query();

	@Insert("insert into tb_city (code, name, parent_code,en_name) "
			   + "values (#{code}, #{name},#{parentcode}, #{enname})")
		void insert(SafeGateInfo safe);

	@Update("update tb_city set name=#{name}, parent_code=#{parentcode},en_name=#{enname} where code=#{code}")
		void update(SafeGateInfo safe);

	@Delete("delete from tb_city where code = #{code}")
		void delete(int id);
}
