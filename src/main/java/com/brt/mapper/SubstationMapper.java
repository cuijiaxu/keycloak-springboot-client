package com.brt.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;

import com.brt.entity.Substation;

public interface SubstationMapper {
	@Insert({"<script> insert into tb_substation (SUBSTATION_ID,STATIONCODE, name, LONGITUDE, LATITUDE, createtime) "
			   + "values (#{substationid}, #{stationcode}, #{name}, #{longitude}, #{latitude}, <choose><when test='createtime != null'> #{createtime} </when><otherwise> '' </otherwise></choose> )</script>"})
	@SelectKey(statement="select seq_tb_station.nextval from dual", keyProperty="substationid", before=true, resultType=int.class)
	void insert(Substation sub);
}
