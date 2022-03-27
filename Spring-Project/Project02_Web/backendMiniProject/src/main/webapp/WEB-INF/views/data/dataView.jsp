<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
</style>
<script>
	function dataDelCheck(){
		if(confirm("삭제하시겠습니까?")){
			location.href="/myapp/data/dataDel?no=${dataVO.no}";
		}
	}
</script>

<div class="container">
	<h1 style="text-align: center;">${dataVO.subject}</h1><br/>
	<ul>
		 <li style="text-align: center;">번호: ${dataVO.no}</li>
		 <li style="text-align: center;">글쓴이: ${dataVO.userid}</li>
		 <li style="text-align: center;">등록일 : ${dataVO.writedate}</li>
		 <li style="text-align: center;"><img src="/myapp/upload/${dataVO.filename1}" width="400" height="400"/>
			<c:if test="${dataVO.filename2!=null && dataVO.filename2 !=''}">
				<img src="/myapp/upload/${dataVO.filename2}" width="400" height="400"/>
			</c:if>
		 </li>
         <li style="text-align: center;">${dataVO.content}</li>
	</ul>
	<c:if test="${dataVO.userid==logId}">
		<a href="/myapp/data/dataEdit?no=${dataVO.no}">수정</a>
		&nbsp;&nbsp;&nbsp;<a href="javascript:dataDelCheck()">삭제</a>
	</c:if>
</div>