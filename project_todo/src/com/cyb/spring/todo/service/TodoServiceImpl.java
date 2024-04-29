package com.cyb.spring.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cyb.spring.todo.dao.TodoDAO;
import com.cyb.spring.todo.vo.TodoVO;

@Service("todoService")
@Transactional(propagation = Propagation.REQUIRED)
public class TodoServiceImpl implements TodoService {
	@Autowired
	private TodoDAO todoDAO;


	public TodoServiceImpl() {
	}


	@Override
	public int addTodo(TodoVO todoVO) throws DataAccessException {
	return todoDAO.insertTodo(todoVO);
	}

	@Override
	public int removeTodo(String id) throws DataAccessException {
		return todoDAO.deleteTodo(id);
	}

	@Override
	public List<TodoVO> listTodo() throws DataAccessException {
		List todosList = null;
		todosList = todoDAO.selectAllTodoList();
		return todosList;
	}

	@Override
	public int updateTodo(TodoVO member) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}


}
