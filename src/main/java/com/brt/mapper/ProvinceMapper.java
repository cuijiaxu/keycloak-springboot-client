package com.brt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.BusStation;
import com.brt.entity.Province;
import com.brt.entity.Route;

public interface ProvinceMapper {
	@Select("select * from tb_province")
	@Results({
		@Result(property = "code", column = "code"),
		@Result(property = "name", column = "name"),
		@Result(property = "enname", column = "en_name")
	})
	List<Province> query();	
	
	@Insert("insert into tb_province (code, name, en_name) "
			   + "values (#{code}, #{name}, #{enname})")
		void insert(Province pr);

	@Update("update tb_province set name=#{name}, en_name=#{enname} where code=#{code}")
		void update(Province pr);

	@Delete("delete from tb_province where code = #{code}")
		void delete(int id);	
}
