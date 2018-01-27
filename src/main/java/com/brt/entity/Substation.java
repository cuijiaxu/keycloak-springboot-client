package com.brt.entity;

import java.util.Date;

//-- Create table
//create table TB_SUBSTATION
//(
//  SUBSTATION_ID NUMBER(11) not null,
//  STATIONCODE   VARCHAR2(255) not null,
//  NAME          VARCHAR2(255) not null,
//  LONGITUDE     VARCHAR2(255) not null,
//  LATITUDE      VARCHAR2(255) not null,
//  CREATETIME    DATE
//)

public class Substation {
	private Integer substationid;
	private String stationcode;
	private String name;
	private String longitude;
	private String latitude;
	private Date createtime;
	
	public Integer getSubstationid() {
		return substationid;
	}
	public void setSubstationid(Integer substationid) {
		this.substationid = substationid;
	}
	public String getStationcode() {
		return stationcode;
	}
	public void setStationcode(String stationcode) {
		this.stationcode = stationcode;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
}
