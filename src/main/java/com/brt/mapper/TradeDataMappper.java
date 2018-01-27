package com.brt.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.brt.entity.BusStation;
import com.brt.entity.TradeData;

public interface TradeDataMappper {
	@Select("select * from tb_tradedata")
	@Results({
		@Result(property = "tradedataid", column = "TRADEDATA_ID"),
		@Result(property = "organno", column = "ORGANNO"),
		@Result(property = "organname", column = "ORGANNAME"),
		@Result(property = "lineno", column = "LINENO"),	
		@Result(property = "cnt", column = "CNT"),
		@Result(property = "stationcode", column = "STATIONCODE"),
		@Result(property = "thtime", column = "THTIME"),
		@Result(property = "staname", column = "STANAME")			
	})
	List<TradeData> query();

	@Select("select staname,sum(cnt) cnt from tb_tradedata where substr(stationcode,5,1)='2' and  thtime between to_date(#{begintime,jdbcType=VARCHAR},'yyyy-mm-dd') and to_date(#{endtime,jdbcType=VARCHAR},'yyyy-mm-dd') group by staname")
	@Results({
		@Result(property = "cnt", column = "CNT"),
		@Result(property = "staname", column = "STANAME")
			
	})
	List<TradeData>  queryRcnt(@Param("begintime")String begintime, @Param("endtime")String endtime);
	//@Param("begintime")String begintime, @Param("endtime")String endtime
	
	//@Select("select cnt from tb_tradedata where substr(stationcode,5,1)='2' and  thtime between to_date(#{begintime,jdbcType=VARCHAR},'yyyy-mm-dd') and to_date(#{endtime,jdbcType=VARCHAR},'yyyy-mm-dd')")
	@Select("select staname,sum(cnt) cnt from tb_tradedata where substr(stationcode,5,1)='1' and  thtime between to_date(#{begintime,jdbcType=VARCHAR},'yyyy-mm-dd') and to_date(#{endtime,jdbcType=VARCHAR},'yyyy-mm-dd') group by staname")	
	@Results({
		@Result(property = "cnt", column = "CNT"),
		@Result(property = "staname", column = "STANAME")
			
	})
	List<TradeData>  queryLcnt(@Param("begintime")String begintime, @Param("endtime")String endtime);
	//@Param("begintime")String begintime, @Param("endtime")String endtime
		
}
