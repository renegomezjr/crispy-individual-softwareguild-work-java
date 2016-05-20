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
                    <li role="presentation"><a href="${pageContext.request.contextPath}/interestCalculator">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/flooringCalc">Flooring Calculator</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/tipCalculator">Tip Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitConverter">Unit Converter</a></li>
                </ul>    
            </div>

            <div class="row">
                <div class="col-md-12">
                    <h3>Flooring Calculator</h3>
                </div>
            </div>

            <div class="row">
                <form class="form-horizontal" role="form" action="tipCalculatorMethod"
                      method="POST">
                    <div class="form-group">
                        <label for="timely" class="col-md-4 control-label">On a scale from 0 - 1, was your meal served in a timely manner?</label>
                        <div class="col-md-4">
                            <input type=number min=0 max=1 step=1 name="timely" placeholder="0-1" required="required"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="temperature" class="col-md-4 control-label">On a scale from 0 - 1, was your meal served at the appropriate temperature?</label>
                        <div class="col-md-4">
                            <input type=number min=0 max=1 step=1 name="temperature" placeholder="0-1" required="required"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="taste" class="col-md-4 control-label">On a scale from 0 - 1, did you enjoy the taste?</label>
                        <div class="col-md-4">
                            <input type=number min=0 max=1 step=1 name="taste" placeholder="0-1" required="required"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="experience" class="col-md-4 control-label">On a scale from 0 - 1, did your server contribute to a positive experience?</label>
                        <div class="col-md-4">
                            <input type=number min=0 max=1 step=1 name="experience" placeholder="0-1" required="required"/>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="bill" class="col-md-4 control-label">Bill Amount: $</label>
                        <div class="col-md-4">
                            <input type=number min=0 max=1000 step=.01 name="bill" placeholder="$" required="required"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-4">
                            <button type="submit" id="tipCalc-button" class="btn btn-success">Calculate Tip</button>
                        </div>
                    </div>
                </form>
            </div>
                
            <div class="row">
                <div class="col-md-4">
                    <c:if test="${calcsDone}">

                        <h1>${tipCalc.happinessInWords}<h1/>
                        <h3>Your tip amount in decimal form ${tipCalc.usualTip}<h3/>
                        <h3>Your bill was $${tipCalc.billAmount}<h3/>
                        <h2>Pay this amount $${tipCalc.amountToPay}<h2/>
                        
                        </c:if>
                </div>
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>


