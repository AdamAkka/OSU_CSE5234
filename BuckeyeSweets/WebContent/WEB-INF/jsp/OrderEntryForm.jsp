<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
			<title>Order Entry Form</title>
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
	</head>
		<body>
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
								<input type="hidden" name="items.get(${status.index}).name" value="${item.name}" />
								<!-- <form:input path="items[${loop.index}].name" readonly="true" /> -->
							</td>
							<td>$
                                ${item.price}
								<input type="hidden" name="items.get(${status.index}).price" value="${item.price}" />
								<!-- <form:input path="items[${loop.index}].price" readonly="true" /> -->
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
</html>