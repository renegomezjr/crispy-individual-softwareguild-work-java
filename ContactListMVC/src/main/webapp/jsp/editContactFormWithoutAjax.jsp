<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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


            <sf:form class="form-horizontal" role="form" modelAttribute="contactToEdit"
                     action="editContactNoAjax" method="POST">
                <div class="form-group">
                    <label for="edit-first-name" class="col-md-4 control-label">First Name:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-first-name" path="firstName" placeholder="First Name"/>
                        <sf:errors path="firstName" cssClass="error" cssStyle="color:red">

                        </sf:errors>
                    </div>

                </div>

                <div class="form-group">
                    <label for="edit-last-name" class="col-md-4 control-label">Last Name:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-last-name" path="lastName" placeholder="Last Name"/>
                        <sf:errors path="lastName" cssClass="error">

                        </sf:errors>
                    </div>
                </div>

                <div class="form-group">
                    <label for="edit-company" class="col-md-4 control-label">Company:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-company" path="company" placeholder="Company"/>
                        <sf:errors path="company" cssClass="error">

                        </sf:errors>
                    </div>
                </div>

                <div class="form-group">
                    <label for="edit-phone" class="col-md-4 control-label">Phone:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-phone" path="phone" placeholder="Phone"/>
                        <sf:errors path="phone" cssClass="error">

                        </sf:errors>
                    </div>
                </div>

                <div class="form-group">
                    <label for="edit-email" class="col-md-4 control-label">Email:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-email" path="email" placeholder="Email"/>
                        <sf:errors path="email" cssClass="error">

                        </sf:errors>
                    </div>
                </div>

                <div class="form-group">
                    <sf:hidden path="contactId" />
                    <div class="col-md-offset-4 col-md-8">
                        <button type="submit" id="edit-button" class="btn btn-success">Save Contact</button>
                    </div>
                </div>

            </sf:form>
        </div>


        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

