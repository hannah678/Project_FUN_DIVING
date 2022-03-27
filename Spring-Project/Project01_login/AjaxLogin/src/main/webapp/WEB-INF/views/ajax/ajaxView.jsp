<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<style>
#log {
	width: 400px;
	margin: 0px auto;
}

#log>h1 {
	text-align: center;
}

#logFrm>ul>li {
	float: left;
	width: 30%;
	list-style-type:none;
}

#logFrm>ul>li:nth-child(2n) {
	width: 70%;
}

#logFrm>ul>li:last-of-type {
	width: 100%;
	text-align: center;
	margin-top: 30px;
}
</style>
<script>
	$(function () {
		$("#logFrm").submit(function(){
			event.preventDefault();
			var url = "/myapp/ajaxForm";
			var params = $("#logFrm").serialize();
			
			$.ajax({
				url: url,
				type: "POST",
				data: params,
				success: function(msg){
					alert(msg);
				}
			});
		});
	});
</script>

</head>
<body>
<div class="container">
	<div id="log">
		<h1>로그인</h1>
		<hr />
		<form method="post" id="logFrm" action="/myapp/ajaxForm">
			<ul>
				<li>아이디</li>
				<li><input type="text" name="userid" id="userid"/></li>
				<li>비밀번호</li>
				<li><input type="password" name="userpwd" id="userpwd"/></li>
				<li><input type="submit" value="로그인"/> 
				<input type="reset" value="취소"/></li>
			</ul>
		</form>
	</div>
</div>
</body>
</html>