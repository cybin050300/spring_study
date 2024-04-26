package com.cyb.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cyb.spring.member.vo.MemberVO;

public interface MemberService {

	public List<MemberVO> listMembers() throws DataAccessException;
	public int addMember(MemberVO memberVO) throws DataAccessException;
	public int removeMember(String id) throws DataAccessException;	
	public MemberVO selectMemberById(String id) throws DataAccessException;	
}
