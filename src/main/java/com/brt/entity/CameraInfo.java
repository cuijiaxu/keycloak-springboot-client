package com.brt.entity;

import java.util.Date;

public class CameraInfo {
	   private  String      CAMERAINFOID;//'编号';
		 
	   private  String    CAMERAID;//'摄像机编号';
	 
	   private  String    CAMERANAME;//'摄像机名称';
	 
	   private  String	  SITEID;//'地点编码';
	 
	   private  String    CAMERAIP;//'IP地址';
	 
	   private  String    CAMERAPORT;//'端口号';
	 
	   private  String    ACCESSUSER;//'访问用户名';
	 
	   private  String    ACCESSPWD;//'访问密码';
	 
	   private  String    URI_CTRL;//'控制地址';
	 
	   private  String    URI_STREAM;//'流媒体访问地址';
	 
	   private  String    XPOSITION;//'精度';
	 
	   private  String    YPOSITION;//'纬度';
	 
	   private  String    DIRECTIONID;//'方向';
	 
	   private  String    CTRLCHANNEL;//'控制通道';
	 
	   private  String    MANUFACTURERNO;//'厂家';
	 
	   private  Date    CREATETIME;//'创建时间';
	 
	   private  String    CREATEUSER;//'创建员工编码';

	public String getCAMERAINFOID() {
		return CAMERAINFOID;
	}

	public void setCAMERAINFOID(String cAMERAINFOID) {
		CAMERAINFOID = cAMERAINFOID;
	}

	public String getCAMERAID() {
		return CAMERAID;
	}

	public void setCAMERAID(String cAMERAID) {
		CAMERAID = cAMERAID;
	}

	public String getCAMERANAME() {
		return CAMERANAME;
	}

	public void setCAMERANAME(String cAMERANAME) {
		CAMERANAME = cAMERANAME;
	}

	public String getSITEID() {
		return SITEID;
	}

	public void setSITEID(String sITEID) {
		SITEID = sITEID;
	}

	public String getCAMERAIP() {
		return CAMERAIP;
	}

	public void setCAMERAIP(String cAMERAIP) {
		CAMERAIP = cAMERAIP;
	}

	public String getCAMERAPORT() {
		return CAMERAPORT;
	}

	public void setCAMERAPORT(String cAMERAPORT) {
		CAMERAPORT = cAMERAPORT;
	}

	public String getACCESSUSER() {
		return ACCESSUSER;
	}

	public void setACCESSUSER(String aCCESSUSER) {
		ACCESSUSER = aCCESSUSER;
	}

	public String getACCESSPWD() {
		return ACCESSPWD;
	}

	public void setACCESSPWD(String aCCESSPWD) {
		ACCESSPWD = aCCESSPWD;
	}

	public String getURI_CTRL() {
		return URI_CTRL;
	}

	public void setURI_CTRL(String uRI_CTRL) {
		URI_CTRL = uRI_CTRL;
	}

	public String getURI_STREAM() {
		return URI_STREAM;
	}

	public void setURI_STREAM(String uRI_STREAM) {
		URI_STREAM = uRI_STREAM;
	}

	public String getXPOSITION() {
		return XPOSITION;
	}

	public void setXPOSITION(String xPOSITION) {
		XPOSITION = xPOSITION;
	}

	public String getYPOSITION() {
		return YPOSITION;
	}

	public void setYPOSITION(String yPOSITION) {
		YPOSITION = yPOSITION;
	}

	public String getDIRECTIONID() {
		return DIRECTIONID;
	}

	public void setDIRECTIONID(String dIRECTIONID) {
		DIRECTIONID = dIRECTIONID;
	}

	public String getCTRLCHANNEL() {
		return CTRLCHANNEL;
	}

	public void setCTRLCHANNEL(String cTRLCHANNEL) {
		CTRLCHANNEL = cTRLCHANNEL;
	}

	public String getMANUFACTURERNO() {
		return MANUFACTURERNO;
	}

	public void setMANUFACTURERNO(String mANUFACTURERNO) {
		MANUFACTURERNO = mANUFACTURERNO;
	}

	public Date getCREATETIME() {
		return CREATETIME;
	}

	public void setCREATETIME(Date cREATETIME) {
		CREATETIME = cREATETIME;
	}

	public String getCREATEUSER() {
		return CREATEUSER;
	}

	public void setCREATEUSER(String cREATEUSER) {
		CREATEUSER = cREATEUSER;
	}
	   
	   
}
