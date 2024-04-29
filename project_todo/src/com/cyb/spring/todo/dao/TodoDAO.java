package com.cyb.spring.todo.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cyb.spring.todo.vo.TodoVO;

public interface TodoDAO {
	public List selectAllTodoList() throws DataAccessException;
	public int insertTodo(TodoVO todo) throws DataAccessException;
	public int deleteTodo(String id) throws DataAccessException;


}
