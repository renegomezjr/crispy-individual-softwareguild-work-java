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
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/factorizer">Factorizer</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/interestCalculator">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/flooringCalc">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/tipCalculator">Tip Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitConverter">Unit Converter</a></li>
                </ul>    
            </div>

            <div class="row">
                <div class="col-md-12">
                    <h3>Let's factor!</h3>
                </div>
            </div>

            <div class="row">
                <form class="form-horizontal" role="form" action="factorizerMethod"
                      method="POST">
                    <div class="form-group">
                        <label for="userNumber" class="col-md-4 control-label">Number to factorize: </label>
                        <div class="col-md-4">
                            <input type="text" min=2 class="form-control" id="initialBank" 
                                   name="userNumber" placeholder="Number greater than 1"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-4">
                            <button type="submit" id="factorIt-button" class="btn btn-success">Get Factors</button>
                        </div>
                    </div>
                </form>

                <p>Here are the positive factors: </p>
                <c:forEach var="factor" items="${factorizer.factors}">
                    <p>${factor}</p>
                </c:forEach>
                <p>${factorizer.userNumber}</p>
                <p>${factorizer.primeOrNot}</p>
                <p>${factorizer.perfectOrNot}</p>
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>


