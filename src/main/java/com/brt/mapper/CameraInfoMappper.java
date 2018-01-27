package com.brt.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.CameraInfo;

public interface CameraInfoMappper {
	@Select("select * from TB_CAMERAINFO ")
	@Results({
		@Result(property = "CAMERAINFOID", column = "CAMERAINFOID"),
		@Result(property = "CAMERAID", column = "CAMERAID"),
		@Result(property = "CAMERANAME", column = "CAMERANAME"),
		@Result(property = "SITEID", column = "SITEID"),	
		@Result(property = "CAMERAIP", column = "CAMERAIP"),
		@Result(property = "CAMERAPORT", column = "CAMERAPORT"),
		@Result(property = "ACCESSUSER", column = "ACCESSUSER"),
		@Result(property = "ACCESSPWD", column = "ACCESSPWD"),			
		@Result(property = "URI_CTRL", column = "URI_CTRL"),
		@Result(property = "URI_STREAM", column = "URI_STREAM"),
		@Result(property = "XPOSITION", column = "XPOSITION"),
		@Result(property = "YPOSITION", column = "YPOSITION"),		
		@Result(property = "DIRECTIONID", column = "DIRECTIONID"),
		@Result(property = "CTRLCHANNEL", column = "CTRLCHANNEL"),
		@Result(property = "MANUFACTURERNO", column = "MANUFACTURERNO"),
		@Result(property = "CREATETIME", column = "CREATETIME"),			
		@Result(property = "CREATEUSER", column = "CREATEUSER")				
	})
	List<CameraInfo> query();

	@Insert("insert into tb_city (code, name, parent_code,en_name) "
			   + "values (#{code}, #{name},#{parentcode}, #{enname})")
		void insert(CameraInfo cam);

	@Update("update tb_city set name=#{name}, parent_code=#{parentcode},en_name=#{enname} where code=#{code}")
		void update(CameraInfo cam);

	@Delete("delete from tb_city where code = #{code}")
		void delete(int id);		
}
