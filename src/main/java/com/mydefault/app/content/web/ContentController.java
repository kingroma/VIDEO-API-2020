package com.mydefault.app.content.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mydefault.app.common.util.GenericCode;
import com.mydefault.app.common.util.MyMap;
import com.mydefault.app.common.util.StringUtil;
import com.mydefault.app.content.dto.ContentApiBodyListDTO;
import com.mydefault.app.content.service.ContentService;
import com.mydefault.app.content.service.ContentVO;
import com.mydefault.app.generic.web.GenericController;

@Controller
@RequestMapping("/content/*")
public class ContentController extends GenericController<ContentVO,ContentService>{
	protected static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	
	protected ContentController(){
		super(ContentVO.class,ContentService.class);
	}
	
	// http://localhost:8680/app/content/api/head/list.do
	@RequestMapping(value = "/api/head/list.do")
	public ModelAndView apiHeadList(ContentVO entity, HttpServletRequest request, ModelMap model) throws Exception {
		try {
			List<MyMap> list = service.headList();
			model.addAttribute("list", list);
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
		}
		model.addAttribute(GenericCode.RESULT_KEY,GenericCode.SUCCESS_CODE);
		model.remove("contentVO");
		
		return new ModelAndView("jsonView", model);
	}
	
	// http://localhost:8680/app/content/api/recommand/list.do
	@RequestMapping(value = "/api/recommand/list.do")
	public ModelAndView apiRecommandList(ContentVO entity, HttpServletRequest request, ModelMap model) throws Exception {
		try {
			List<MyMap> list = service.recommandList();
			model.addAttribute("list", list);
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
		}
		model.addAttribute(GenericCode.RESULT_KEY,GenericCode.SUCCESS_CODE);
		model.remove("contentVO");
		
		return new ModelAndView("jsonView", model);
	}

	// http://localhost:8680/app/content/api/body/list.do
	@RequestMapping(value = "/api/body/list.do")
	public ModelAndView apiBodyList(ContentVO entity, HttpServletRequest request, ModelMap model) throws Exception {
		try {
			List<ContentApiBodyListDTO> list = service.bodyList();
			model.addAttribute("list", list);
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
		}
		model.addAttribute(GenericCode.RESULT_KEY,GenericCode.SUCCESS_CODE);
		model.remove("contentVO");
		
		return new ModelAndView("jsonView", model);
	}
			
	// http://localhost:8680/app/content/api/myrecent/list.do
	@RequestMapping(value = "/api/myrecent/list.do")
	public ModelAndView apiMyRecentList(ContentVO entity, HttpServletRequest request, ModelMap model) throws Exception {
		try {
			List<MyMap> list = service.myRecentList(entity);
			model.addAttribute("list", list);
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
		}
		model.addAttribute(GenericCode.RESULT_KEY,GenericCode.SUCCESS_CODE);
		model.remove("contentVO");
		
		return new ModelAndView("jsonView", model);
	}
}
