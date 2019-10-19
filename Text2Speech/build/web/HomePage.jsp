<%-- 
    Document   : HomePage
    Created on : Oct 7, 2019, 6:29:01 PM
    Author     : BangPC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.jsp"/>
    </head>
    <body>
        <form action="Home2ControlServlet">
        <h1 align="center">Text to speech with FPT API</h1>
        <p align="center">Please enter your name to start
        <p align="center"><input type="text" name="name" value="" size="30"/>
        <p align="center"><input type="submit" value="Let's Start" name="start" />
        <p align="center"><c:if test="${not empty error}">${error}</c:if>
        </form>
    </body>
    <jsp:include page="footer.jsp"/>
</html>
