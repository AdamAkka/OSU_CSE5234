<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mystyle.css" >
		<meta charset="ISO-8859-1">
			<title>Order Entry Form</title>
<!-- 
	<style>
      table {
      border-collapse:collapse;
      }
      td, th { 
      padding: 10px; 
      border-bottom: 2px solid #8ebf42; 
      text-align: center;
      }
    </style>
-->
	</head>
		<body>
		<jsp:include page="header.jsp"/><br/>
		<p>Please Select The Items and Quantities Below:</p>
			<form:form modelAttribute="order" method="post" action="purchase/submitItems">
				<table>
					<tr>
						<th>Name</th>
						<th>Price</th>
						<th>Quantity</th>
					</tr>
					<c:forEach items="${order.items}" var="item" varStatus="loop">
						<tr>
							<td>${item.name}
								<input type="hidden" name="items.get(${loop.index}).name" value="${item.name}" />
							</td>
							<td>$
                                ${item.price}
								<input type="hidden" name="items.get(${loop.index}).price" value="${item.price}" />
							</td>
							<td>
								<form:input path="items[${loop.index}].quantity" style="text-align:center" />
							</td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="1">
							<input type="submit" value="Purchase">
						</td>
					</tr>
				</table>
			</form:form>
		</body>
		
		<jsp:include page="footer.jsp"/>
</html>