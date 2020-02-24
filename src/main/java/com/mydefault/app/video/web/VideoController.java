package com.mydefault.app.video.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mydefault.app.common.util.StringUtil;
import com.mydefault.app.generic.web.GenericController;
import com.mydefault.app.video.service.VideoService;
import com.mydefault.app.video.service.VideoVO;

@Controller
@RequestMapping("/video/*")
public class VideoController extends GenericController<VideoVO,VideoService>{
	protected static final Logger logger = LoggerFactory.getLogger(VideoController.class);
	
	protected VideoController(){
		super(VideoVO.class,VideoService.class);
	}
	
	// http://localhost:8680/app/video/api/list.do
	@RequestMapping(value = "/api/list.do" )
	public ModelAndView apiList(VideoVO entity, HttpServletRequest request, ModelMap model) throws Exception {
		try { 
			List<?> list = service.list(entity);			
			model.addAttribute("list", list);
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
		}
		return new ModelAndView("jsonView", model);
	}
	
	// http://localhost:8680/app/video/api/single/info.do?videoId=VIDEO_00001
	@RequestMapping(value = "/api/single/info.do" )
	public ModelAndView apiInfo(VideoVO entity, HttpServletRequest request, ModelMap model) throws Exception {
		try { 
			entity = service.singleInfo(entity);
			model.remove("videoVO");
			model.addAttribute("entity", entity);
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
		}
		return new ModelAndView("jsonView", model);
	}
}
