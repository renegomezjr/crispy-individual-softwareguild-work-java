<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Site Lab Project</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-12 text-center">
                    <h1>Site Lab</h1>
                </div>
            </div>
            <hr>

            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/luckySevens">Lucky Sevens</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/factorizer">Factorizer</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/interestCalculator">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/flooringCalc">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/tipCalculator">Tip Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitConverter">Unit Converter</a></li>
                </ul>    
            </div>

            <div class="row">
                <div class="col-md-4">
                    <div class="jumbotron">
                        <h2>Lucky Sevens</h2>
                        <p>A game of chance</p>
                    </div>
                </div>

                <div class="col-md-4">
                    <div class="jumbotron">
                        <h2>Factorizer</h2>
                        <p>Get the factors of your favorite positive number larger than 1.</p>
                    </div>
                </div>

                <div class="col-md-4">
                    <div class="jumbotron">
                        <h2>Interest Calculator</h2>
                        <p>Invest and watch your money grow.</p>
                    </div>
                </div>
            </div>
                
            <div class="row">
                <div class="col-md-4">
                    <div class="jumbotron">
                        <h2>Flooring Calculator</h2>
                        <p>Estimate your flooring costs</p>
                    </div>
                </div>

                <div class="col-md-4">
                    <div class="jumbotron">
                        <h2>Tip Calculator</h2>
                        <p>How much should I tip?</p>
                    </div>
                </div>

                <div class="col-md-4">
                    <div class="jumbotron">
                        <h2>Unit Converter</h2>
                        <p>Let us help you convert your units!</p>
                    </div>
                </div>
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

