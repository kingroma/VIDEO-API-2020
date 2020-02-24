package com.mydefault.app.content.service;

import com.mydefault.app.common.util.CommonVO;

public class ContentVO extends CommonVO{
	private static final long serialVersionUID = 1L;
	
	private String userId = "";
	
	private String contentId = "";
	
	private String parentContentId = "";
	
	private String videoId = "";
	
	private String contentNm = "";
	
	private String sortSn = "";
	
	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getParentContentId() {
		return parentContentId;
	}

	public void setParentContentId(String parentContentId) {
		this.parentContentId = parentContentId;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getContentNm() {
		return contentNm;
	}

	public void setContentNm(String contentNm) {
		this.contentNm = contentNm;
	}

	public String getSortSn() {
		return sortSn;
	}

	public void setSortSn(String sortSn) {
		this.sortSn = sortSn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
