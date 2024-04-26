package com.cyb.shopping.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cyb.shopping.member.dao.MemberDAO;
import com.cyb.shopping.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public MemberServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<MemberVO> listMembers() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addMember(MemberVO memberVO) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeMember(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMember(MemberVO memberVO) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVO getMemberById(String Id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
