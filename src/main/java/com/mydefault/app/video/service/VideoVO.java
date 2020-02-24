package com.mydefault.app.video.service;

import com.mydefault.app.common.util.CommonVO;

public class VideoVO extends CommonVO{
	private static final long serialVersionUID = 1L;
	
	private String videoId = "";
	
	private String parentVideoId = "" ; 
	
	private String videoTypeCode ;
	
	private String videoNm = "";
	
	private String videoExplain = "";
	
	private String videoActor = ""; 
	
	private String videoPath = "";
	
	private String useAt = "";
	
	private String delAt = "";
	
	private String parentFlag = "";

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getParentVideoId() {
		return parentVideoId;
	}

	public void setParentVideoId(String parentVideoId) {
		this.parentVideoId = parentVideoId;
	}

	public String getVideoTypeCode() {
		return videoTypeCode;
	}

	public void setVideoTypeCode(String videoTypeCode) {
		this.videoTypeCode = videoTypeCode;
	}

	public String getVideoActor() {
		return videoActor;
	}

	public void setVideoActor(String videoActor) {
		this.videoActor = videoActor;
	}

	public String getVideoPath() {
		return videoPath;
	}

	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}

	public String getVideoNm() {
		return videoNm;
	}

	public void setVideoNm(String videoNm) {
		this.videoNm = videoNm;
	}

	public String getUseAt() {
		return useAt;
	}

	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}

	public String getDelAt() {
		return delAt;
	}

	public void setDelAt(String delAt) {
		this.delAt = delAt;
	}

	public String getVideoExplain() {
		return videoExplain;
	}

	public void setVideoExplain(String videoExplain) {
		this.videoExplain = videoExplain;
	}

	public String getParentFlag() {
		return parentFlag;
	}

	public void setParentFlag(String parentFlag) {
		this.parentFlag = parentFlag;
	}
	
	
}
