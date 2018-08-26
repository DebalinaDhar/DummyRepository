package model;
/**
* package model;
*
* Copyright (c) 2018 Yodlee Inc. All Rights Reserved.
*
* This software is the confidential and proprietary information of Yodlee, Inc.
* Use is subject to license terms.
*
* Author @kmuralidhar
*/
public class Csid {

	private String csid;
	private String container;
	private String agentName;
	private String isReady;
	private String isBeta;
	private String mfaType;
	
	public Csid(String csid,String container,
			String agentName,String isReady,String isBeta,String mfaType){
		
		super();
		this.setCsid(csid);
		this.setContainer(container);
		this.setAgentName(agentName);
		this.setIsReady(isReady);
		this.setIsBeta(isBeta);
		this.setMfaType(mfaType);
		
	}
	
	public String getCsid() {
		return csid;
	}
	public void setCsid(String csid) {
		this.csid = csid;
	}
	public String getContainer() {
		return container;
	}
	public void setContainer(String container) {
		this.container = container;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getIsReady() {
		return isReady;
	}
	public void setIsReady(String isReady) {
		this.isReady = isReady;
	}
	public String getIsBeta() {
		return isBeta;
	}
	public void setIsBeta(String isBeta) {
		this.isBeta = isBeta;
	}
	public String getMfaType() {
		return mfaType;
	}
	public void setMfaType(String mfaType) {
		this.mfaType = mfaType;
	}
}

