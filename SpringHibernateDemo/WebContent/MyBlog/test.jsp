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
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <script src="<c:url value='/js/jquery-1.7.1.js'/>"></script>
<script src="<c:url value='/js/transit.js.js'/>" type="text/javascript"></script>
<script src="<c:url value='/js/touchSwipe.js'/>" type="text/javascript"></script>
<script src="<c:url value='/js/simpleSlider.js'/>" type="text/javascript"></script>
<script src="<c:url value='/js/backstretch.js'/>" type="text/javascript"></script>
<script src="<c:url value='/js/custom.js'/>" type="text/javascript"></script>
<script src="<c:url value='/js/jquery-migrate-1.2.1.min.js'/>" type="text/javascript"></script>
  <script type="text/javascript">
  $(document).ready(function(){
	// Default options
	    var options = {
	        slides: '.slide', // The name of a slide in the slidesContainer
	        swipe: true,    // Add possibility to Swipe > note that you have to include touchSwipe for this
	        slideTracker: true, // Add a UL with list items to track the current slide
	        slideTrackerID: 'slideposition', // The name of the UL that tracks the slides
	        slideOnInterval: true, // Slide on interval
	        interval: 5000, // Interval to slide on if slideOnInterval is enabled
	        animateDuration: 1500, // Duration of an animation
	        animationEasing: 'easeInOut', // Accepts: linear ease in out in-out snap easeOutCubic easeInOutCubic easeInCirc easeOutCirc easeInOutCirc easeInExpo easeOutExpo easeInOutExpo easeInQuad easeOutQuad easeInOutQuad easeInQuart easeOutQuart easeInOutQuart easeInQuint easeOutQuint easeInOutQuint easeInSine easeOutSine easeInOutSine easeInBack easeOutBack easeInOutBack
	        pauseOnHover: false // Pause when user hovers the slide container
	    };
	    $(".slider").simpleSlider(options);
	    var slider = $(".slider").data("simpleslider");
	    slider.nextSlide(); // Go to the next slide
	    slider.prevSlide(); // Go to the previous slide
	    slider.nextSlide(slidenumber); // Go to the given slide
	    
	    $(".slider").simpleSlider();
	    $(".slider").on("beforeSliding", function(event){
	        // Event.prevSlide: previous slide ID
	        // Event.newSlide: coming slide ID
	    });
	    $(".slider").on("afterSliding", function(event){
	        // Event.prevSlide: previous slide ID
	        // Event.newSlide: coming slide ID
	    });
	});
  </script>
</head>
<body>
<!-- 图片 -->
<div class='slide'>
        <div class='slidecontent'>
            <h1>Solar Dolar Wolar Woot</h1>
            <h2>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam posuere cursus euismod.Aenean ut tortor leoing elit. Etiam posuere cursus euismod.Aenean ut tortor leo.</h2>
        </div>
    </div>
    
    <div class='slide' >
        <div class='slidecontent'>
            <h1>Solar Dolar Wolar Woot</h1>
            <h2>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam posuere cursus euismod.Aenean ut tortor leo.</h2>
        </div>
    </div>
  

</body>
</html>