<%-- 
    Document   : hello
    Created on : 2/12/2014, 12:51:22 PM
    Author     : cesar_ar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello :: Spring Application</title>        
    </head>
    <body>
        <h1>Hello - Spring Application</h1>
         <p>Greetings, it is now <c:out value="${now}"/></p>        
    </body>
</html>
