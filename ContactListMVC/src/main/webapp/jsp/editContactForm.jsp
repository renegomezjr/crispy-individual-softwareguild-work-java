<%-- 
    Document   : editContactForm
    Created on : Apr 18, 2016, 10:16:04 AM
    Author     : Rene Gomez
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bad Form, but learning #<c:out value="${contactToEdit.contactId}" default="-1"/></title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>
        <div class="container">
            <h1>Company Contacts</h1>
            <hr/>
            <%@include file="defaultFragment.jsp" %>
            <div class="row">
                <div class="col-md-4">
                    <c:choose>
                        <c:when test="${contactToEdit == null}">
                            <h1>Contact does not exist.</h1>
                        </c:when>
                        <c:otherwise>
                            <h3><c:out value="${contactToEdit.firstName}"/>'s info</h3>
                            <form class="form-horizontal" role="form" method="POST" action="editContactFormSubmission">
                                <div class="form-group">
                                    <label for="edit-first-name" class="col-md-4 control-label">First Name:</label>
                                    <div class="col-md-8">
                                        <input type="text" class="form-control" id="edit-first-name" placeholder="First Name" name="firstName" value="<c:out value="${contactToEdit.firstName}"/>"/>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="edit-last-name" class="col-md-4 control-label">Last Name:</label>
                                    <div class="col-md-8">
                                        <input type="text" class="form-control" id="edit-last-name" placeholder="Last Name" name="lastName" value="<c:out value="${contactToEdit.lastName}"/>"/>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="edit-company" class="col-md-4 control-label">Company:</label>
                                    <div class="col-md-8">
                                        <input type="text" class="form-control" id="edit-company" placeholder="Company" name="company" value="<c:out value="${contactToEdit.company}"/>"/>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="edit-phone" class="col-md-4 control-label">Phone:</label>
                                    <div class="col-md-8">
                                        <input type="text" class="form-control" id="edit-phone" placeholder="Phone" name="phone" value="<c:out value="${contactToEdit.phone}"/>"/>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="edit-email" class="col-md-4 control-label">Email:</label>
                                    <div class="col-md-8">
                                        <input type="text" class="form-control" id="edit-email" placeholder="Email" name="email" value="<c:out value="${contactToEdit.email}"/>"/>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-md-offset-4 col-md-8">
                                        <button type="submit" id="edit-button" class="btn btn-success">Save Contact</button>
                                        <button type="button" class="btn btn-default">Close</button>
                                        <input type="hidden" id="edit-contactId" name="contactId" value="<c:out value="${contactToEdit.contactId}"/>"/>
                                    </div>
                                </div>
                            </form>
                        </c:otherwise>
                    </c:choose>
                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
