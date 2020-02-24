package com.mydefault.app.content.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mydefault.app.common.util.MyMap;
import com.mydefault.app.content.dto.ContentApiBodyListDTO;
import com.mydefault.app.content.service.ContentService;
import com.mydefault.app.content.service.ContentVO;
import com.mydefault.app.generic.serviceimpl.GenericServiceImpl;
import com.mydefault.app.video.serviceimpl.VideoServiceImpl;

@Service
public class ContentServiceImpl extends GenericServiceImpl<ContentVO,ContentMapper> implements ContentService{
	protected static final Logger logger = LoggerFactory.getLogger(VideoServiceImpl.class);
	
	public ContentServiceImpl(){
		super(ContentMapper.class);
	}
	
	@Override
	public List<ContentApiBodyListDTO> bodyList() throws Exception {
		List<ContentApiBodyListDTO> result = new ArrayList<ContentApiBodyListDTO>();
		
		ContentVO entity = new ContentVO();
		List<MyMap> listParent = mapper.listBodyParent();
		for ( MyMap p : listParent ){
			String contentId = (String)p.get("contentId");
			String contentNm = (String)p.get("contentNm");
			String sortSn = (String)p.get("sortSn");
			
			ContentApiBodyListDTO dto = new ContentApiBodyListDTO();
			dto.setContentId(contentId);
			dto.setContentNm(contentNm);
			dto.setSortSn(sortSn);
			
			entity.setParentContentId(contentId);
			
			dto.setChild(mapper.listBodyChild(entity));
			result.add(dto);
		}
		
		return result;
	}

	public List<MyMap> recommandList() throws Exception{
		List<MyMap> listCommand = mapper.listRecommand();
		return listCommand;
	}

	@Override
	public List<MyMap> headList() throws Exception {
		List<MyMap> listParent = mapper.listHeadChild();
		return listParent;
	}
	
	@Override
	public List<MyMap> myRecentList(ContentVO entity) throws Exception {
		List<MyMap> myrecent = mapper.myRecentList(entity);
		return myrecent;
	}
}
