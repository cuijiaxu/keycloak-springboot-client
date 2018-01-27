package com.brt.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.AutoFareGate;


public interface AutoFareGateMappper {
	@Select("select * from tb_autofaregate ")	  
	@Results({
		@Result(property = "AUTOGATESTATIONID", column = "AUTOGATESTATIONID"),
		@Result(property = "ORGANNO", column = "ORGANNO"),
		@Result(property = "AUTOFAREGATENO", column = "AUTOFAREGATENO"),
		@Result(property = "AUTOFAREGATEIP", column = "AUTOFAREGATEIP"),	
		@Result(property = "AUTOFAREGATEPORT", column = "AUTOFAREGATEPORT"),
		@Result(property = "ACQUISTOPSID", column = "ACQUISTOPSID"),
		@Result(property = "ITEMCODE", column = "ITEMCODE"),
		@Result(property = "AUTOGATEPOSINFO", column = "AUTOGATEPOSINFO"),			
		@Result(property = "MANUFACTURERNO", column = "MANUFACTURERNO"),
		@Result(property = "EQUIPTYPE", column = "EQUIPTYPE"),	
		@Result(property = "READER_NO", column = "READER_NO")				
	})
	List<AutoFareGate> query();
	
	@Insert("insert into tb_autofaregate (autogatestationid,organno,autofaregateno,autofaregateip,autofaregateport,acquistopsid,itemcode,autogateposinfo,manufacturerno,equiptype,reader_no) "
			   + "values (#{code}, #{name},#{parentcode}, #{enname})")
		void insert(AutoFareGate auto);

	@Update("update tb_autofaregate set name=#{name}, parent_code=#{parentcode},en_name=#{enname} where code=#{code}")
		void update(AutoFareGate auto);

	@Delete("delete from tb_autofaregate where AUTOGATESTATIONID = #{AUTOGATESTATIONID}")
		void delete(int id);	
}
