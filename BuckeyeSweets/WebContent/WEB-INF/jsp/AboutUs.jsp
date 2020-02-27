<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/mystyle.css">
<meta charset="ISO-8859-1">
<title>About Us</title>
</head>
<body>
	<jsp:include page="header.jsp" /><br />

	<h2>About Us</h2>
	<table class="center">
		<tr>
			<th width=120px>Name</th>
			<th width=100px>Email</th>
			<th width=250px>Occupation</th>
			<th width=600px>Introduction</th>
		</tr>
		<tr>
			<td><img width="90" height="90"
				src="${pageContext.request.contextPath}/images/adamphoto.jpg" /><br />
				Adam A.</td>
			<td>Adam@buckeyesweets.com</td>
			<td>Co-founder, Tech Enthusiast</td>
			<td>Passionate about providing the best quality and service to
				our guests!</td>
		</tr>
		<tr>
			<td><img width="90" height="90"
				src="${pageContext.request.contextPath}/images/famzoo.jpg"
				class="image" /><br /> Alesia L.</td>
			<td>Alesia@buckeyesweets.com</td>
			<td>Co-founder, Baking Specialist</td>
			<td>I enjoy bringing a sweet smile to the world!</td>
		</tr>

	</table>

	<h3>Mission Statement</h3>
	<p>Our mission is to create a bakery which makes the best quality
		baked goods and sweets on site from scratch, fresh daily! We offer a
		variety of baked goods and sweets, such as:
	<ul>
		<li>Cookies</li>
		<li>Cupcakes</li>
		<li>Buckeyes</li>
		<li>Pies</li>
	</ul>
	and many more... click
	<a href="${pageContext.request.contextPath}/purchase" class="options">Shop</a>
	to start shopping!
	

</body>
<jsp:include page="footer.jsp" />
</html>