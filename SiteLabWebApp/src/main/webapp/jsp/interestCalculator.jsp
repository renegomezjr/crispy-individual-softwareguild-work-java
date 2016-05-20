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
                    <li role="presentation"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/luckySevens">Lucky Sevens</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/factorizer">Factorizer</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/interestCalculator">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/flooringCalc">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/tipCalculator">Tip Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitConverter">Unit Converter</a></li>
                </ul>    
            </div>
            <div class="row">
                <div class="col-md-12">
                    <h3>Interest Calculator</h3>
                </div>
            </div>
            <div class="row">
                <form class="form-horizontal" role="form" action="interestCalcMethod"
                      method="POST">
                    <div class="form-group">
                        <label for="interestRate" class="col-md-4 control-label">What is the annual interest rate for this mutual fund:</label>
                        <div class="col-md-4">
                            <input type="number" min="1" step=".25" class="form-control" id="interestRate" 
                                   name="interestRate" placeholder="interest rate" required="required"/>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="initialPrincipal" class="col-md-4 control-label">How much would you like to invest: </label>
                        <div class="col-md-4">
                            <input type="number" min="1" step=".01" class="form-control" id="initialPrincipal" 
                                   name="initialPrincipal" placeholder="initial principal" required="required"/>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="yearsInvesting" class="col-md-4 control-label">How many years would you like to invest in our fund: </label>
                        <div class="col-md-4">
                            <input type="number" min="1" step="1" class="form-control" id="initialBank" 
                                   name="yearsInvesting" placeholder="years to invest" required="required"/>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-4">
                            <button type="submit" id="interestCalc-button" class="btn btn-success">Process Investment</button>
                        </div>
                    </div>
                </form>
                
                <c:forEach var="report" items="${investmentResults}">
                    <p>Year: ${report.currentYear}</p>
                    <p>Principal at the beginning: ${report.priceAtBeg}</p>
                    <p>Interest earned this year: ${report.earnedYearlyInterest}</p>
                    <p>Account balance: ${report.principalAtEnd}</p>
                    <hr>
                </c:forEach>
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>


