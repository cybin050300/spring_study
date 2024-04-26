package com.cyb.spring.member.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cyb.spring.member.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public MemberDAOImpl() {
	}

	@Override
	public List<MemberVO> selectAllMemberList() throws DataAccessException {

		List<MemberVO> membersList = new ArrayList<MemberVO>();
		membersList = this.sqlSession.selectList("mapper.member.selectAllMemberList");
		return membersList;
	}

	@Override
	public int insertMember(MemberVO memberVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.member.insertMember",memberVO);
		
		return result;
	}

	@Override
	public int deleteMember(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVO selectMemberById(String id) throws DataAccessException {
		System.out.println("MemberDAO id : " + id);
		MemberVO memberVO = (MemberVO) sqlSession.selectOne("mapper.member.selectMemberById", id);
		System.out.println("memberDAO : " + memberVO);
		return memberVO;
	}
}
