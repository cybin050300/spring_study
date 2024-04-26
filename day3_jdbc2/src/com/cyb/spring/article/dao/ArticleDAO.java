package com.cyb.spring.article.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cyb.spring.article.vo.ArticleVO;

public interface ArticleDAO {
	public List<ArticleVO> selectAllArticles() throws DataAccessException;
	public int addArticle(ArticleVO articleVO) throws DataAccessException;

}
