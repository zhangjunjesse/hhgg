package com.tgb.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.coyote.ActionCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tgb.entity.Article;
import com.tgb.manager.ArticleManager;


@Controller
public class ArticleController {

	private static Integer page = 0;//页码
	private static String tag = null;//标签
	
	@ModelAttribute("article")
	public Article getArticle(){
		return new Article();
	}
	
	@Resource(name="articleManager")
	private ArticleManager articleManager;

	@RequestMapping("/index")
	public String getAllArticle(Integer page ,String tag,HttpServletRequest request){
	    if(null==tag||"".equals(tag)){
	    	request.getSession().setAttribute("tag", "");
	    }
		if(page == null){
			page =0;
		}else{
			ArticleController.page = page;
		}
		List<Article> list =articleManager.getAllArticleByPage(0, ArticleController.page,(String)request.getSession().getAttribute("tag"));
		List<String> taglist = articleManager.getAllTag();
		request.setAttribute("articleList", list);
		request.setAttribute("tagList", taglist);
		Integer totlepages = articleManager.getTotlePages((String)request.getSession().getAttribute("tag"));
		request.setAttribute("page",ArticleController.page);
		request.setAttribute("isLast", (page+1)==totlepages);
		return "/webpages/index";
	}
	
	@RequestMapping("/tagarticle")
	public String getTagArticle(String tag,HttpServletRequest request){
		request.getSession().setAttribute("tag", tag);
		List<Article> list =articleManager.getTagArticle(tag);
		List<String> taglist = articleManager.getAllTag();
		request.setAttribute("articleList", list);
		request.setAttribute("tagList", taglist);
		
		return "/webpages/index";
	}
	
	@RequestMapping("/getArticle")
	public String getArticleById(String id ,HttpServletRequest request){
		Article article = articleManager.getArticle(id);
		request.setAttribute("myarticle", article);
		return "/webpages/article";
	}
	
	@RequestMapping("/aboutme")
	public String getAboutMe(HttpServletRequest request){
		return "/webpages/aboutme";
	}
}
