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

<body style="text-align:center">

	
    <% 
    response.getWriter().println("<h1>Your Order Summary :</h1>");
	Order order = (Order)request.getSession().getAttribute("order"); 
	List<Item> items = order.getItems();

///////////////////////////////////////////////////////////////////////////////	

//		response.getWriter().println("<b>Item Name	&emsp;	Price Per Item	&emsp;	Quantity</b><br/>");

		double totalAmount = 0;
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			String name = item.getName();
			Double price = item.getPrice();
			Integer quantity = item.getQuantity();
			
			
					
			if (item.getQuantity() > 0) {
				totalAmount += price * quantity;
				response.getWriter().println("<b>Item Name: </b>" + name 
					+ "| <b>Price Per Item: </b>$" + price
					+ "| <b>Quantity: </b>" + quantity + "<br/>");
			}
		}
		
		String total = String.format("%,.2f", totalAmount);
		
		response.getWriter().println("<br/><font size=5> Your total is: <b>$" + total + "</font></b><br/>");
		response.getWriter().println("--------------------------------------------------------------------------");
////////////////////////////////////////////////////////////////////////////////		
		PaymentInfo paymentInfo = (PaymentInfo)request.getSession().getAttribute("paymentInfo");
		
		response.getWriter().println("<br/><h2>Your Payment Information: </h2>"
			+ "<br/><b>Credit Card Number: </b>" + paymentInfo.getCardNumber()
			+ "<br/><b>Expiration Date: </b>" + paymentInfo.getExpirationDate()
			+ "<br/><b>CVV Code: </b>" + paymentInfo.getCcvCode()
			+ "<br/><b>Card Holder Name: </b>" + paymentInfo.getCardHolderName());
		response.getWriter().println("<br/>-------------------------------------------------");
		
		
		ShippingInfo shippingInfo = (ShippingInfo)request.getSession().getAttribute("shippingInfo");
		
		response.getWriter().println("<br/><br/><h2>Your Shipping Information: </h2>"
			+ "<br/><b>Name: </b>" + shippingInfo.getName()
			+ "<br/><b>Address (Line 1): </b>" + shippingInfo.getAddressLine1()
			+ "<br/><b>Address (Line 2): </b>" + shippingInfo.getAddressLine2()
			+ "<br/><b>City: </b>" + shippingInfo.getCity()
			+ "<br/><b>State: </b>" + shippingInfo.getState()
			+ "<br/><b>Country: </b>" + shippingInfo.getZip());
		response.getWriter().println("<br/>-------------------------------------------------");
		
		
	
	%>
	<br/><br/>
	<form:form modelAttribute="order" method="post" action="confirmOrder">
			<tr>
				<td colspan="2">
					<br/>
					<input type="submit" value="Confirm & Place Order" class="button"/>
				</td>
			</tr>
	</form:form>
	
	<jsp:include page="footer.jsp"/>

</body>