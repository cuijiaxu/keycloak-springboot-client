package com.brt.mapper;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.brt.entity.Businfo;

public interface BusinfoMapper {
	@Select("select * from tb_businfo")
	@Results({
		@Result(property = "businfoid", column = "BUSINFO_ID"),
		@Result(property = "companyid", column = "COMPANYID"),
		@Result(property = "busname", column = "BUSNAME"),
		@Result(property = "buscode", column = "BUSCODE"),
		@Result(property = "obuid", column = "OBUID"),
		@Result(property = "oubip", column = "OBUIP"),
		@Result(property = "parkingarea", column = "PARKINGAREA"),
		@Result(property = "routecode", column = "ROUTECODE"),
		@Result(property = "createtime", column = "CREATETIME"),
		@Result(property = "producedate", column = "PRODUCEDATE"),
		@Result(property = "status", column = "STATUS"),
		@Result(property = "allowupload", column = "ALLOWUPLOAD"),
		@Result(property = "allowdownload", column = "ALLOWDOWNLOAD"),
		@Result(property = "numberplate", column = "NUMBERPLATE"),
		@Result(property = "draftsman", column = "DRAFTSMAN"),
		@Result(property = "drafttime", column = "DRAFTTIME"),	
		@Result(property = "audtiman", column = "AUDITMAN"),
		@Result(property = "audittime", column = "AUDITTIME"),
		@Result(property = "auditresult", column = "AUDITRESULT"),
		@Result(property = "model", column = "MODEL"),
		@Result(property = "simno", column = "SIMNO"),
		@Result(property = "deviceno", column = "DEVICENO")	
	})
	List<Businfo> query();
	
	@Select("select * from tb_businfo where BUSINFO_ID = #{businfoid}")
	@Results({
		@Result(property = "busname", column = "busname")
	})
	Businfo getById(int businfoid);

	@Insert("insert into tb_businfo (BUSINFO_ID, COMPANYID, BUSNAME, BUSCODE, OBUID, OBUIP, PARKINGAREA, ROUTECODE,CREATETIME,PRODUCEDATE,STATUS,ALLOWUPLOAD,ALLOWDOWNLOAD,NUMBERPLATE,DRAFTSMAN,DRAFTTIME,AUDITMAN,AUDITTIME,AUDITRESULT,MODEL,SIMNO,DEVICENO) "
		   + "values (#{businfoid}, #{companyid}, #{busname}, #{buscode}, #{obuid}, #{oubip}, #{parkingarea}, #{routecode},#{createtime}, #{producedate}, #{status}, #{allowupload}, #{allowdownload}, #{numberplate}, #{draftsman}, #{drafttime},#{audtiman}, #{audittime}, #{auditresult}, #{model}, #{simno}, #{deviceno})")
	void insert(Businfo bs);

	@Update("update tb_businfo set BUSINFO_ID=#{businfoid}, COMPANYID=#{companyid}, BUSNAME=#{busname}, BUSCODE=#{buscode}, OBUID=#{obuid}, OBUIP=#{oubip}, PARKINGAREA=#{parkingarea}, ROUTECODE=#{routecode},CREATETIME=#{createtime}, PRODUCEDATE=#{producedate}, STATUS=#{status}, ALLOWUPLOAD=#{allowupload}, ALLOWDOWNLOAD=#{allowdownload}, NUMBERPLATE=#{numberplate}, DRAFTSMAN=#{draftsman}, DRAFTTIME=#{drafttime},"
		   + "AUDITMAN=#{audtiman}, AUDITTIME=#{audittime}, AUDITRESULT=#{auditresult},MODEL=#{model}, SIMNO=#{simno}, DEVICENO=#{deviceno} where BUSINFO_ID = #{businfoid}")
	void update(Businfo bs);

	@Delete("delete from tb_businfo where BUSINFO_ID = #{businfoid}")
	void delete(int businfoid);
}
