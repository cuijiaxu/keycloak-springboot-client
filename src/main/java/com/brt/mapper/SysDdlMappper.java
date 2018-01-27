package com.brt.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.SysDdl;

public interface SysDdlMappper {
	@Select("select * from tb_SYSDDL ")
	@Results({
		@Result(property = "sid", column = "SID"),
		@Result(property = "keyword", column = "KEYWORD"),
		@Result(property = "sysvalue", column = "SYSVALUE"),
		@Result(property = "sparevalue", column = "SPAREVALUE"),	
		@Result(property = "displayvalue", column = "DISPLAYVALUE"),
		@Result(property = "systype", column = "SYSTYPE"),
		@Result(property = "description", column = "DESCRIPTION"),
		@Result(property = "remark", column = "REMARK"),			
		@Result(property = "showflag", column = "SHOWFLAG"),
		@Result(property = "sparevalue1", column = "SPAREVALUE1")				
	})
	List<SysDdl> query();
	
	@Insert("insert into tb_city (code, name, parent_code,en_name) "
			   + "values (#{code}, #{name},#{parentcode}, #{enname})")
		void insert(SysDdl sys);

	@Update("update tb_city set name=#{name}, parent_code=#{parentcode},en_name=#{enname} where code=#{code}")
		void update(SysDdl sys);

	@Delete("delete from tb_city where code = #{code}")
		void delete(int id);		
	
}
