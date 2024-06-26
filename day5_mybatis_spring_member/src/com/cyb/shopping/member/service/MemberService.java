package com.cyb.shopping.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cyb.shopping.member.vo.MemberVO;

public interface MemberService {
	public List<MemberVO> listMembers() throws DataAccessException;
	public int addMember(MemberVO memberVO)throws DataAccessException;
	public int removeMember(String id)throws DataAccessException;
	public int updateMember(MemberVO memberVO)throws DataAccessException;
	public MemberVO getMemberById(String Id) throws DataAccessException;
		
}
