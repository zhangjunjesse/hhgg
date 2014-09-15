package com.tgb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Tag")
public class Tag {

	@Id
	@Column(length=8)
	private String tag_id;
	
	@Column(length=8)
	private String article_id;
	
	@Column(length=30)
	private String tag;
	
	@Column
	private String create_tm;


	public String getTag_id() {
		return tag_id;
	}

	public void setTag_id(String tag_id) {
		this.tag_id = tag_id;
	}

	public String getArticle_id() {
		return article_id;
	}

	public void setArticle_id(String article_id) {
		this.article_id = article_id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getCreate_tm() {
		return create_tm;
	}

	public void setCreate_tm(String create_tm) {
		this.create_tm = create_tm;
	}
	
	
}
