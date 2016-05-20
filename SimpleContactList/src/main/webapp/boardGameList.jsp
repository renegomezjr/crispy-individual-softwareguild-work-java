<%-- 
    Document   : boardGameList.jsp
    Created on : Mar 25, 2016, 1:41:22 PM
    Author     : Rene Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of Awesome Board Games</title>
    </head>
    <body>
        <h1>Board Game List</h1>
        
        <c:forEach items="${myExcellentLibrary}" var="boardGame">
            <c:out value="${boardGame.name}" default="****bad entry****"/>
            (<c:out value="${boardGame.publisher}" default="Unknown"/>)
            <br/>
            min - <c:out value="${boardGame.minPlayers}" default="?"/>,
            max - <c:out value="${boardGame.maxPlayers}" default="?"/>
            <br/>
            <c:out value="${boardGame.avgDuration}" default="?"/>hrs
            <hr/>
        </c:forEach>
            
    </body>
</html>
