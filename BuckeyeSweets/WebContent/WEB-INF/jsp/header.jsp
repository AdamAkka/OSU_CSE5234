<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/headerstyle.css">
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body>
	<h1>
		<img width="70" height="70"
			src="${pageContext.request.contextPath}/images/buckeyes.jpg"
			class="image" /> Buckeye Sweets
	</h1>

	<h3>Your Favorite Baked Goods Shop!</h3>
	<br />

	<a href="${pageContext.request.contextPath}/" class="options">Home</a>
	<a href="${pageContext.request.contextPath}/purchase" class="options">Shop</a>
	<a href="${pageContext.request.contextPath}/AboutUs" class="options">About
		Us</a>
	<a href="${pageContext.request.contextPath}/ContactUs" class="options">Contact
		Us</a>
	<br />
</body>
</html>