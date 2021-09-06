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
	<h1>${board} Board List Page</h1>

	<div>
		<table class="table">
			<tr>
				<th>글번호</th><th>글제목</th><th>글내용</th><th>글쓴이</th><th>작성일</th><th>조회수</th>
			</tr>
			<c:forEach items="${list}" var="dtos">
				<tr>
					<td>${dtos.num}</td>
					<td><a href="./select?num=${dtos.num}">${dtos.title}</a></td>
					<td>${dtos.contents}</td>
					<td>${dtos.writer}</td>
					<td>${dtos.regdate}</td>
					<td>${dtos.hits}</td>
				</tr>
			</c:forEach>
		</table>
		
		<a href="./insert" class="btn btn-danger">ADD</a>
	</div>
</body>
</html>