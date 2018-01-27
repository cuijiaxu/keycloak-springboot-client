package com.brt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.City;

public interface CityMapper {
	@Select("select * from tb_city where parent_code = #{parent_code}")
	@Results({
		@Result(property = "code", column = "code"),
		@Result(property = "name", column = "name"),
		@Result(property = "parentcode", column = "parentcode"),
		@Result(property = "enname", column = "enname")		
	})
	List<City> getByParentCode(int parentcode);
	
	@Insert("insert into tb_city (code, name, parent_code,en_name) "
			   + "values (#{code}, #{name},#{parentcode}, #{enname})")
		void insert(City ci);

	@Update("update tb_city set name=#{name}, parent_code=#{parentcode},en_name=#{enname} where code=#{code}")
		void update(City ci);

	@Delete("delete from tb_city where code = #{code}")
		void delete(int id);	
}
