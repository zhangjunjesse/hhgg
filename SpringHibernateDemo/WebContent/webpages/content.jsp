<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
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
#center-opacity {
	MARGIN-RIGHT: auto;
	MARGIN-LEFT: 200px;
	height: 200px;
	background: #333333;
	width: 600px;
	/* vertical-align: middle; */
	line-height: 200px;
	filter:alpha(Opacity=44);
    -moz-opacity:0.44;
    opacity: 0.44;
    padding:25px 20px;
    margin-top:10px;
    margin-bottom: 35px;
    -webkit-border-radius: 10px;
    border-radius: 10px;
}
#inner {
	width: 560px;
	/* vertical-align: middle; */
	line-height: 200px;
    position: absolute;
    padding-top:25px;
    text-align: center;
    color: #FFFFCC;
}
a,a:hover,a:focus{
  color: #FFFFCC;
}

.a-after:AFTER{
content: "\00A0\000BB";
}
.fags{
margin-left: 4px;
font-size: 15px;
font-family: Microsoft YaHei;
color: #CC9933;
}

#right-guid{
	filter:alpha(Opacity=44);
    -moz-opacity:0.44;
    opacity: 0.44;
    background-color: #333333;
    -webkit-border-radius: 10px;
    border-radius: 10px;
}

.li-inner > a{
color: #FF9933;	
}
.right-guid-position{
position: absolute;
right:230px;
top:182	px;
-webkit-border-radius: 10px;
    border-radius: 10px;
    width: 300px;
}

</style>
  </head>
  
  <body>
  
<div style="width: 100%;height:1000px ;margin-top: 120px;">

<div class="right-guid-position">
<ul class="nav nav-pills nav-stacked"  id="right-guid" role="tablist">
  <c:forEach items="${tagList }" var="tags">
  <li role="presentation" class="li-inner"><a href="tagarticle?tag=${tags }" ><i class="glyphicon glyphicon-tag" style="font-size: 12px;color: #CC9933;margin-right: 5px;"></i>${tags }</a></li>
  </c:forEach>
</ul>
</div>

<c:if test="${!empty articleList }">
   <c:forEach items="${articleList }"  var="article">
       <div id="center-opacity">
        <div id="inner" >
          <h2><a href="getArticle?id=${article.id }"  class="a-after"> ${article.title }
          </a></h2>
          <hr>
          <div style="text-align: left; margin-left: 19px;">
           <span ><i class="glyphicon glyphicon-tags" style="font-size: 12px;color: #CC9933;">
           <c:forEach items="${article.tagList }" var="tag">
           <a href="tagarticle?tag=${tag.tag }"  class="fags">${tag.tag }&nbsp;&nbsp;  </a>
           </c:forEach>
           </i></span>
          </div>
         </div>
        </div>
   </c:forEach>
</c:if>
        
<ul class="pager">
  <c:choose>
  <c:when test="${page == 0 }">
  <li class="disabled"><a href="#">上一页</a></li>
  </c:when>
   <c:when test="${page != 0 }">
  <li><a href="index?page=${page-1 }&tag=1">上一页</a></li>
  </c:when>
  </c:choose>
  <c:choose>
  <c:when test="${!isLast }">
  <li><a href="index?page=${page+1 }&tag=1">下一页</a></li>
  </c:when>
    <c:when test="${isLast}">
  <li class="disabled"><a href="#">下一页</a></li>
  </c:when>
  </c:choose>
</ul>

</div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="<c:url value='/js/jquery-1.7.1.js'/>"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<c:url value='/js/bootstrap.min.js'/>"></script>

  </body>
</html>