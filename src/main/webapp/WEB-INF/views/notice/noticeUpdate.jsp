<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="../temp/boot_nav.jsp"></c:import>
<h1>Update Page!</h1>

<div class="container-fluid">
	<form class="col-md-5 mx-auto" action="./noticeUpdate" method="post">
		<div class="mb-3">
			<label for="num" class="form-label">글번호</label>
			<input type="text" readonly="readonly" value="${dto.num}" name="num">
		</div>
		
		<div class="mb-3">
			<label for="writer" class="form-label">글쓴이</label>
			<input type="text" readonly="readonly" value="${dto.writer}" name="writer">
		</div>
		
		<div class="mb-3">
			<label for="regdate" class="form-label"></label>
			<input type="date" readonly="readonly" class="form-control" value="${dto.regdate}" name="regdate">
		</div>
		
		<div class="mb-3">
			<label for="title" class="form-label">글제목</label>
			<input type="text" class="form-control" value="${dto.title}" name="title">
		</div>
		
		<div>
			<label for="contents" class="form-label">본문</label>
			<input type="text" class="form-control" value="${dto.contents}" name="contents">
		</div>
		
		<button type="submit" class="btn btn-dark">Update Comeplete</button>
	</form>
</div>

</body>
</html>