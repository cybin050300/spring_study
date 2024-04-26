package com.cyb.spring.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cyb.spring.member.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	private JdbcTemplate jdbcTemplate;

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public MemberDAOImpl() {
	}

	@Override
	public List<MemberVO> selectAllMembers() throws DataAccessException {
		String query = "select id, pwd, name, email, joindate from t_member order by joindate desc";
		
		List<MemberVO> membersList = new ArrayList<MemberVO>();
		membersList = this.jdbcTemplate.query(query, new RowMapper<MemberVO>() {
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException{
				
				MemberVO memberVO = new MemberVO();
				
				memberVO.setId(rs.getString("id"));
				memberVO.setPwd(rs.getString("pwd"));
				memberVO.setName(rs.getString("name"));
				memberVO.setEmail(rs.getString("email"));
				memberVO.setJoinDate(rs.getDate("joinDate"));
				
				return memberVO;
				
			}
			
		}); //query() END
		return membersList;
	}

	@Override
	public int addMember(MemberVO memberVO) throws DataAccessException {
		return 0;
	}
	// private DataSource dataSource; => setter =>
	// public void setDataSouce(DataSource dataSource){~~}
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("this.jdbcTemplate = new JdbcTemplate(dataSource)");
		// TODO Auto-generated method stub

	}
}
