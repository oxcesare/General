<%-- 
    Document   : hello
    Created on : 2/12/2014, 12:51:22 PM
    Author     : cesar_ar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp" %>
<!DOCTYPE html>
<html>
    <head><title><fmt:message key="title"/></title></head>
    <body>
        <h1><fmt:message key="heading"/></h1>
        <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
<h3>Products</h3>
<c:forEach items="${model.products}" var="prod">
    <c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
</c:forEach>
 <br>
    <a href="<c:url value="priceincrease.htm"/>">Increase Prices</a>
    <br>
</body>
</html>