package com.cyb.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cyb.spring.member.dao.MemberDAO;
import com.cyb.spring.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {

	private MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public MemberServiceImpl() {
	}

	@Override
	public List<MemberVO> listMembers() throws DataAccessException {
		System.out.println("public List listMembers() throws DataAccessException ");
		List<MemberVO> membersList=null;
		membersList = memberDAO.selectAllMembers();
		return membersList;
	}

}
