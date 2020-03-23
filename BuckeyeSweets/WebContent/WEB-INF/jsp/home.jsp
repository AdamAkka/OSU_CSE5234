<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/homestyle.css">
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/images/buckeyeFavicon.png">
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<jsp:include page="header.jsp" /><br />
	<br />

	<h2>Welcome to Buckeye Sweets!</h2>

	<br />
	<br />

	<h4>
		Please click <a href="${pageContext.request.contextPath}/purchase"
			class="options">Shop</a> to start shopping.
	</h4>

	<jsp:include page="footer.jsp" />

</body>
</html>