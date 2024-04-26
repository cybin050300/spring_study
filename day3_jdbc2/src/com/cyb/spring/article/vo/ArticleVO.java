package com.cyb.spring.article.vo;

import java.sql.Date;

public class ArticleVO {
	public int articleno;
	public int parentno;
	public String title;
	public String content;
	public String imagefilename;
	public Date writedate;
	public String id;
	
	
	public int getArticleno() {
		return articleno;
	}


	public void setArticleno(int articleno) {
		this.articleno = articleno;
	}


	public int getParentno() {
		return parentno;
	}


	public void setParentno(int parentno) {
		this.parentno = parentno;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getImagefilename() {
		return imagefilename;
	}


	public void setImagefilename(String imagefilename) {
		this.imagefilename = imagefilename;
	}


	public Date getWritedate() {
		return writedate;
	}


	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public ArticleVO() {
		
	}

}
