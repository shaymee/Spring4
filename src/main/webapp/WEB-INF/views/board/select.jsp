<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="../temp/boot_nav.jsp"></c:import>

<div>
	<table class="table">
		<thead>
			<td>글번호</td><td>글제목</td><td>글내용</td><td>글쓴이</td><td>작성일</td><td>조회수</t>
		</thead>
		
		<tbody>
			<td>${dto.num}</td>
			<td>${dto.title}</td>
			<td>${dto.contents}</td>
			<td>${dto.writer}</td>
			<td>${dto.regdate}</td>
			<td>${dto.hits}</td>
		</tbody>
	</table>

	<a href="./delete?num=${dto.num}" class="btn btn-dark">Delete</a>
	<a href="./update?num=${dto.num}" class="btn btn-danger">Update</a>
	<c:if test="${board ne 'notice'}">
		<a href="./reply?num=${dto.num}" class="btn btn-success">REPLY</a>
	</c:if>
</div>

</body>
</html>