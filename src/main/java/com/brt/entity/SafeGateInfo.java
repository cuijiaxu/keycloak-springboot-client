package com.brt.entity;

import java.io.Serializable;
import java.util.Date;

public class SafeGateInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long SAFEGATEINFOID;
	private String SAFEGATENO;
	private String SAFEGATEIP;
	private Long SAFEGATEPORT;
	private String MANUFACTURERNO;
	private String EQUIPTYPE;
	private String EQUIPSTATUS;
	private String DEFINEID;
	private Date DEFINEDATE;
	private String IPADDRESS;
	
	public Long getSAFEGATEINFOID() {
		return SAFEGATEINFOID;
	}
	public void setSAFEGATEINFOID(Long sAFEGATEINFOID) {
		SAFEGATEINFOID = sAFEGATEINFOID;
	}
	public String getSAFEGATENO() {
		return SAFEGATENO;
	}
	public void setSAFEGATENO(String sAFEGATENO) {
		SAFEGATENO = sAFEGATENO;
	}
	public String getSAFEGATEIP() {
		return SAFEGATEIP;
	}
	public void setSAFEGATEIP(String sAFEGATEIP) {
		SAFEGATEIP = sAFEGATEIP;
	}
	public Long getSAFEGATEPORT() {
		return SAFEGATEPORT;
	}
	public void setSAFEGATEPORT(Long sAFEGATEPORT) {
		SAFEGATEPORT = sAFEGATEPORT;
	}
	public String getMANUFACTURERNO() {
		return MANUFACTURERNO;
	}
	public void setMANUFACTURERNO(String mANUFACTURERNO) {
		MANUFACTURERNO = mANUFACTURERNO;
	}
	public String getEQUIPTYPE() {
		return EQUIPTYPE;
	}
	public void setEQUIPTYPE(String eQUIPTYPE) {
		EQUIPTYPE = eQUIPTYPE;
	}
	public String getEQUIPSTATUS() {
		return EQUIPSTATUS;
	}
	public void setEQUIPSTATUS(String eQUIPSTATUS) {
		EQUIPSTATUS = eQUIPSTATUS;
	}
	public String getDEFINEID() {
		return DEFINEID;
	}
	public void setDEFINEID(String dEFINEID) {
		DEFINEID = dEFINEID;
	}
	public Date getDEFINEDATE() {
		return DEFINEDATE;
	}
	public void setDEFINEDATE(Date dEFINEDATE) {
		DEFINEDATE = dEFINEDATE;
	}
	public String getIPADDRESS() {
		return IPADDRESS;
	}
	public void setIPADDRESS(String iPADDRESS) {
		IPADDRESS = iPADDRESS;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
	
}