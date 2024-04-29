package com.cyb.spring.todo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cyb.spring.todo.vo.TodoVO;

@Repository("todoDAO")
public class TodoDAOImpl implements TodoDAO {

	@Autowired
	private SqlSession sqlSession;

	public TodoDAOImpl() {

	}

	@Override
	public List selectAllTodoList() throws DataAccessException {
		List<TodoVO> todoList = null;
		todoList = sqlSession.selectList("mapper.todo.selectAllTodoList");
		return todoList;

	}

	@Override
	public int insertTodo(TodoVO todo) throws DataAccessException {
		int result = sqlSession.insert("mapper.todo.inserTodo", todo);
		return result;

	}

	@Override
	public int deleteTodo(String id) throws DataAccessException {
		int result = sqlSession.insert("mapper.todo.deleteTodo", id);
		return result;

	}

}
