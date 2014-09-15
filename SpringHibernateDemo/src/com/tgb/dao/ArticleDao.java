package com.tgb.dao;

import java.util.List;

import com.tgb.entity.Article;

public interface ArticleDao {

	public Article getArticle(String id);
	public List<Article> getAllArticle();
	public List<Article> getAllArticleByPage(int totle,int page,String tag);
	
	public Article getArticleById(String id);
	public Integer getTotlePages(String tag);
}
