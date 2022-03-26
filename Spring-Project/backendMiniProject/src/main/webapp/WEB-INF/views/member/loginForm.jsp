<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
#log {
	width: 100%;
	margin: 0 auto;
	padding:0;
}

#logFrm>ul>li {
	float: left;
	width: 25%;
	line-height: 50px;
}

#logFrm>ul>li:nth-child(2n) {
	width: 75%;
}
input[type=text], input[type=password]{
		border-radius:10px;
		border:none;
		height: 35px;
		background-color: #ddd;
}
input[type=reset], input[type=submit]{
	border-radius:10px;
	height: 45px;
	margin:0;
}
#logFrm>ul>li:last-of-type {
	width: 100%;
	height: 100%;
	text-align: center;
	margin-top: 30px;
	border: none;
}
</style>

<script>
	function logFormCheck() {
		// 아이디와 비밀번호 입력유무를 확인하고 모두 입력되면 action의 파일을 요청하고 
		// 하나라도 입력이 안되면 현재 페이지에 머물기
		// 아이디가 있는지 확인
		var id = document.getElementById("loguserid");
		if (document.getElementById("loguserid").value == "") {
			alert("아이디를 입력하세요.");
			id.focus(); // 커서를 해당객체 위치시킨다.
			return false;
		}
		if (document.querySelector("#loguserpwd").value == "") {
			alert("비밀번호를 입력하세요.");
			document.querySelector("#loguserpwd").focus();
			return false;
		}
		// 아이디와 비밀번호가 모두 입력되었을 때
		return true;
	}
</script>

	<div id="log">
		<form method="post" action="/myapp/member/loginOk" id="logFrm" onsubmit="return logFormCheck()">
			<ul>
				<li>아이디</li>
				<li><input type="text" name="userid" id="loguserid"/></li>
				<li>비밀번호</li>
				<li><input type="password" name="userpwd" id="loguserpwd"/></li>
				<li><input type="submit" value="로그인"/> 
				<input type="reset" value="취소"/></li>
			</ul>
		</form>
	</div>