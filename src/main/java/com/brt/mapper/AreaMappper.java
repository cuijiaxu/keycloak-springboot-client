package com.brt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.Area;

public interface AreaMappper {
	@Select("select * from tb_area where parent_code = #{parent_code}")
	@Results({
		@Result(property = "code", column = "code"),
		@Result(property = "name", column = "name"),
		@Result(property = "parentcode", column = "parentcode"),
		@Result(property = "enname", column = "enname")		
	})
	List<Area> getByParentCode(int parentcode);
	
	@Insert("insert into tb_area (code, name, parent_code,en_name) "
			   + "values (#{code}, #{name},#{parentcode}, #{enname})")
		void insert(Area ar);

	@Update("update tb_area set name=#{name}, parent_code=#{parentcode},en_name=#{enname} where code=#{code}")
		void update(Area ar);

	@Delete("delete from tb_area where code = #{code}")
		void delete(int id);	
}
