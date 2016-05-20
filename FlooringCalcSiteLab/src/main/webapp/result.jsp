<%-- 
    Document   : result.jsp
    Created on : Mar 28, 2016, 10:18:22 AM
    Author     : Rene Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! Here is the results of your Flooring Order</h1>
        <c:if test="${badInput == true}">
            Please go back and provide actual correct input.
            <a href="index.jsp">
                Return to flooring form.
            </a>
        </c:if>
            
            <c:out value="${width}" default="n/a" />ft *
            <c:out value="${length}" default="n/a" />ft =
            <c:out value="${flooringArea}" default="n/a" />sqft <br/>
            
            <c:out value="${flooringArea}" default="n/a" />sqft *
            $<c:out value="${costSqFt}" default="n/a" />/sqft =
            $<c:out value="${flooringCost}" default="n/a" /> <br/>
            
            <c:out value="${flooringArea}" default="n/a"/>/ 5sqft/hr = 
            <c:out value="${laborTime}" default="n/a"/> 15m increments (rounded to next 15m increment)
            <br/>
            <c:out value="${laborTime}" default="n/a"/> 15m increments * $86/hr = 
            $<c:out value="${laborCost}" default="n/a"/>
            
                
            
    </body>
</html>
