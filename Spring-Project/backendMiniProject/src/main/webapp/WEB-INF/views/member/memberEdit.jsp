<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <link href="https://fonts.googleapis.com/css?family=Nanum+Gothic+Coding:400" rel="stylesheet">
<style>
	.container{
		width:800px;
		margin:0;
		position:absolute;
		z-index:10;
		background-color: rgba( 255, 255, 255);
		border-radius:20px;
		padding: 50px;
  		left: 50%;
  		transform: translateX(-50%);
		top:200px;
	}
	#mFrm ul{
		margin-top: 80px;
	}
	#mFrm li{
		float:left;
		height:80px;
		width:20%;
		border-bottom:1px solid #ddd;
		padding:0;
	}
	
	#mFrm li:nth-child(2n){
		width:80%;
	}
	
	#mFrm li:last-of-type{
		width:100%;
		margin:0 auto;
	}
	h2{
		font-weight: bold;
	}
</style>
<script>
	$(function(){
		$("#mFrm").submit(function(){
			if($("#userpwd").val()==''){
				alert("비밀번호 입력 후 수정하세요.");
				return false;
			}
			if($("#username").val()==''){
				alert("이름을 입력하세요...");
			}
			var reg = /^[0-9]{3,4}$/
			var reg2 = /^[0-9]{4}$/
			if(!reg.test($("#tel2").val()) || !reg2.test($("#tel3").val())){
				alert("전화번호를 잘못입력하셨습니다.");
				return false;
			}
			return true;
		});
	});
</script>

<div class="container">
	<h2><span style="font-family:'Nanum Gothic Coding' !important;">회원정보 수정</span></h2>
	<form method="post" action="/myapp/member/memberEditOk" id="mFrm">
		<ul>
			<li>아이디</li>
			<li>${vo.userid}</li>
			<li>비밀번호</li>
			<li><input type="password" name="userpwd" id="userpwd" placeholder="비밀번호 입력"/></li>
			<li>이름</li>	
			<li><input type="text" name="username" id="username" value="${vo.username}"/></li>	
			<li>연락처</li>
			<li>
				<select name="tel1">
					<option value="010" <c:if test="${tel1=='0l0'}">selected</c:if>>010</option>
					<option value="02" <c:if test="${tel1=='02'}">selected</c:if>>02</option>
					<option value="031" <c:if test="${tel1=='031'}">selected</c:if>>031</option>
					<option value="041" <c:if test="${tel1=='041'}">selected</c:if>>041</option>
				</select> -
				<input type="text" name="tel2" id="tel2" maxlength="4" value="${vo.tel2}"/> -
				<input type="text" name="tel3" id="tel3" maxlength="4" value="${vo.tel3}"/>
			</li>
			<li>이메일</li>
			<li><input type="text" name="email" id="email" value="${vo.email}"/>
			<li><input type="submit" id="edit1" value="회원정보수정하기"/></li>
		</ul>
	</form>
</div>