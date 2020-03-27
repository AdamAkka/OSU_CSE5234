<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/mystyle.css">
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/images/buckeyeFavicon.png">
<meta charset="ISO-8859-1">
<title>Contact Us</title>
</head>
<body>
	<jsp:include page="header.jsp" /><br />

	<h2>Contact Us</h2>
	<br />

	<table style="margin: 0 auto;">
		<tr>
			<th>Service</th>
			<th>Telephone #</th>
			<th>Email Address</th>
		</tr>
		<tr>
			<td>Special Orders &amp; Events</td>
			<td>513-111-2233 ext. 100</td>
			<td>special_orders@buckeyesweets.com</td>
		</tr>
		<tr>
			<td>Customer Service</td>
			<td>513-111-2233 ext. 200</td>
			<td>customer_service@buckeyesweets.com</td>
		</tr>
		<tr>
			<td>Technical Support</td>
			<td>513-111-2233 ext. 300</td>
			<td>tech_support@buckeyesweets.com</td>
		</tr>
	</table>

</body>
<jsp:include page="footer.jsp" />
</html>