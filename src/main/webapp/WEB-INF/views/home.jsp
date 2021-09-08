<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
	<script type="text/javascript">
		alert('Hello World!')
	</script>
	<link href="./resources/css/home.css" rel="stylesheet">
<c:import url="./temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="./temp/boot_nav.jsp"></c:import>
<h1>
	Main Page
</h1>

<img alt="" src="./resources/images/pachirisu2.jpg">


	<script type="text/javascript">
		console.log('body Script')
	</script>
</body>
</html>
