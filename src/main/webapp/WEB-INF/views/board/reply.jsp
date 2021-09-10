<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reply page</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="../temp/boot_nav.jsp"></c:import>
<h1> ${board} Reply page</h1>

<div class="container-fluid">
	<form class="col-md-5 mx-auto" action="./reply" method="post">
		<input type="hidden" name="num" value="${param.num}">
		<div class="mb-3">
		  <label for="title" class="form-label">TITLE</label>
		  <input type="text" class="form-control" name="title" id="title" placeholder="Enter TITLE">
		</div>
		
		<div class="mb-3">
		  <label for="writer" class="form-label">WRITER</label>
		  <input type="text" class="form-control" name="writer" id="writer" placeholder="Enter WRITER">
		</div>
		
		<div class="mb-3">
		  <label for="contents" class="form-label">CONTENTS</label>
		  <textarea type="text" class="form-control" cols="" rows="6" name="contents" id="contents" placeholder="Enter CONTENTS"></textarea>
		</div>

		<button type="submit" class="btn btn-dark">답글달기</button>

	</form>
</div>

</body>
</html>