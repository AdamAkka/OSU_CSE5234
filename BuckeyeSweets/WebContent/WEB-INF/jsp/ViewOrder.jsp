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

//    for(int i=0; i < items.size(); i++) {
//		(items.get(i)).getName();            
//        (items.get(i)).getPrice();
        
//        response.getWriter().println("Item Name: " + (items.get(i)).getName() 
//		+ ", Price Per Item: " + (items.get(i)).getPrice()
//		+ ", Quantity: " + (items.get(i)).getQuantity() + "<br/>");
 //   }
    
//		response.getWriter().println("<h1>Your Order Summary :</h1>");
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

//		Order order = (Order)request.getSession().getAttribute("order");
		
//		List<Item> items = order.getItems();
		
//		Iterator iter = items.iterator();
		
//		response.getWriter().println(iter + "<br/><br/>");
		
//		while (iter.hasNext()){
//			Object item = iter.next();
//			response.getWriter().println(item + "<br/><br/>");		
//	}

		double totalAmount = 0;
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			if (item.getQuantity() > 0) {
//				totalAmount += items.getPrice() * items.getQuantity();
				response.getWriter().println("Item Name: " + item.getName() 
					+ ", Price Per Item: " + item.getPrice()
					+ ", Quantity: " + item.getQuantity() + "<br />");
			}
		}
		
//		response.getWriter().println("<br/><br/> Your total is: $" + totalAmount + "<br />");
		
////////////////////////////////////////////////////////////////////////////////		
		PaymentInfo paymentInfo = (PaymentInfo)request.getSession().getAttribute("paymentInfo");
		
		response.getWriter().println("<br/><h2>Your Payment Information: </h2>"
			+ "Credit Card Number: " + paymentInfo.getCardNumber()
			+ "<br/>Expiration Date: " + paymentInfo.getExpirationDate()
			+ "<br/>CVV Code: " + paymentInfo.getCcvCode()
			+ "<br/>Card Holder Name: " + paymentInfo.getCardHolderName());
		
		
		ShippingInfo shippingInfo = (ShippingInfo)request.getSession().getAttribute("shippingInfo");
		
		response.getWriter().println("<br/><br/><h2>Your Shipping Information: </h2>"
			+ "Name: " + shippingInfo.getName()
			+ "<br/>Address (Line 1): " + shippingInfo.getAddressLine1()
			+ "<br/>Address (Line 2): " + shippingInfo.getAddressLine2()
			+ "<br/>City: " + shippingInfo.getCity()
			+ "<br/>State: " + shippingInfo.getState()
			+ "<br/>Country: " + shippingInfo.getZip());
		
//		response.getWriter().println("<br/><br/> Your Total Is: $" + totalAmount);
		
	
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