<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page import="edu.osu.cse5234.controller.Order" %>
<%@ page import="edu.osu.cse5234.controller.PaymentInfo" %>
<%@ page import="edu.osu.cse5234.controller.ShippingInfo" %>
<%@ page import="edu.osu.cse5234.controller.Item" %>

<!DOCTYPE html>
<html>

<head>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mystyle.css" >
    <meta charset="ISO-8859-1">
    <title>View Order</title>
</head>

<body>

	<%
		response.getWriter().println("<br/>Your Order Summary :<br/><br/><br/>");
//		Order order = (Order)request.getSession().getAttribute("order");
//		List<Item> items = order.getItems();
//		response.getWriter().println("<br/>Your items are:" + order.getItems() + "<br/>");
//		response.getWriter().println("<br/>Your items are:" + items + "<br/>");
//		response.getWriter().println("<br/>The items list size is:" + items.size() + "<br/>");
		
//		double totalAmount = 0;
//		for (int i = 0; i < items.size(); i++) {
	
//			response.getWriter().println("<br/>Your items are:" + items.get(i) + "<br/>");
//		}
///////////////////////////////////////////////////////////////////////////////	
//		response.getWriter().println("<br />Your Order Summary Is As Follows:<br /><br />");
		Order order = (Order)request.getSession().getAttribute("order");
		
		List<Item> lineItemList = order.getItems();
//		response.getWriter().println(lineItemList.getName() + "<br/> <br/>");
		
//		double totalAmount = 0;
		for (int i = 0; i < lineItemList.size(); i++) {
			Item lineItem = lineItemList.get(i);
//			if (lineItem.getQuantity() > 0) {
//			totalAmount += lineItem.getPrice() * lineItem.getQuantity();
				response.getWriter().println("Item Name: " + lineItem.getName() 
					+ ", Price Per Item: " + lineItem.getPrice()
					+ ", Quantity: " + lineItem.getQuantity() + "<br />");
			}
//		}
		
////////////////////////////////////////////////////////////////////////////////		
		PaymentInfo paymentInfo = (PaymentInfo)request.getSession().getAttribute("paymentInfo");
		
		response.getWriter().println("<br/>Your Payment Information: <br/><br/>"
			+ "<br/>Credit Card Number: " + paymentInfo.getCardNumber()
			+ "<br/>Expiration Date: " + paymentInfo.getExpirationDate()
			+ "<br/>CVV Code: " + paymentInfo.getCcvCode()
			+ "<br/>Card Holder Name: " + paymentInfo.getCardHolderName());
		
		
		ShippingInfo shippingInfo = (ShippingInfo)request.getSession().getAttribute("shippingInfo");
		
		response.getWriter().println("<br/><br/><br/>Your Shipping Information: <br/><br/>"
			+ "<br />Name: " + shippingInfo.getName()
			+ "<br />Address Line 1: " + shippingInfo.getAddressLine1()
			+ "<br />Address Line 2: " + shippingInfo.getAddressLine2()
			+ "<br />City: " + shippingInfo.getCity()
			+ "<br />State: " + shippingInfo.getState()
			+ "<br />Country: " + shippingInfo.getZip());
		
//		response.getWriter().println("<br/><br/> Your Total Is: $" + totalAmount);
		
	
	%>
	<br/><br/>
	<form:form modelAttribute="order" method="post" action="confirmOrder">
		<table>
			<tr>
				<td colspan="2">
					<input type="submit" value="Confirm" />
				</td>
			</tr>
		</table>
	</form:form>
	
	<jsp:include page="footer.jsp"/>

</body>