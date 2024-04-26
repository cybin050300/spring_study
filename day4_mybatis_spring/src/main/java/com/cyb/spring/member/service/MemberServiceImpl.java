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
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<MemberVO> listMembers() throws DataAccessException {
		List<MemberVO> membersList = null;
		membersList = memberDAO.selectAllMemberList();
		return membersList;
	}

	@Override
	public int addMember(MemberVO memberVO) throws DataAccessException {
		int result = memberDAO.insertMember(memberVO);
		return result;
	}

	@Override
	public int removeMember(String id) throws DataAccessException {
		int result = memberDAO.deleteMember(id);
		return result;
	}

	@Override
	public MemberVO selectMemberById(String id) throws DataAccessException {
		
		return memberDAO.selectMemberById(id);
	}

}
