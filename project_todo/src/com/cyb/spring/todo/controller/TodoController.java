package com.cyb.spring.todo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cyb.spring.todo.vo.TodoVO;

public interface TodoController {
	public ModelAndView listTodo(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView addTodo(@RequestParam("info") TodoVO todoVO, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	public ModelAndView removeTodo(@RequestParam("id") String id, HttpServletRequest request,
			HttpServletResponse response) throws Exception;




}
