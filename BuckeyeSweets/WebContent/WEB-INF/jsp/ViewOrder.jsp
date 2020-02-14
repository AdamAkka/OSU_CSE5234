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
    <meta charset="ISO-8859-1">
    <title>View Order</title>
</head>

<body>
	<%
		response.getWriter().println("<br/>Order Summary :<br/><br/>");
	
		Order order = (Order)request.getSession().getAttribute("order");
		
		List<Item> items = order.getItems();
		
		response.getWriter().println("<br/>Your items are:" + items + "<br/>");
		
		response.getWriter().println("<br/>The items list size is:" + items.size() + "<br/>");
		
		double totalAmount = 0;
		for (int i = 0; i < items.size(); i++) {
	
			response.getWriter().println("<br/>Your items are:" + items.get(i) + "<br/>");

		}
		
//		double totalAmount = 0;
//		for (int i = 0; i < items.size(); i++) {
//			Item items = items.get(i);
//			if (items.getQuantity() > 0) {
//			totalAmount += items.getPrice() * items.getQuantity();
//				response.getWriter().println("Item Name: " + items.getName() 
//					+ ", Price Per Item: " + lineItem.getPrice()
//					+ ", Quantity: " + items.getQuantity() + "<br />");
//			}
//		}
		
		
		PaymentInfo paymentInfo = (PaymentInfo)request.getSession().getAttribute("paymentInfo");
		
		response.getWriter().println("<br/>Your Payment Information:"
			+ "<br/>Credit Card Number: " + paymentInfo.getCardNumber()
			+ "<br/>Expiration Date: " + paymentInfo.getExpirationDate()
			+ "<br/>CVV Code: " + paymentInfo.getCcvCode()
			+ "<br/>Card Holder Name: " + paymentInfo.getCardHolderName());
		
		
		ShippingInfo shippingInfo = (ShippingInfo)request.getSession().getAttribute("shippingInfo");
		
		response.getWriter().println("<br/><br/>Your Shipping Information:"
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

</body>