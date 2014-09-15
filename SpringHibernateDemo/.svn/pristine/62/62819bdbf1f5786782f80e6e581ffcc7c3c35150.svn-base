<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page import="com.tgb.util.WebUtil"%>
<%@ page import="java.util.List"%>
 <%
	String url = new WebUtil().getWebBgImg(request);
 	List<String> imgpath = WebUtil.getWebSliderImg(request);
 	request.setAttribute("imgList", imgpath);
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
    <script src="<c:url value='/js/jquery.carouFredSel-6.1.0-packed.js'/>" type="text/javascript"></script>
    <script type="text/javascript">
$(function() {
    $('#carousel').carouFredSel({
        width: '100%',
        items: {
            visible: 3,
            start: -1
        },
        scroll: {
            items: 1,
            duration: 1000,
            timeoutDuration: 3000
        },
        prev: '#prev',
        next: '#next',
        pagination: {
            container: '#pager',
            deviation: 1
        }
    });
});
</script>
    
    
    <style type="text/css">
body {
	background-image: url("<c:url value='<%=url%>'/>"); 
	background-position: center;
	background-attachment: fixed;
}

.home-content { 
	margin-left: auto;
	margin-right: auto;
	margin-top: 90px;
	width: 850px;
	height: 2500px; 
	background : #FFFFFF;
	-webkit-border-radius: 10px;
	border-radius: 10px;
	background: #FFFFFF;
}
.banner { position: relative; overflow: auto; }
    .banner li { list-style: none; }
        .banner ul li { float: left; }
         	.banner ul li img{width: 250px;height: 150px;}
</style>
  </head>
  <body>
  <c:import url="/webpages/topbar.jsp"></c:import>
  <div class="home-content shadow">
  
  <!-- 图片 -->
  <div class="imgslider">
  <div id="wrapper">
      
    <div id="carousel">
    <c:forEach items="${imgList }" var="img">
        <img  src="<c:url value='${img }'/>" alt="" width="390"height="450">
        </c:forEach>
    </div>
<a href="#" id="prev" title="Show previous"> </a> <a href="#" id="next"title="Show next"> </a>
    <div id="pager">
          
    </div>
  
</div>
  
  </div>
  </div>
  
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="<c:url value='/js/jquery-1.7.1.js'/>"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<c:url value='/js/bootstrap.min.js'/>"></script>
    <script src="<c:url value='/js/jquery.carouFredSel-6.1.0-packed.js'/>" type="text/javascript"></script>
  </body>
</html>