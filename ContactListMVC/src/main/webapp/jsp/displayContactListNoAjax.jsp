<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Company Contacts</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">

            <h1>Company Contacts</h1>
            <hr/>
            <%@include file="defaultFragment.jsp" %>

            <!-- #2 - Personalized welcome message -->
            Hello <sec:authentication property="principal.username" />!<br/>
            <!-- #3 - Only render this link if user has admin role -->
            <sec:authorize access="hasRole('ROLE_ADMIN')">
                <a href="displayNewContactFormNoAjax">Add a Contact</a><br/>
            </sec:authorize>
            <hr/> 
            <c:if test="${fromSearch}">
                Here are the results of your search...<br/>
                <c:if test="${listSize < 1}">
                    No results found. Please try again.
                </c:if>
            </c:if>

            <c:forEach var="contact" items="${contactList}">

                <s:url value="deleteContactNoAjax" var="deleteContact_url">
                    <s:param name="cId" value="${contact.contactId}"/>
                </s:url>

                <s:url value="editContactNoAjax" var="editContact_url">
                    <s:param name="cId" value="${contact.contactId}"/>
                </s:url>


                Name:
                <c:if test="${contact.lastName == 'Ferguson'}">
                    Mr.
                </c:if>
                ${contact.firstName} ${contact.lastName} | 
                <!-- #4 - Only render Edit and Delete links for users with admin role -->
                <sec:authorize access="hasRole('ROLE_ADMIN')"> 
                    <a href="${deleteContact_url}">Delete</a> | 
                    <a href="${editContact_url}">Edit</a> <br/>
                </sec:authorize>
                Company: ${contact.company}<br/>
                Phone: ${contact.phone}<br/>
                Email: ${contact.email}<br/>
                <hr/>


            </c:forEach>

        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

