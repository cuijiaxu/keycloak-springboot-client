package com.brt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.BusStation;

public interface BusStationMapper {
	
	@Select("select * from tb_busstation")
	@Results({
		@Result(property = "busstationid", column = "busstation_id"),
		@Result(property = "stopcode", column = "stopcode"),
		@Result(property = "ordernumber", column = "ordernumber"),
		@Result(property = "stopname", column = "stopname"),
		@Result(property = "nameforshort", column = "nameforshort"),
		@Result(property = "stoptype", column = "stoptype"),
		@Result(property = "longitude", column = "longitude"),
		@Result(property = "latitude", column = "latitude")
	})
	List<BusStation> query();
	
	@Select("select * from tb_busstation where busstation_id = #{busstationid}")
	@Results({
		@Result(property = "stopname", column = "stopname")
	})
	BusStation getById(int busstationid);

	@Insert("insert into tb_busstation (busstation_id, stopcode, ordernumber, stopname, nameforshort, stoptype, longitude, latitude) "
		   + "values (#{busstationid}, #{stopcode}, #{ordernumber}, #{stopname}, #{nameforshort}, #{stoptype}, #{longitude}, #{latitude})")
	void insert(BusStation bs);

	@Update("update tb_busstation set stopcode=#{stopcode}, ordernumber=#{ordernumber}, stopname=#{stopname}, nameforshort=#{nameforshort}, "
		   + "stoptype=#{stoptype}, longitude=#{longitude}, latitude=#{latitude} where busstation_id=#{busstationid}")
	void update(BusStation bs);

	@Delete("delete from tb_busstation where busstation_id = #{busstationid}")
	void delete(int busstationid);
	
}

