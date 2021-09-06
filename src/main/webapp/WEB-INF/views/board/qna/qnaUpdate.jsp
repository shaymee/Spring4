<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../../temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="../../temp/boot_nav.jsp"></c:import>
<h1>${board} Update page</h1>

<div class="container-fluid">
	<form class="col-md-5 mx-auto" action="./update" method="post">
	<div>
		<label for="num" class="form-label">글번호</label>
		<input type="text" readonly="readonly" value="${dto.num}" name="num">
	</div>
	
	<div>
		<label for="writer" class="form-label">작성자</label>
		<input type="text" readonly="readonly" value="${dto.writer}" name="writer">
	</div>
	
	<div class="mb-3">
		<label for="name" class="form-label">글제목</label>
		<input type="text" class="form-control" value="${dto.title}" name="title" id="title">
	</div>
	
	<div class="mb-3">
	 	<label for="contents" class="form-label">글내용</label>
  		<textarea class="form-control" id="contents" name="contents" rows="3">${dto.contents}</textarea>
	</div>
	
	<button type="submit" class="btn btn-danger">Update</button>
	</form>
</div>
</body>
</html>