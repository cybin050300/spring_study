package com.cyb.spring.article.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.cyb.spring.article.service.ArticleService;
import com.cyb.spring.article.vo.ArticleVO;

public class ArticleControllerImpl extends MultiActionController implements ArticleController {
	
	private ArticleService articleService;
	
	public ArticleControllerImpl() {
		System.out.println("public ArticleControllerImpl()");
	}
	
	// setter로 articleService 빈 주입 
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}


	@Override
	public ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 String viewName = getViewName(request);
		 List<ArticleVO> articlesList = articleService.listArticles();
		 ModelAndView mav = new ModelAndView(viewName);
		 
		 mav.addObject("articlesList",articlesList);
		return mav;
	}
	
	private String getViewName(HttpServletRequest request) throws Exception{
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if(uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}
		
		int begin = 0;
		if(!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}
		
		int end;
		if(uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		}else if (uri.indexOf("?") != -1) {
			end =uri.indexOf("?");
		}else {
			end = uri.length();
		}
		
		String fileName = uri.substring(begin, end);
		if(fileName.indexOf(".")!= -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));
		}
		if(fileName.lastIndexOf("/")!= -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
		}
				System.out.println("fileName: "+fileName);
		
		return fileName;
	}

}	
