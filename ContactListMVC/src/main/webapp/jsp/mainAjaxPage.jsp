<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
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
        <style>
            th{
                text-align: center;
            }

        </style>

    </head>
    <body>
        <div class="container">
            <h1>Company Contacts</h1>
            <hr/>
            <%@include file="defaultFragment.jsp" %>
            <div class="row">
                <div class="col-md-6 text-center">
                    <h2>My Contacts</h2>
                    <%@include file="contactSummaryTableFragment.jsp" %>
                </div>

                <div class="col-md-6 text-center">
                    <h2>Add New Contact</h2>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="add-first-name" class="col-md-4 control-label">
                                First Name:
                            </label>
                            <div class="col-md-8">
                                <input type="text"class="form-control" id="add-first-name" 
                                       placeholder="First Name"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="add-last-name" class="col-md-4 control-label">
                                Last Name:
                            </label>
                            <div class="col-md-8">
                                <input type="text"class="form-control" id="add-last-name" 
                                       placeholder="Last Name"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="add-company" class="col-md-4 control-label">
                                Company:
                            </label>
                            <div class="col-md-8">
                                <input type="text"class="form-control" id="add-company" 
                                       placeholder="Company"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="add-phone" class="col-md-4 control-label">
                                Phone:
                            </label>
                            <div class="col-md-8">
                                <input type="text"class="form-control" id="add-phone" 
                                       placeholder="Phone"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="add-emai" class="col-md-4 control-label">
                                Email:
                            </label>
                            <div class="col-md-8">
                                <input type="text"class="form-control" id="add-email" 
                                       placeholder="Email"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <a type="submit" id="add-button"><span class="glyphicon glyphicon-check" style="font-size: 50px"></span></a>
                        </div>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="jumbotron text-center">
                    <h3>Please help keep our contact list up-to-date by updating your own information!</h3>
                </div>
            </div>
        </div>

        <%@include file="detailsAndEditModalFragment.jsp" %>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/contactList.js"></script>

    </body>
</html>

