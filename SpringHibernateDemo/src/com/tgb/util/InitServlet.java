package com.tgb.util;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class InitServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println(getServletContext().getRealPath("/"));
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(config.getServletContext().getRealPath("/"));
		super.init(config);
	}

	
}
