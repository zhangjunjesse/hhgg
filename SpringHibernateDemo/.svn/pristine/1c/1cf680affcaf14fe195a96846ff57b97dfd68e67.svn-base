<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page import="com.tgb.util.WebUtil"%>
 <%
String url = new WebUtil().getWebBgImg(request);
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>content</title>

    <!-- Bootstrap -->
   	<link type="text/css" rel="stylesheet" href="<c:url value='/css/bootstrap.css'/>">  
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
    
    .myarticle{
    	filter:alpha(Opacity=94);
    -moz-opacity:0.94;
    opacity: 0.94;
    background-color: #333333;
    -webkit-border-radius: 10px;
    border-radius: 10px;
    }
    
    
    body {
background-image: url("<c:url value='<%=url%>'/>"); 
background-position: center;
background-attachment: fixed;
} 
    </style>
    
  </head>
  
  <body>
  <c:import url="/webpages/topbar.jsp"></c:import>
    <div class="myarticle" >
    <div class="myarticle-inner">
   ${myarticle.content }
    </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="<c:url value='/js/jquery-1.7.1.js'/>"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<c:url value='/js/bootstrap.min.js'/>"></script>

  </body>
</html>