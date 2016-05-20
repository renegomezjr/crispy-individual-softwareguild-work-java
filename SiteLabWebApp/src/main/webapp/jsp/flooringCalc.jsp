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
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/flooringCalc">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/tipCalculator">Tip Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitConverter">Unit Converter</a></li>
                </ul>    
            </div>

            <div class="row">
                <div class="col-md-12">
                    <h3>Flooring Calculator</h3>
                </div>
            </div>

            <div class="row">
                <form class="form-horizontal" role="form" action="flooringCalcMethod"
                      method="POST">
                    <div class="form-group">
                        <label for="width" class="col-md-4 control-label">What is the width in ft.?</label>
                        <div class="col-md-4">
                            <input type=number min=1 max=1999 step=1 name="width" placeholder="ft." required="required"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="length" class="col-md-4 control-label">What is the length in ft.?</label>
                        <div class="col-md-4">
                            <input type=number min=1 max=1999 step=1 name="length" placeholder="ft." required="required"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="costSqFt" class="col-md-4 control-label">What is the cost per square foot?</label>
                        <div class="col-md-4">
                            <input type=number min=1 max=1999 step=1 name="costSqFt" placeholder="$" required="required"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-4">
                            <button type="submit" id="flooringCalc-button" class="btn btn-success">Calculate Flooring Cost</button>
                        </div>
                    </div>
                </form>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <c:if test="${calcsDone}">

                        <p>${flooringCalcs.width}ft X ${flooringCalcs.length}ft = ${flooringCalcs.areaSqFt}sqft <p/>
                        <p>${flooringCalcs.areaSqFt}sqft X ${flooringCalcs.costSqFt}/sqft = $${flooringCalcs.flooringCost}<p/>
                        <p>${flooringCalcs.areaSqFt}/ 5sqft/hr = ${flooringCalcs.laborTime}</p>
                        <p>15m increments (rounded to next 15m increment)</p>
                        <br/>
                        <p>${flooringCalcs.laborTime}(15m increments) * $86/hr = 
                            $${flooringCalcs.laborCost}</p>
                        </c:if>
                </div>
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>


