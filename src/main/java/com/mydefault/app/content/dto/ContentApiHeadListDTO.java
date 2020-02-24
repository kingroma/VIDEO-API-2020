package com.mydefault.app.content.dto;

import java.util.List;

import com.mydefault.app.common.util.MyMap;

public class ContentApiHeadListDTO {
	private String contentId = null ;

	private String contentNm = null ; 
	
	private String sortSn = null ; 
	
	private List<MyMap> child = null ; 
	
	
	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
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

	public List<MyMap> getChild() {
		return child;
	}

	public void setChild(List<MyMap> child) {
		this.child = child;
	}
}
