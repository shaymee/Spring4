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

	<div class="container-fluid">
		<table class="table table-striped table-hover"">
			<tr>
				<th>글번호</th><th>글제목</th><th>글내용</th><th>글쓴이</th><th>작성일</th><th>조회수</th>
			</tr>
			<c:forEach items="${list}" var="dtos">
				<tr>
					<td>${dtos.num}</td>
					<td><a href="./noticeSelect?num=${dtos.num}">${dtos.title}</a></td>
					<td>${dtos.contents}</td>
					<td>${dtos.writer}</td>
					<td>${dtos.regdate}</td>
					<td>${dtos.hits}</td>
				</tr>
			</c:forEach>
		</table>
		
		<ul class="pagination">
		<!-- pager의 startNum부터 lastNum까지 찍음==>찍는걸 반복 -->
		<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="n"> <!-- n에다가 숫자를 담으라는 얘기 -->
		
			<li class="page-item">
				<a class="page-link" href="./noticeList?pn=${n}">${n}</a>
			</li>		
		</c:forEach> <!-- items 속성은 collection계열만 담당함 -->
		</ul>
		<a href="./noticeInsert" class="btn btn-outline-success"">글쓰기</a>
		
	</div>
</body>
</html>