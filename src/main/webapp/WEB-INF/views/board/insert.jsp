<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert page</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="../temp/boot_nav.jsp"></c:import>
<h1> ${board} Insert page</h1>

<div class="container-fluid">
	<form class="col-md-5 mx-auto" action="./insert" method="post">
		<div class="mb-3">
		  <label for="title" class="form-label">글제목</label>
		  <input type="text" class="form-control" name="title" id="title" placeholder="Enter TITLE">
		</div>
		<div class="mb-3">
		  <label for="contents" class="form-label">글내용</label>
		  <input type="text" class="form-control" name="contents" id="contents" placeholder="Enter CONTENTS">
		</div>
		<div class="mb-3">
		  <label for="writer" class="form-label">작성자</label>
		  <input type="text" class="form-control" name="writer" id="writer" placeholder="Enter WRITER">
		</div>
		
		<button type="submit" class="btn btn-dark">입력완료</button>

	</form>
</div>

</body>
</html>