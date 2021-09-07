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
	
		<!-- Search Form -->
	
		<form action="./list" method="get">
		
		 <div class="input-group mb-3" >
		  <select name="kind" class="form-select form-select-sm" aria-label=".form-select-sm example">
			  <option value="num">NUM</option>
			  <option value="title">TITLE</option>
			  <option value="writer">WRITER</option>
			</select>
		  
		  <input type="text" name="search" class="form-control" aria-label="Text input with dropdown button">
		  <button type="submit" class="btn btn-outline-secondary">Search</button>
		</div>
			
		</form>
	
	<!-- /Search Form -->
	
		<table class="table">
			<tr>
				<th>글번호</th><th>글제목</th><th>글내용</th><th>글쓴이</th><th>작성일</th><th>조회수</th>
			</tr>
			<c:forEach items="${list}" var="dtos">
				<tr>
					<td>${dtos.num}</td>
					<td><a href="./select?num=${dtos.num}">
					<c:catch>
					<c:forEach begin="1" end="${dtos.depth}">
						-->
					</c:forEach>
					</c:catch>
					${dtos.title}</a></td>
					<td>${dtos.contents}</td>
					<td>${dtos.writer}</td>
					<td>${dtos.regdate}</td>
					<td>${dtos.hits}</td>
				</tr>
			</c:forEach>
		</table>
		
		<nav aria-label="Page navigation example">
		  <ul class="pagination">
		    <li class="page-item">
		      <a class="page-link" href="./list?kind=${pager.kind}&search=${pager.search}" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
		    
		   	<li class="page-item">
		      <a class="page-link" href="./list?pn=${pager.startNum-1}&kind=${pager.kind}&search=${pager.search}" aria-label="Previous">
		        <span aria-hidden="true">&lt;</span>
		      </a>
		    </li>
		    
		    	<!-- pager의 startNum부터 lastNum까지 찍음==>찍는걸 반복 -->
			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="n">
				<li class="page-item"><a class="page-link" href="./list?pn=${n}&kind=${pager.kind}&search=${pager.search}">${n}</a></li>
			</c:forEach> <!-- items 속성은 collection계열만 담당함 -->
			
			<li class="page-item">
		      <a class="page-link" href="./list?pn=${pager.lastNum+1}&kind=${pager.kind}&search=${pager.search}" aria-label="Next">
		        <span aria-hidden="true">&gt;</span>
		      </a>
		    </li>
		   
		    <li class="page-item">
		      <a class="page-link" href="./list?pn=${pager.totalPage}&kind=${pager.kind}&search=${pager.search}" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
		  </ul>
		</nav>
		
		<a href="./insert" class="btn btn-danger">ADD</a>
	</div>
</body>
</html>