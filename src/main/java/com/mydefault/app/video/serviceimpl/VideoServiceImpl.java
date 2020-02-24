package com.mydefault.app.video.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mydefault.app.generic.serviceimpl.GenericServiceImpl;
import com.mydefault.app.video.service.VideoService;
import com.mydefault.app.video.service.VideoVO;

@Service
public class VideoServiceImpl extends GenericServiceImpl<VideoVO,VideoMapper> implements VideoService{
	protected static final Logger logger = LoggerFactory.getLogger(VideoServiceImpl.class);
	
	public VideoServiceImpl(){
		super(VideoMapper.class);
	}
	
	public VideoVO singleInfo(VideoVO entity) throws Exception{
		return mapper.singleInfo(entity);
	}
	
}
