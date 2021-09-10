<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check page</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="../temp/boot_nav.jsp"></c:import>
	<h1>Check Page</h1>
	
<div class="container-fluid">
	<div class="form-check">
	  <input class="form-check-input" type="checkbox" value="" id="all">
	  <label class="form-check-label" for="all">
	    Check All
	  </label>
	</div>
	<div class="form-check">
	  <input class="form-check-input checks ch" type="checkbox" value="" id="ch2">
	  <label class="form-check-label" for="ch2">
	    약관1
	  </label>
	</div>
	<div class="form-check">
	  <input class="form-check-input checks ch" type="checkbox" value="" id="ch3">
	  <label class="form-check-label" for="ch3">
	    약관2
	  </label>
	</div>
	<div class="form-check">
	  <input class="form-check-input checks ch" type="checkbox" value="" id="ch4">
	  <label class="form-check-label" for="ch4">
	    약관3
	  </label>
	</div>		
	<div class="form-check">
	  <input class="form-check-input checks" type="checkbox" value="" id="ch5">
	  <label class="form-check-label" for="ch5">
	    약관4(광고성)- 체크를 해도 되고 안해도 상관x
	  </label>
	</div>		

	<button id="btn">회원가입</button>
<!-- 	<a href="./join" id="btn">회원가입</a> -->
</div>


<script type="text/javascript" src="../resources/js/member.js"></script>
</body>
</html>