package com.brt.entity;

import java.io.Serializable;
import java.util.Date;

public class StationPlatForm implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String region;
	private String street;
	private String stationname;
	private String direction;
	private Double longitude;
	private Double latitude;
	private Long arrivalradius;
	private Long departureradius;
	private String stationtatus;
	private String stationtype;
	private String draftsman;
	private Date drafttime;
	private String auditman;
	private Date audittime;
	private String voice;
	private Long stationid;
	private Long stationno;
	private String shortname;
	private Long substationid;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStationname() {
		return stationname;
	}
	public void setStationname(String stationname) {
		this.stationname = stationname;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Long getArrivalradius() {
		return arrivalradius;
	}
	public void setArrivalradius(Long arrivalradius) {
		this.arrivalradius = arrivalradius;
	}
	public Long getDepartureradius() {
		return departureradius;
	}
	public void setDepartureradius(Long departureradius) {
		this.departureradius = departureradius;
	}
	public String getStationtatus() {
		return stationtatus;
	}
	public void setStationtatus(String stationtatus) {
		this.stationtatus = stationtatus;
	}
	public String getStationtype() {
		return stationtype;
	}
	public void setStationtype(String stationtype) {
		this.stationtype = stationtype;
	}
	public String getDraftsman() {
		return draftsman;
	}
	public void setDraftsman(String draftsman) {
		this.draftsman = draftsman;
	}
	public Date getDrafttime() {
		return drafttime;
	}
	public void setDrafttime(Date drafttime) {
		this.drafttime = drafttime;
	}
	public String getAuditman() {
		return auditman;
	}
	public void setAuditman(String auditman) {
		this.auditman = auditman;
	}
	public Date getAudittime() {
		return audittime;
	}
	public void setAudittime(Date audittime) {
		this.audittime = audittime;
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	public Long getStationid() {
		return stationid;
	}
	public void setStationid(Long stationid) {
		this.stationid = stationid;
	}
	public Long getStationno() {
		return stationno;
	}
	public void setStationno(Long stationno) {
		this.stationno = stationno;
	}
	public String getShortname() {
		return shortname;
	}
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	public Long getSubstationid() {
		return substationid;
	}
	public void setSubstationid(Long substationid) {
		this.substationid = substationid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}