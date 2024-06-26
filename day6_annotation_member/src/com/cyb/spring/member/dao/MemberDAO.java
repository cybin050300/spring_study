package com.cyb.spring.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cyb.spring.member.vo.MemberVO;

public interface MemberDAO {
	public List selectAllMemberList() throws DataAccessException;
	public int inserMember(MemberVO memberVO) throws DataAccessException;
	public int deleteMember(String id) throws DataAccessException;

}
