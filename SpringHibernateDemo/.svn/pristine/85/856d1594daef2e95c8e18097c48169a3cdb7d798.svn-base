<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>定义input type="file" 的样式</title>
<style type="text/css">
body{ font-size:14px;}
input{ vertical-align:middle; margin:0; padding:0}
.file-box{ position:relative;width:340px}
.txt{ height:22px; border:1px solid #cdcdcd; width:180px;}
.btn{ background-color:#FFF; border:1px solid #CDCDCD;height:24px; width:70px;}
.file{ position:absolute; top:0; right:80px; height:24px; filter:alpha(opacity:0);opacity: 0;width:260px }
</style>
</head>
<body>
<div class="file-box">
选择首页背景图片
  <form action="<%=request.getContextPath() %>/changeBg" method="post"  enctype="multipart/form-data">
 <input type='text' name='textfield' id='textfield' class='txt' />  
 <input type='button' class='btn' value='浏览...' />
	<input type="file" name="uploadFile" class="file" id="fileField" size="28" onchange="document.getElementById('textfield').value=this.value" />
 <input type="submit" name="submit" class="btn" value="上传" />
  </form>
</div>

  

  
  
  
<form action="/SpringHibernateDemo/chooseSliderImg" method="post"  enctype="multipart/form-data">
 <input type="file" name="imgs"   size="28" /></br>
  <input type="file" name="imgs"     size="28"   /></br>
  <input type="file" name="imgs"    size="28"  /></br>
 <input type="submit" name="submit" class="btn" value="上传" />
  </form>
</body>
</html>