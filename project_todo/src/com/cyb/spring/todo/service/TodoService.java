package com.cyb.spring.todo.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cyb.spring.todo.vo.TodoVO;

public interface TodoService {
	public List<TodoVO> listTodo() throws DataAccessException;
	public int addTodo(TodoVO todoVO)throws DataAccessException;
	public int updateTodo(TodoVO todoVO)throws DataAccessException;
	public int removeTodo(String id)throws DataAccessException;
	}
