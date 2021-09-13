<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">shaymee</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="${pageContext.request.contextPath}/notice/list">Notice List</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="${pageContext.request.contextPath}/qna/list">QnA List</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true"><구분점></a>
        </li>
        
        <c:choose>
        	<c:when test="${not empty member}">        		
		        <li class="nav-item">
		          <a class="nav-link" href="${pageContext.request.contextPath}/member/mypage">MyPage</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="${pageContext.request.contextPath}/member/logout">Logout</a>
		        </li>		        
        	</c:when>
        	
        	<c:otherwise>
		        <li class="nav-item">
		          <a class="nav-link" href="${pageContext.request.contextPath}/member/check">Join</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="${pageContext.request.contextPath}/member/login">Login</a>
		        </li>        	
        	</c:otherwise>
        </c:choose>
        
        
      </ul>
    </div>
  </div>
</nav>