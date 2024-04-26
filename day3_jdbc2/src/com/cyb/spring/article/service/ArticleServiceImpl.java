package com.cyb.spring.article.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cyb.spring.article.dao.ArticleDAO;
import com.cyb.spring.article.vo.ArticleVO;

public class ArticleServiceImpl implements ArticleService {

	private ArticleDAO articleDAO;

	public void setArticleDAO(ArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}

	public ArticleServiceImpl() {
		System.out.println("public ArticleServiceImpl()");
	}

	@Override
	public List<ArticleVO> listArticles() throws DataAccessException {
		System.out.println("public List<ArticleVO> listArticles()");
		List<ArticleVO> articlesList = articleDAO.selectAllArticles();
		return articlesList;
	}

}
