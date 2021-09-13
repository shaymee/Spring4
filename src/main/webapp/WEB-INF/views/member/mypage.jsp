<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>My page: 로그인한 사람의 정보 출력</h1>
	<h1>ID : ${member.id}</h1>
	<h1>NAME : ${member.name}</h1>
	<h1>PHONE : ${member.phone}</h1>
	<h1>EMAIL : ${member.email}</h1>
	<a href="./update">수정</a>
	<a href="#" id="del">탈퇴</a>


<script type="text/javascript">
	/* const del = document.getElementById('del'); */
	const del=document.querySelector('#del');
	del.addEventListener('click', function(){
		let result = window.confirm('정말 탈퇴하시겠습니까?');
		if(result){
			location.href="./delete";
		}
	});
</script>	
</body>
</html>