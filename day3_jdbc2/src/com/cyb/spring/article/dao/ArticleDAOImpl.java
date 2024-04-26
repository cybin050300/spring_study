package com.cyb.spring.article.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cyb.spring.article.vo.ArticleVO;

public class ArticleDAOImpl implements ArticleDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// setter로 자신의 속성인 jdbcTemplate에 dataSource 빈을 주입
	public void setDataSource(DataSource dataSource) {
		// 설정 파일에서 생성한 dataSource 빈을 setter를 이용해 JdbcTemplate 클래스 생성자의 인자로 입력
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("this.jdbcTemplate = new JdbcTemplate(dataSource)");
	}

	public ArticleDAOImpl() {
		System.out.println("public ArticleDAOImpl()");
	}

	@Override
	public List<ArticleVO> selectAllArticles() throws DataAccessException {
		String query = "select articleno, parentno, title, content, imagefilename, writedate, id from t_board2 order by articleno";

		List<ArticleVO> articlesList = new ArrayList<ArticleVO>();
		articlesList = this.jdbcTemplate.query(query, new RowMapper<ArticleVO>() {

			public ArticleVO mapRow(ResultSet rs, int rowNum) throws SQLException {

				ArticleVO articleVO = new ArticleVO();

				articleVO.setArticleno(rs.getInt("articleno"));
				articleVO.setParentno(rs.getInt("parentno"));
				articleVO.setContent(rs.getString("content"));
				articleVO.setTitle(rs.getString("title"));
				articleVO.setImagefilename(rs.getString("imagefilename"));
				articleVO.setWritedate(rs.getDate("writedate"));
				articleVO.setId(rs.getString("id"));

				return articleVO;
			}

		});

		return articlesList;

	}

	@Override
	public int addArticle(ArticleVO articleVO) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

}
