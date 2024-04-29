package com.cyb.spring.todo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cyb.spring.todo.service.TodoService;
import com.cyb.spring.todo.vo.TodoVO;

@Controller("todoController")
public class TodoControllerImpl implements TodoController {
	@Autowired
	private TodoService todoService;

	@Autowired
	private TodoVO todoVO;

	@Override
	@RequestMapping(value = "/todo/listTodos.do", method = RequestMethod.GET)
	public ModelAndView listTodo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("listTodo()");
		String viewName = getViewName(request);
		List todosList = todoService.listTodo();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("todosList", todosList);
		return mav;

	}

	@Override
	@RequestMapping(value = "/todo/addTodo.do", method = RequestMethod.POST)
	public ModelAndView addTodo(@ModelAttribute("todo") TodoVO todoVO, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("addTodo()");
		request.setCharacterEncoding("utf-8");
		int result = 0;
		result = todoService.addTodo(todoVO);
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView("redirect:/todo/listTodos.do");
		return mav;
	}

	public TodoControllerImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@RequestMapping(value = "/todo/removeTodo.do", method = RequestMethod.GET)
	public ModelAndView removeTodo(@RequestParam("id") String id, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		todoService.removeTodo(id);
		ModelAndView mav = new ModelAndView("redirect:/todo/listTodos.do");
		return mav;
	}

	@RequestMapping(value = "/todo/*Form.do", method = RequestMethod.GET)
	public ModelAndView form(HttpServletRequest request, HttpServletResponse response) {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}

	private String getViewName(HttpServletRequest request) {
		String contextPath = request.getContextPath();
		System.out.println("contextPath ==> " + contextPath);
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		System.out.println("uri ==> " + uri);
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}
		System.out.println("uri ==> " + uri);
		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}
		System.out.println("begin ==> " + begin);
		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
			// ?는 파라미터 대응
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}
		System.out.println("end ==> " + end);
		String fileName = uri.substring(begin, end);
		if (fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));
		}
		if (fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
		}
		System.out.println("fileName ==> " + fileName);
		return fileName;

	}


}
