package com.cyb.spring.article.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cyb.spring.article.vo.ArticleVO;

public interface ArticleService {
	public List<ArticleVO> listArticles() throws DataAccessException;

}
