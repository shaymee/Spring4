<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join page</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="../temp/boot_nav.jsp"></c:import>
	<h1>Join page</h1>
	<br>	

	<div class="container">
		<form id="frm" action="join" method="post"> <!-- 앞에 아무것도 안쓰면 상대경로이자 현재경로 "./join"과 같음 -->
  			<div class="mb-3">
    			<label for="id" class="form-label">ID</label>
    			<input type="text" name="id" class="form-control put" id="id">
				<button type="button" id="idCheck">ID중복확인</button>
				<div id="idResult"></div>
			</div>
			
			<div class="mb-3">
    			<label for="name" class="form-label">이름</label>
    			<input type="text" class="form-control put" id="name">
    		</div>
  			<div class="mb-3">
    			<label for="pw" class="form-label">Password</label>
    			<input type="password" class="form-control put pws" id="pw1">
  			</div>
  			<div class="mb-3">
    			<label for="pw2" class="form-label">Password 확인</label>
    			<input type="password" class="form-control put pws" id="pw2" placeholder="password를 한번 더 입력하세요">
  				<div id="pwResult"></div>
  			</div>
  			<div class="mb-3">
    			<label for="phone" class="form-label">휴대폰번호</label>
    			<input type="tel" class="form-control put" id="phone">
			</div>
			<div class="mb-3">
    			<label for="email" class="form-label">E-Mail</label>
    			<input type="email" class="form-control put" id="email">
			</div>
			<br>
		<button id="btnid" type="button" class="btn btn-primary">Join</button>
		</form>
	
	</div>

<script type="text/javascript" src="../resources/js/join.js"></script>
</body>
</html>