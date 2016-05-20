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
                    <h2>Search Results</h2>
                    <%@include file="contactSummaryTableFragment.jsp" %>

                </div>
                <div class="col-md-6 text-center">
                    <h2>Search Contacts</h2>
                    
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="search-first-name" class="col-md-4 control-label">
                                First Name:
                            </label>
                            <div class="col-md-8">
                                <input type="text"class="form-control" id="search-first-name" 
                                       placeholder="First Name"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="search-last-name" class="col-md-4 control-label">
                                Last Name:
                            </label>
                            <div class="col-md-8">
                                <input type="text"class="form-control" id="search-last-name" 
                                       placeholder="Last Name"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="search-company" class="col-md-4 control-label">
                                Company:
                            </label>
                            <div class="col-md-8">
                                <input type="text"class="form-control" id="search-company" 
                                       placeholder="Company"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="search-phone" class="col-md-4 control-label">
                                Phone:
                            </label>
                            <div class="col-md-8">
                                <input type="text"class="form-control" id="search-phone" 
                                       placeholder="Phone"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="search-emai" class="col-md-4 control-label">
                                Email:
                            </label>
                            <div class="col-md-8">
                                <input type="text"class="form-control" id="search-email" 
                                       placeholder="Email"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <a type="submit" id="search-button"><span class="glyphicon glyphicon-question-sign" style="font-size: 50px"></span></a>
                        </div>
                    </form>
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

