<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix ="form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function addUser(){
		var form = document.forms[0];
		form.action = "addUser";
		form.method="post";
		form.submit();
	}
</script>
</head>
<body>
	<h1>添加用户</h1>
	<form:form commandName="user">
	<form:errors path="*" cssStyle="color:red"/> </br>
	姓名：<form:input path="userName"/>
	<form:errors path="userName" cssStyle="color:red"/> 
	</br>
	年龄：<form:input path="age"/>
	<form:errors path="age" cssStyle="color:red"/> 
	<input type="button" value="添加" onclick="addUser()">
	</form:form>
</body>
</html>