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

</head>

<body>
	<jsp:include page="header.jsp"/><br/>
	<h2 align="center"> Please enter your payment information here:</h2>
	
    <form:form modelAttribute="paymentInfo" method="post" action="submitPayment">
        <table class="center">
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

        </table>

            <tr>
                <td colspan="2">
                	<br/>
                    <input type="submit" value="Submit Payment" class="button">
                </td>
            </tr>

    </form:form>
</body>
	<jsp:include page="footer.jsp"/>
</html>