package com.brt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.Route;

public interface RouteMapper {
	
	@Select("select * from tb_route")
	@Results({
		@Result(property = "routeid", column = "route_id"),
		@Result(property = "routecode", column = "routecode"),
		@Result(property = "companyid", column = "companyid"),
		@Result(property = "routeflag", column = "routeflag"),
		@Result(property = "deleted", column = "deleted"),
		@Result(property = "useful", column = "useful"),
		@Result(property = "busnummin", column = "busnummin"),
		@Result(property = "busnumeffect", column = "busnumeffect"),
		@Result(property = "tripnum", column = "tripnum"),
		@Result(property = "createtime", column = "createtime")
	})
	List<Route> query();
	
	@Select("select * from tb_route where route_id = #{routeid}")
	@Results({
		@Result(property = "routeid", column = "route_id"),
		@Result(property = "routecode", column = "routecode"),
		@Result(property = "companyid", column = "companyid"),
		@Result(property = "routeflag", column = "routeflag"),
		@Result(property = "deleted", column = "deleted"),
		@Result(property = "useful", column = "useful"),
		@Result(property = "busnummin", column = "busnummin"),
		@Result(property = "busnumeffect", column = "busnumeffect"),
		@Result(property = "tripnum", column = "tripnum"),
		@Result(property = "createtime", column = "createtime")
	})
	Route getById(int routeid);

	@Insert("insert into tb_route (route_id, routecode, companyid, routeflag, deleted, useful, busnummin, busnumeffect, tripnum, createtime) "
		   + "values (#{routeid}, #{routecode}, #{companyid}, #{routeflag}, #{deleted}, #{useful}, #{busnummin}, #{busnumeffect}, #{tripnum}, #{createtime})")
	void insert(Route rt);

	@Update("update tb_route set routecode=#{routecode}, companyid=#{companyid}, routeflag=#{routeflag}, deleted=#{deleted}, useful=#{useful}, busnummin=#{busnummin}, busnumeffect=#{busnumeffect}, tripnum=#{tripnum}, createtime=#{createtime} where route_id=#{routeid}")
	void update(Route rt);

	@Delete("delete from tb_route where route_id = #{routeid}")
	void delete(int routeid);
	
}

