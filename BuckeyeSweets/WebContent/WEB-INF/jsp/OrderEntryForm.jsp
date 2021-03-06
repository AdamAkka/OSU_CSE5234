<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/mystyle.css">
<meta charset="ISO-8859-1">
<title>Order Entry Form</title>

</head>
<body>
	<jsp:include page="header.jsp" /><br />

	<c:if test="${!valid}">
	<h3><b>Please check the quantities and resubmit!</b></h3>
	</c:if>
	
	<h2 align="center">Please select the items and quantities below:</h2>

	<form:form modelAttribute="order" method="post"
		action="purchase/submitItems">
		<table class="center">
			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Quantity</th>
			</tr>
			<c:forEach items="${order.myItemList}" var="item" varStatus="loop">
				<tr>
					<td>${item.name}<form:input path="myItemList[${loop.index}].name"
							type="hidden" name="myItemList.get(${loop.index}).name"
							value="${item.name}" />
					</td>
					<td>$ ${item.price} <form:input
							path="myItemList[${loop.index}].price" type="hidden"
							name="myItemList.get(${loop.index}).price" value="${item.price}" />
					</td>
					<td><form:input path="myItemList[${loop.index}].quantity"
							style="text-align:center" /></td>
				</tr>
			</c:forEach>

		</table>

		<tr>
			<td colspan="2"><br /> <input type="submit" value="Purchase"
				class="button"></td>
		</tr>


	</form:form>
</body>

<jsp:include page="footer.jsp" />
</html>