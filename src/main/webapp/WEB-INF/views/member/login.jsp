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
	<h1>Login Page</h1>
	
	<div class="container">
		<form id="frm" action="login" method="post"> <!-- 앞에 아무것도 안쓰면 상대경로이자 현재경로 "./join"과 같음 -->
  			<div class="mb-3">
    			<label for="id" class="form-label">ID</label>
    			<input type="text" name="id" class="form-control put" id="id">
			</div>

  			<div class="mb-3">
    			<label for="pw" class="form-label">Password</label>
    			<input type="password" name="pw" class="form-control put pws" id="pw">
  			</div>

			<br>
		<button id="btnid" type="submit" class="btn btn-primary">Join</button>
		</form>
	
	</div>
</body>
</html>