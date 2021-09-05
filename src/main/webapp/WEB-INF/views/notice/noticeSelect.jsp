<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="../temp/boot_nav.jsp"></c:import>
<div class="container-fluid">
	<table class="table table-striped table-hover">
		<tr>
			<th>글번호</th><th>글제목</th><th>글내용</th><th>글쓴이</th><th>작성일</th><th>조회수</th>
		</tr>
		
		<tr>
			<td>${dto.num}</td><td>${dto.title}</td><td>${dto.contents}</td><td>${dto.writer}</td><td>${dto.regdate}</td><td>${dto.hits}</td>
		</tr>
		
	</table>
	<a href="./noticeDelete?num=${dto.num}" class="btn btn-dark">Delete</a>
</div>

</body>
</html>