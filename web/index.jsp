<%-- 
    Document   : index
    Created on : 23/09/2014, 10:14:27 AM
    Author     : DTYS
--%>

<%@ page contentType="text/html; charset=ISO-8859-1" language="java" session="true" 
         import="java.sql.*"
         import="java.io.*"
         import="java.util.*"	
         import="java.util.Date"
         import="java.text.SimpleDateFormat"
         import="java.util.LinkedList"
         import ="beans.beanSesion"
         errorPage="" %>
<%@ include file="/WEB-INF/views/include.jsp" %>


<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="Ajax.js"></script>
        <title>:::: SISNOUX ::::</title>
        <link href="FormatosValidaciones/formato.css" rel="stylesheet" type="text/css" media="screen" style="float:right; margin-left:15px;"/>
        <link href="FormatosValidaciones/styles.css" rel="stylesheet" type="text/css" media="screen" style="float:right; margin-left:15px;"/>

        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">       

    </head>
    <body>
        <c:redirect url="/hello.htm"/>
    </body>
</html>
