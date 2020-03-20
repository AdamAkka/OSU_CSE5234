<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mystyle.css" >
    <meta charset="ISO-8859-1">
    <title>Shipping Entry Form</title>

</head>

<body>
	<jsp:include page="header.jsp"/><br/>
	<h2 align="center"> Please enter your shipping information here:</h2>
	
    <form:form modelAttribute="shippingInfo" method="post" action="submitShipping">
        <table class="center">
            <tr>
                <td>Name</td>
                <td>
                    <form:input path="name" />
                </td>
            </tr>
            <tr>
                <td>Address (Line 1)</td>
                <td>
                    <form:input path="addressLine1" />
                </td>
            </tr>
            <tr>
                <td>Address (Line 2)</td>
                <td>
                    <form:input path="addressLine2" />
                </td>
            </tr>

            <tr>
                <td>City</td>
                <td>
                    <form:input path="city" />
                </td>
            </tr>
            <tr>
                <td>State</td>
                <td>
                    <form:input path="state" />
                </td>
            </tr>
            <tr>
                <td>Zip Code</td>
                <td>
                    <form:input path="zip" />
                </td>
            </tr>
            <tr>
                <td>Country</td>
                <td>
                    <form:input path="country" />
                </td>
            </tr> 
        </table>
        
            <tr>
                <td colspan="2">
                <br/>
                    <input type="submit" value="Submit Shipping Information" class="button">
                </td>
            </tr>

    </form:form>
</body>
	<jsp:include page="footer.jsp"/>
</html>