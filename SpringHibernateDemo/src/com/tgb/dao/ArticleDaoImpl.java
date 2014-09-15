package com.tgb.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.tgb.entity.Article;

public class ArticleDaoImpl implements ArticleDao {
	
	private static Integer totle = 5;//一页显示的条数
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Article getArticle(String id) {
		String hql = "from Article where id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		return (Article) query.uniqueResult();
	}

	@Override
	public List<Article> getAllArticle() {
		String hql = "from Article order by create_tm";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Article> list = query.list();
		return list;
	}

	@Override
	public List<Article> getAllArticleByPage(int totle, int page,String tag) {
		String hql ;
		if(totle==0){
			totle = ArticleDaoImpl.totle;
		}
		if(null==tag||"".equals(tag)){
		 hql = "from Article article  order by create_tm ";
		}else{
		 hql = "from Article where id in  (:idlist)    order by create_tm ";
		}
		Query query = null;
		if(null!=tag&&!"".equals(tag)){
			List<Integer> re = (List<Integer>) sessionFactory.getCurrentSession().createSQLQuery("select article_id from tag  where tag = '"+tag+"'").list();
			query = sessionFactory.getCurrentSession().createQuery(hql);
			List<String> rs = new ArrayList<String>();
			for (int i = 0; i < re.size(); i++) {
				rs.add(String.valueOf(re.get(i)));
			}
			query.setParameterList("idlist", rs);
		}else{
			query = sessionFactory.getCurrentSession().createQuery(hql);
		}
		query.setFirstResult(totle*page);
		query.setMaxResults(totle);
		List<Article> list =query.list();
		return list;
	}

	@Override
	public Article getArticleById(String id) {
		String hql = "from Article where id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		Article article = (Article) query.uniqueResult();
		return article;
	}

	@Override
	public Integer getTotlePages(String tag) {
		String hql = "from Article ";
		if(null==tag||"".equals(tag)){
			 hql = "from Article ";
			}else{
			 hql = "from Article where id in  (:idlist)  ";
			}
		Query query = null;
		if(null!=tag&&!"".equals(tag)){
			List<Integer> re = (List<Integer>) sessionFactory.getCurrentSession().createSQLQuery("select article_id from tag  where tag = '"+tag+"'").list();
			query = sessionFactory.getCurrentSession().createQuery(hql);
			List<String> rs = new ArrayList<String>();
			for (int i = 0; i < re.size(); i++) {
				rs.add(String.valueOf(re.get(i)));
			}
			query.setParameterList("idlist", rs);
		}else{
			query = sessionFactory.getCurrentSession().createQuery(hql);
		}
		int totleAll = query.list().size();
		return totleAll%totle==0?totleAll/totle:totleAll/totle+1;
	}

}
