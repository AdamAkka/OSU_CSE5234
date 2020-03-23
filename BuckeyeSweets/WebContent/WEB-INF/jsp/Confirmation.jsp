<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mystyle.css">
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/images/buckeyeFavicon.png">
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
	<jsp:include page="header.jsp" /><br />
	<br />
	<br />
	<h2>
		Your order has been submitted successfully. <br /> <br /> Thank you!
		<br />				
	</h2>
	<h3 id=confirmation>Here is your order confirmation number: "${confirmationCode}"</h3>
	
</body>
<jsp:include page="footer.jsp" />
</html>