<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Shipping Entry Form</title>
    
    <style>
      table {
      border-collapse:collapse;
      width: 500px;
      }
      td, th { 
      padding: 10px; 
      border-bottom: 2px solid red; 
      text-align: center;
      }
    </style>
</head>

<body>
	<p style="font-style:italic;font-size: 1.5em;"> Please enter your shipping information here:</p> <br/>
	
    <form:form modelAttribute="shippingInfo" method="post" action="submitShipping">
        <table>
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
                <td colspan="2">
                    <input type="submit" value="Submit Shipping Information">
                </td>
            </tr>

        </table>
    </form:form>
</body>

</html>