<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Payment Entry Form</title>
</head>

<body>

    <form:form modelAttribute="paymentInfo" method="post" action="submitPayment">
        <table>
            <tr>
                <td>Card Number</td>
                <td>
                    <form:input path="${paymentInfo.cardNumber}" />
                </td>
            </tr>
            <tr>
                <td>Expiration Date</td>
                <td>
                    <form:input path="${paymentInfo.expirationDate}" />
                </td>
            </tr>
            <tr>
                <td>CCV Code</td>
                <td>
                    <form:input path="${paymentInfo.ccvCode}" />
                </td>
            </tr>

            <tr>
                <td>Card Holder Name</td>
                <td>
                    <form:input path="${paymentInfo.cardHolderName}" />
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

</html>