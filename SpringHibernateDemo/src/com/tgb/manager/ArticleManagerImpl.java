package com.tgb.manager;

import java.util.ArrayList;
import java.util.List;

import com.tgb.dao.ArticleDao;
import com.tgb.dao.TagDao;
import com.tgb.entity.Article;

public class ArticleManagerImpl implements ArticleManager {
	
	private ArticleDao  articleDao;
	
	private TagDao tagDao;
    

	public TagDao getTagDao() {
		return tagDao;
	}

	public void setTagDao(TagDao tagDao) {
		this.tagDao = tagDao;
	}

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public Article getArticle(String id) {
		return articleDao.getArticle(id);
	}

	@Override
	public List<Article> getAllArticle() {
		List<Article> list = articleDao.getAllArticle();
		for(Article article:list){
			article.setTagList(tagDao.getTagList(article.getId()));
		}
		return list;
	}

	@Override
	public List<Article> getAllArticleByPage(int totle, int page,String tag) {
		List<Article> list = articleDao.getAllArticleByPage(totle, page,tag);
		for (int i = 0; i <list.size(); i++) {
			Article article = (Article)list.get(i);
			article.setTagList(tagDao.getTagList(article.getId()));
		}
		return list;
	}

	@Override
	public List<String> getAllTag() {
		// TODO Auto-generated method stub
		return tagDao.getTagAllList();
	}

	@Override
	public List<Article> getTagArticle(String tag) {
		List<Integer> idList = tagDao.getIdByTag(tag);
		List<Article> articleList = new ArrayList<Article>();
		for(int id : idList){
			articleList.add(articleDao.getArticleById(String.valueOf(id)));
		}
		for(Article article:articleList){
			article.setTagList(tagDao.getTagList(article.getId()));
		}
		return articleList;
	}

	@Override
	public Integer getTotlePages(String tag) {
		return articleDao.getTotlePages(tag);
	}

}
