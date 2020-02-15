<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mystyle.css" >
    <meta charset="ISO-8859-1">
    <title>Payment Entry Form</title>
<!-- 
    <style>
      table {
      border-collapse:collapse;
      width: 500px;
      }
      td, th { 
      padding: 10px; 
      border-bottom: 2px solid blue; 
      text-align: center;
      }
    </style>
-->
</head>

<body>
	<jsp:include page="header.jsp"/><br/>
	<p> Please enter your payment information here:</p> <br/>
	
    <form:form modelAttribute="paymentInfo" method="post" action="submitPayment">
        <table>
            <tr>
                <td>Card Number</td>
                <td>
                    <form:input path="cardNumber" />
                </td>
            </tr>
            <tr>
                <td>Expiration Date</td>
                <td>
                    <form:input path="expirationDate" />
                </td>
            </tr>
            <tr>
                <td>CCV Code</td>
                <td>
                    <form:input path="ccvCode" />
                </td>
            </tr>

            <tr>
                <td>Card Holder Name</td>
                <td>
                    <form:input path="cardHolderName" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit Payment">
                </td>
            </tr>

        </table>
    </form:form>
</body>
	<jsp:include page="footer.jsp"/>
</html>