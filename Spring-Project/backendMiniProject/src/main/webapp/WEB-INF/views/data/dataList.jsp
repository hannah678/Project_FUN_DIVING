<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
	#bulletin{
		border-radius:20px; padding:2%; padding-top:0.2%; position:absolute; z-index:3; float:left;
		width:1500px; height:1500px; top: 150px; right:100px; background-color:rgb(214, 216, 245);
	}
	#bulletin>li{
		float:left; width:33.33%; height:32%; padding:1.5%; margin:0 auto;
	}
	#bulletin>li:first-child{
		width:100%; text-align:right; height:60px;
	}
	#bulletin>li img{
		width:100%; height:100%; margin:0 auto;
	}
</style>

<div id="board">
	<ul id="bulletin">
		<li><a href="/myapp/data/write"><input type="submit" value="글쓰기"/></a></li>
		<c:forEach var="vo" items="${lst}">
			<li>
				<!-- 첫번째 첨부파일 -->
				<a href="/myapp/data/view?no=${vo.no}"><img src="/myapp/upload/${vo.filename1}" data-target="#n" data-toggle="modal" 
				title="${vo.subject}"/></a>
			</li>
		</c:forEach>
	</ul>
</div>	
<div id="gmap"></div>

<script>
$(function(){
    $("#gmap").load("${url}/front/googleMapGeocoder"); 
    $("#gmap").animate({left:"+250px"}, 2000);
});
</script>
