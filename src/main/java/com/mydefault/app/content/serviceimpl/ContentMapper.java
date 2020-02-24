package com.mydefault.app.content.serviceimpl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mydefault.app.common.util.MyMap;
import com.mydefault.app.content.service.ContentVO;
import com.mydefault.app.generic.serviceimpl.GenericMapper;

@Mapper
public interface ContentMapper extends GenericMapper<ContentVO>{
	public List<MyMap> listHeadChild() throws Exception;
	
	public List<MyMap> listRecommand() throws Exception;
	
	public List<MyMap> listBodyParent() throws Exception;
	
	public List<MyMap> listBodyChild(ContentVO entity) throws Exception;
	
	public List<MyMap> myRecentList(ContentVO entity) throws Exception ;
	
}
