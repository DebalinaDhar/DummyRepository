package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * package model;
 *
 * Copyright (c) 2018 Yodlee Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Yodlee, Inc.
 * Use is subject to license terms.
 *
 * Author @amukhopadhyay
 */

@XmlRootElement
public class NewSiteRequest {

	private String projetName;
	private String owner;
	private String requestStatus;
	private String priority;
	private String locale;
	private String customers;
	private String requestId;
	private String requestName;
	private String sr;
	private String bugID;
	private String baseUrl;
	private String loginUrl;
	private String container;
	private String sumInfoId;
	private String displayName;
	private String nsrToolStatus;
	private String description;
	private String createdBy;
	private String changedBy;
	private String createDate;
	private String changeDate;
	private String resolutionDetails;
	private String reqCreatedEmailid;
	private String prioritizedMonthYear;
	private String reqOwnerMailID;


	public String getProjetName() {
		return projetName;
	}
	
	@XmlElement
	public void setProjetName(String projetName) {
		this.projetName = projetName;
	}
	public String getOwner() {
		return owner;
	}
	@XmlElement
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getRequestStatus() {
		return requestStatus;
	}
	@XmlElement
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	public String getPriority() {
		return priority;
	}
	@XmlElement
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getLocale() {
		return locale;
	}
	@XmlElement
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getCustomers() {
		return customers;
	}
	@XmlElement
	public void setCustomers(String customers) {
		this.customers = customers;
	}
	public String getRequestId() {
		return requestId;
	}
	@XmlElement
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestName() {
		return requestName;
	}
	@XmlElement
	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}
	public String getSr() {
		return sr;
	}
	@XmlElement
	public void setSr(String sr) {
		this.sr = sr;
	}
	public String getBugID() {
		return bugID;
	}
	@XmlElement
	public void setBugID(String bugID) {
		this.bugID = bugID;
	}
	public String getBaseUrl() {
		return baseUrl;
	}
	@XmlElement
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	public String getLoginUrl() {
		return loginUrl;
	}
	@XmlElement
	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}
	public String getContainer() {
		return container;
	}
	@XmlElement
	public void setContainer(String container) {
		this.container = container;
	}
	public String getSumInfoId() {
		return sumInfoId;
	}
	@XmlElement
	public void setSumInfoId(String sumInfoId) {
		this.sumInfoId = sumInfoId;
	}
	public String getDisplayName() {
		return displayName;
	}
	@XmlElement
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getNsrToolStatus() {
		return nsrToolStatus;
	}
	@XmlElement
	public void setNsrToolStatus(String nsrToolStatus) {
		this.nsrToolStatus = nsrToolStatus;
	}
	public String getDescription() {
		return description;
	}
	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	@XmlElement
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getChangedBy() {
		return changedBy;
	}
	@XmlElement
	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}
	public String getCreateDate() {
		return createDate;
	}
	@XmlElement
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getChangeDate() {
		return changeDate;
	}@XmlElement
	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}
	public String getResolutionDetails() {
		return resolutionDetails;
	}
	@XmlElement
	public void setResolutionDetails(String resolutionDetails) {
		this.resolutionDetails = resolutionDetails;
	}
	public String getReqCreatedEmailid() {
		return reqCreatedEmailid;
	}
	@XmlElement
	public void setReqCreatedEmailid(String reqCreatedEmailid) {
		this.reqCreatedEmailid = reqCreatedEmailid;
	}
	public String getPrioritizedMonthYear() {
		return prioritizedMonthYear;
	}
	@XmlElement
	public void setPrioritizedMonthYear(String prioritizedMonthYear) {
		this.prioritizedMonthYear = prioritizedMonthYear;
	}
	public String getReqOwnerMailID() {
		return reqOwnerMailID;
	}
	@XmlElement
	public void setReqOwnerMailID(String reqOwnerMailID) {
		this.reqOwnerMailID = reqOwnerMailID;
	}
	public NewSiteRequest(String projetName, String owner, String requestStatus, String priority, String locale,
			String customers, String requestId, String requestName, String sr, String bugID, String baseUrl,
			String loginUrl, String container, String sumInfoId, String displayName, String nsrToolStatus,
			String description, String createdBy, String changedBy, String createDate, String changeDate,
			String resolutionDetails, String reqCreatedEmailid, String prioritizedMonthYear, String reqOwnerMailID) {
		super();
		this.projetName = projetName;
		this.owner = owner;
		this.requestStatus = requestStatus;
		this.priority = priority;
		this.locale = locale;
		this.customers = customers;
		this.requestId = requestId;
		this.requestName = requestName;
		this.sr = sr;
		this.bugID = bugID;
		this.baseUrl = baseUrl;
		this.loginUrl = loginUrl;
		this.container = container;
		this.sumInfoId = sumInfoId;
		this.displayName = displayName;
		this.nsrToolStatus = nsrToolStatus;
		this.description = description;
		this.createdBy = createdBy;
		this.changedBy = changedBy;
		this.createDate = createDate;
		this.changeDate = changeDate;
		this.resolutionDetails = resolutionDetails;
		this.reqCreatedEmailid = reqCreatedEmailid;
		this.prioritizedMonthYear = prioritizedMonthYear;
		this.reqOwnerMailID = reqOwnerMailID;
	}
	public NewSiteRequest() {
		super();
	}



}

