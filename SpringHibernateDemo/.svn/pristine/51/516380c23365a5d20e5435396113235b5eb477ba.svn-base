<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page import="com.tgb.util.WebUtil"%>
 <%
 String url = new WebUtil().getWebBgImg(request);
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<STYLE TYPE="text/css">
body {
background-image: url("<c:url value='<%=url%>'/>"); 
background-position: center;
background-attachment: fixed;
} 


</STYLE>
</head>
<body>
<c:import url="/webpages/topbar.jsp"></c:import>
<c:import url="/webpages/content.jsp"></c:import>
</body>
</html>