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

	<div class="col-md-7 my-2 mx-auto">
	
		<!-- Search Form Setting -->
		<form action="./list" method="get">
			<div class="input-group mb-3">
				<select name="kind" class="form-select form-select-sm" aria-label=".form-select-sm example">
					<option value="title">TITLE</option>
					<option value="contents">CONTENTS</option>
					<option value="writer">WRITER</option>
				</select>
				
				<input type="text" name="search" class="form-control" aria-label="Text input with dropdown button">
				<button type="submit" class="btn outline-secondary">Search</button>
			</div>
		</form>
		<!-- /Search Form Setting -->
	
	
		<table class="table">
			<thead>
				<tr>
					<th>NUM</th>
					<th>TITLE</th>
					<th>CONTENTS</th>
					<th>WRITER</th>
					<th>REGDATE</th>
					<th>HITS</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="dtos" varStatus="i">
					<tr>
						<td>${dtos.num}</td>
						<td><span class="c1" data-writer-num="${i.index}">
						<c:catch>
							<c:forEach begin="1" end="${dtos.depth}">
								->
							</c:forEach>
						</c:catch>						
						${dtos.title}</span></td>
						<td>${dtos.contents}</td>
						<td><span id="w${i.index}">${dtos.writer}</span></td> 
						<td>${dtos.regdate}</td>
						<td>${dtos.hits}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
		<!-- Paging Setting -->
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
		    
			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="n">
				<li class="page-item"><a class="page-link" href="./list?pn=${n}&kind=${pager.kind}&search=${pager.search}">${n}</a></li>
			</c:forEach>
			
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
		<!-- /Paging Setting -->
		
		<a href="./insert" class="btn btn-danger">ADD</a>
		<button id="btn">CLICK</button>
	</div>
<script type="text/javascript" src="../resources/js/list.js"></script>
</body>
</html>