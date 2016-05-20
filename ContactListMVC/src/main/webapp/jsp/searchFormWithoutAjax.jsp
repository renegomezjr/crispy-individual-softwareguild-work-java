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


            <form class="form-horizontal" role="form"
                  action="searchFormWithoutAjax" method="POST">
                <div class="form-group">
                    <label for="search-first-name" class="col-md-4 control-label">First Name:</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="search-first-name" name="firstName" placeholder="First Name"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="search-last-name" class="col-md-4 control-label">Last Name:</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="search-last-name" name="lastName" placeholder="Last Name"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="search-company" class="col-md-4 control-label">Company:</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="search-company" name="company" placeholder="Company"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="search-phone" class="col-md-4 control-label">Phone:</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="search-phone" name="phone" placeholder="Phone"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="search-email" class="col-md-4 control-label">Email:</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="search-email" name="email" placeholder="Email"/>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type="submit" id="add-button" class="btn btn-success">Search for Contact</button>
                    </div>
                </div>
            </form>
        </div>


        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

