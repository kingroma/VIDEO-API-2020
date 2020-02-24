package com.mydefault.app.content.service;

import java.util.List;

import com.mydefault.app.common.util.MyMap;
import com.mydefault.app.content.dto.ContentApiBodyListDTO;
import com.mydefault.app.content.serviceimpl.ContentMapper;
import com.mydefault.app.generic.service.GenericService;

public interface ContentService extends GenericService<ContentVO,ContentMapper>{
	public List<MyMap> headList() throws Exception;
	
	public List<MyMap> recommandList() throws Exception;
	
	public List<MyMap> myRecentList(ContentVO entity) throws Exception;
	
	public List<ContentApiBodyListDTO> bodyList() throws Exception;
	
}
