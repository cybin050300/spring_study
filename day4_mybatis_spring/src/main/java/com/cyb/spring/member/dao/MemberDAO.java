package com.cyb.spring.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cyb.spring.member.vo.MemberVO;

public interface MemberDAO {
	public List<MemberVO> selectAllMemberList() throws DataAccessException;
	public int insertMember(MemberVO memberVO) throws DataAccessException;
	public int deleteMember(String id)throws DataAccessException;
	public MemberVO selectMemberById(String id)throws DataAccessException;
}
