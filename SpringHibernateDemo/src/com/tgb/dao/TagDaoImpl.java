package com.tgb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.tgb.entity.Tag;
import com.tgb.entity.User;

public class TagDaoImpl implements TagDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Tag> getTagList(String id) {
		String hql = "from Tag t where t.article_id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		List<Tag> list = query.list();
		return list;
	}

	@Override
	public List<String> getTagAllList() {
		String hql = "select distinct  tag  from tag";
		Query query = sessionFactory.getCurrentSession().createSQLQuery(hql);
		List<String> list = query.list();
		return list;
	}

	@Override
	public List<Integer> getIdByTag(String tag) {
		String hql = "select distinct  article_id  from tag where tag = ?";
		Query query = sessionFactory.getCurrentSession().createSQLQuery(hql);
		query.setString(0, tag);
		List<Integer> list = query.list();
		return list;
	}

}
