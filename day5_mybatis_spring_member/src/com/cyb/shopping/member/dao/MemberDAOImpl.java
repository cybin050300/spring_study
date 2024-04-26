package com.cyb.shopping.member.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

import com.cyb.shopping.member.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public MemberDAOImpl() {
	}

	@Override
	public List<MemberVO> selectAllMemberList() throws DataAccessException {
		
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		memberList = this.sqlSession.selectList("mapper.member.selectAllMemberList");
		
		return null;
	}

	@Override
	public int insertMember(MemberVO memberVO) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMember(MemberVO memberVO) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public MemberVO selectMemberById(String Id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
