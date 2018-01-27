package com.brt.entity;
import java.util.Date;

public class TradeData {
	private Integer tradedataid;
	private String organno;
	private String organname;	
	private String lineno;
	private Integer cnt;
	private String stationcode;
	private Date thtime;	
	private String staname;
	
	public Integer getTradedataid() {
		return tradedataid;
	}
	public void setTradedataid(Integer tradedataid) {
		this.tradedataid = tradedataid;
	}
	public String getOrganno() {
		return organno;
	}
	public void setOrganno(String organno) {
		this.organno = organno;
	}
	public String getOrganname() {
		return organname;
	}
	public void setOrganname(String organname) {
		this.organname = organname;
	}
	public String getLineno() {
		return lineno;
	}
	public void setLineno(String lineno) {
		this.lineno = lineno;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	public String getStationcode() {
		return stationcode;
	}
	public void setStationcode(String stationcode) {
		this.stationcode = stationcode;
	}
	public Date getThtime() {
		return thtime;
	}
	public void setThtime(Date thtime) {
		this.thtime = thtime;
	}
	public String getStaname() {
		return staname;
	}
	public void setStaname(String staname) {
		this.staname = staname;
	}
	
}
