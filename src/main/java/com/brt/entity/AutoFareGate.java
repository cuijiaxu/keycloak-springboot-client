package com.brt.entity;

import java.io.Serializable;
import java.util.Date;

public class AutoFareGate implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long AUTOGATESTATIONID;
	private String ORGANNO;
	private String AUTOFAREGATENO;
	private String AUTOFAREGATEIP;
	private Long AUTOFAREGATEPORT;
	private String ACQUISTOPSID;
	private String ITEMCODE;
	private String AUTOGATEPOSINFO;
	private String MANUFACTURERNO;
	private String EQUIPTYPE;
	private String READER_NO;
	
	public Long getAUTOGATESTATIONID() {
		return AUTOGATESTATIONID;
	}
	public void setAUTOGATESTATIONID(Long aUTOGATESTATIONID) {
		AUTOGATESTATIONID = aUTOGATESTATIONID;
	}
	public String getORGANNO() {
		return ORGANNO;
	}
	public void setORGANNO(String oRGANNO) {
		ORGANNO = oRGANNO;
	}
	public String getAUTOFAREGATENO() {
		return AUTOFAREGATENO;
	}
	public void setAUTOFAREGATENO(String aUTOFAREGATENO) {
		AUTOFAREGATENO = aUTOFAREGATENO;
	}
	public String getAUTOFAREGATEIP() {
		return AUTOFAREGATEIP;
	}
	public void setAUTOFAREGATEIP(String aUTOFAREGATEIP) {
		AUTOFAREGATEIP = aUTOFAREGATEIP;
	}
	public Long getAUTOFAREGATEPORT() {
		return AUTOFAREGATEPORT;
	}
	public void setAUTOFAREGATEPORT(Long aUTOFAREGATEPORT) {
		AUTOFAREGATEPORT = aUTOFAREGATEPORT;
	}
	public String getACQUISTOPSID() {
		return ACQUISTOPSID;
	}
	public void setACQUISTOPSID(String aCQUISTOPSID) {
		ACQUISTOPSID = aCQUISTOPSID;
	}
	public String getITEMCODE() {
		return ITEMCODE;
	}
	public void setITEMCODE(String iTEMCODE) {
		ITEMCODE = iTEMCODE;
	}
	public String getAUTOGATEPOSINFO() {
		return AUTOGATEPOSINFO;
	}
	public void setAUTOGATEPOSINFO(String aUTOGATEPOSINFO) {
		AUTOGATEPOSINFO = aUTOGATEPOSINFO;
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
	public String getREADER_NO() {
		return READER_NO;
	}
	public void setREADER_NO(String rEADER_NO) {
		READER_NO = rEADER_NO;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
}