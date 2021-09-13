<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update page</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="../temp/boot_nav.jsp"></c:import>
	<h1>Update page</h1>
	<br>	

	<div class="container">
		<form id="frm" action="update" method="post"> <!-- 앞에 아무것도 안쓰면 상대경로이자 현재경로 "./join"과 같음 -->
			
			<div class="mb-3">
    			<label for="pw" class="form-label">Password</label>
    			<input type="password" name="pw" class="form-control put pws" id="pw1" value="${member.pw}">
  			</div>
  			<div class="mb-3">
    			<label for="pw2" class="form-label">Password 확인</label>
    			<input type="password" class="form-control put pws" id="pw2" placeholder="password를 한번 더 입력하세요">
  				<div id="pwResult"></div>
  			</div>
  			<div class="mb-3">
    			<label for="phone" class="form-label">휴대폰번호</label>
    			<input type="tel" name="phone" class="form-control put" id="phone" value="${member.phone}">
			</div>
			<div class="mb-3">
    			<label for="email" class="form-label">E-Mail</label>
    			<input type="email" name="email" class="form-control put" id="email" value="${member.email}">
			</div>
			<br>
		<button id="btnid" type="submit" class="btn btn-primary">Update</button>
		</form>
	
	</div>

<script type="text/javascript" src="../resources/js/join.js"></script>
</body>
</html>