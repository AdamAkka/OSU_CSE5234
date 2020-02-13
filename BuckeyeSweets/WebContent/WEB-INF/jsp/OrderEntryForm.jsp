<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Order Entry Form</title>
</head>

<body>
    <form:form modelAttribute="order" method="post" action="purchase/submitItems">
        <table>
            <c:forEach items="${order.items}" var="item" varStatus="status">
                <tr>
                    <td>
                       ${item.name}<input type="hidden" name="items[${status.index}].name" value="item.name" />  
                    </td>
                                    
                    <td>$
                        ${item.price}<input type="hidden" name="items[${status.index}].price" value="item.price" />
                    </td>
                    <td>
                        <!-- <form:input path="items[${status.index}].quantity" /> -->
                        
                        <form:input path="item.quantity" />
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Purchase">
                </td>
            </tr>

        </table>
    </form:form>
</body>

</html>