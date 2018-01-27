package com.brt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.Station;

public interface StationMapper {
	
	@Select("select * from tb_station")
	@Results({
		@Result(property = "stationid", column = "station_id"),
		@Result(property = "code", column = "code"),
		@Result(property = "name", column = "name"),
		@Result(property = "nameforshort", column = "nameforshort"),
		@Result(property = "obuid", column = "obuid"),
		@Result(property = "parkingarea", column = "parkingarea"),
		@Result(property = "ordernum", column = "ordernum"),
		@Result(property = "type", column = "type"),
		@Result(property = "address", column = "address"),
		@Result(property = "regioncode", column = "regioncode"),
		@Result(property = "streetcode", column = "streetcode"),
		@Result(property = "longitude", column = "longitude"),
		@Result(property = "latitude", column = "latitude"),
		@Result(property = "arrivalradius", column = "arrivalradius"),
		@Result(property = "departureradius", column = "departureradius"),
		@Result(property = "arrivalsoundfilename", column = "arrivalsoundfilename"),
		@Result(property = "arrivalvideofilename", column = "arrivalvideofilename"),
		@Result(property = "departuresoundfilename", column = "departuresoundfilename"),
		@Result(property = "departvideofilename", column = "departvideofilename"),
		@Result(property = "instopledcmd", column = "instopledcmd"),
		@Result(property = "outstopledcmd", column = "outstopledcmd"),
		@Result(property = "status", column = "status"),
		@Result(property = "mileage", column = "mileage"),
		@Result(property = "createtime", column = "createtime")
	})
	List<Station> query();
	
	@Select("select * from tb_station where station_id = #{stationid}")
	@Results({
		@Result(property = "stationid", column = "station_id"),
		@Result(property = "code", column = "code"),
		@Result(property = "name", column = "name"),
		@Result(property = "nameforshort", column = "nameforshort"),
		@Result(property = "obuid", column = "obuid"),
		@Result(property = "parkingarea", column = "parkingarea"),
		@Result(property = "ordernum", column = "ordernum"),
		@Result(property = "type", column = "type"),
		@Result(property = "address", column = "address"),
		@Result(property = "regioncode", column = "regioncode"),
		@Result(property = "streetcode", column = "streetcode"),
		@Result(property = "longitude", column = "longitude"),
		@Result(property = "latitude", column = "latitude"),
		@Result(property = "arrivalradius", column = "arrivalradius"),
		@Result(property = "departureradius", column = "departureradius"),
		@Result(property = "arrivalsoundfilename", column = "arrivalsoundfilename"),
		@Result(property = "arrivalvideofilename", column = "arrivalvideofilename"),
		@Result(property = "departuresoundfilename", column = "departuresoundfilename"),
		@Result(property = "departvideofilename", column = "departvideofilename"),
		@Result(property = "instopledcmd", column = "instopledcmd"),
		@Result(property = "outstopledcmd", column = "outstopledcmd"),
		@Result(property = "status", column = "status"),
		@Result(property = "mileage", column = "mileage"),
		@Result(property = "createtime", column = "createtime")
	})
	Station getById(int stationid);

	@Insert({"<script> insert into tb_station (station_id, code, name, nameforshort, obuid, parkingarea, ordernum, type, address, regioncode, streetcode, longitude, latitude, arrivalradius, departureradius, arrivalsoundfilename, arrivalvideofilename, departuresoundfilename, departvideofilename, instopledcmd, outstopledcmd, status, mileage, createtime) " +
	"values (<choose><when test='createtime != null'> #{stationid} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='code != null'> #{code} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='name != null'> #{name} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='nameforshort != null'> #{nameforshort} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='obuid != null'> #{obuid} </when><otherwise> 0 </otherwise></choose>, " +
	"<choose><when test='parkingarea != null'> #{parkingarea} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='ordernum != null'> #{ordernum} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='type != null'> #{type} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='address != null'> #{address} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='regioncode != null'> #{regioncode} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='streetcode != null'> #{streetcode} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='longitude != null'> #{longitude} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='latitude != null'> #{latitude} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='arrivalradius != null'> #{arrivalradius} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='departureradius != null'> #{departureradius} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='arrivalsoundfilename != null'> #{arrivalsoundfilename} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='arrivalvideofilename != null'> #{arrivalvideofilename} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='departuresoundfilename != null'> #{departuresoundfilename} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='departvideofilename != null'> #{departvideofilename} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='instopledcmd != null'> #{instopledcmd} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='outstopledcmd != null'> #{outstopledcmd} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='status != null'> #{status} </when><otherwise> '' </otherwise></choose>, " +
	"<choose><when test='mileage != null'> #{mileage} </when><otherwise> '' </otherwise></choose>,  " +
	"<choose><when test='createtime != null'> #{createtime} </when><otherwise> '' </otherwise></choose> )</script>"})
	@SelectKey(statement="select seq_tb_station.nextval from dual", keyProperty="stationid", before=true, resultType=int.class)
	void insert(Station st);

	@Update("update tb_station set code=#{code}, name=#{name}, nameforshort=#{nameforshort}, obuid=#{obuid}, parkingarea=#{parkingarea}, ordernum=#{ordernum}, type=#{type}, address=#{address}, regioncode=#{regioncode}, streetcode=#{streetcode}, longitude=#{longitude}, latitude=#{latitude}, arrivalradius=#{arrivalradius}, departureradius=#{departureradius}, "
			+ "arrivalsoundfilename=#{arrivalsoundfilename}, arrivalvideofilename=#{arrivalvideofilename}, departuresoundfilename=#{departuresoundfilename}, departvideofilename=#{departvideofilename}, instopledcmd=#{instopledcmd}, outstopledcmd=#{outstopledcmd}, status=#{status}, mileage=#{mileage}, createtime=#{createtime} where station_id=#{stationid}")
	void update(Station st);

	@Delete("delete from tb_station where station_id = #{stationid}")
	void delete(int stationid);
	
}

