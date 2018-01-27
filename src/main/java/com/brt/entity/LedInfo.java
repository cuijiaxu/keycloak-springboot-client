package com.brt.entity;

import java.io.Serializable;
import java.util.Date;

public class LedInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long LEDINFOID;
	private String LEDNO;
	private String COMMMODE;
	private String SERIALPORT;
	private String IPADDRESS;
	private String IPPORT;
	private String MANUFACTURERNO;
	private String EQUIPTYPE;
	private String EQUIPSTATUS;
	private Long CREATEUSERID;
	private Date CREATETIME;
	private String OFFLINECONTENT;
	private String NOTIFYCONTENT;
	private String REFRESHSTATUSTIME;
	private String RESOLUTION;
	private String POSITION;
	private String STATIONNO;
	
	public Long getLEDINFOID() {
		return LEDINFOID;
	}
	public void setLEDINFOID(Long lEDINFOID) {
		LEDINFOID = lEDINFOID;
	}
	public String getLEDNO() {
		return LEDNO;
	}
	public void setLEDNO(String lEDNO) {
		LEDNO = lEDNO;
	}
	public String getCOMMMODE() {
		return COMMMODE;
	}
	public void setCOMMMODE(String cOMMMODE) {
		COMMMODE = cOMMMODE;
	}
	public String getSERIALPORT() {
		return SERIALPORT;
	}
	public void setSERIALPORT(String sERIALPORT) {
		SERIALPORT = sERIALPORT;
	}
	public String getIPADDRESS() {
		return IPADDRESS;
	}
	public void setIPADDRESS(String iPADDRESS) {
		IPADDRESS = iPADDRESS;
	}
	public String getIPPORT() {
		return IPPORT;
	}
	public void setIPPORT(String iPPORT) {
		IPPORT = iPPORT;
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
	public Long getCREATEUSERID() {
		return CREATEUSERID;
	}
	public void setCREATEUSERID(Long cREATEUSERID) {
		CREATEUSERID = cREATEUSERID;
	}
	public Date getCREATETIME() {
		return CREATETIME;
	}
	public void setCREATETIME(Date cREATETIME) {
		CREATETIME = cREATETIME;
	}
	public String getOFFLINECONTENT() {
		return OFFLINECONTENT;
	}
	public void setOFFLINECONTENT(String oFFLINECONTENT) {
		OFFLINECONTENT = oFFLINECONTENT;
	}
	public String getNOTIFYCONTENT() {
		return NOTIFYCONTENT;
	}
	public void setNOTIFYCONTENT(String nOTIFYCONTENT) {
		NOTIFYCONTENT = nOTIFYCONTENT;
	}
	public String getREFRESHSTATUSTIME() {
		return REFRESHSTATUSTIME;
	}
	public void setREFRESHSTATUSTIME(String rEFRESHSTATUSTIME) {
		REFRESHSTATUSTIME = rEFRESHSTATUSTIME;
	}
	public String getRESOLUTION() {
		return RESOLUTION;
	}
	public void setRESOLUTION(String rESOLUTION) {
		RESOLUTION = rESOLUTION;
	}
	public String getPOSITION() {
		return POSITION;
	}
	public void setPOSITION(String pOSITION) {
		POSITION = pOSITION;
	}
	public String getSTATIONNO() {
		return STATIONNO;
	}
	public void setSTATIONNO(String sTATIONNO) {
		STATIONNO = sTATIONNO;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}