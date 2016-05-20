<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Index Page</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">
            <h1>Restful Warmup</h1>
            <hr/>
            <div class="jumbotron">
                <div class="row">
                    <div class="col-md-6">
                        <h3>Random Dice Roll</h3>
                        <h1 id="dieNum"></h1>
                        <input type="number" min="6" max="200" step="1" id="number"/>
                        <button id="randomDiceRoll" class="btn btn-default">Roll this Dice</button> 
                    </div>           
                    
                    <div class="col-md-6">
                        <h3>Random Number</h3>
                        <h1 id="randomNumber"></h1>
                        <button id="getRandomNumber" class="btn btn-success">Get Number</button>
                    </div>                    
                </div>

                <div class="row">
                    <div class="col-md-6">
                        <h3>Random Compliment</h3>
                        <h1 id="compliment"></h1>
                        <input type="text" id="compliment-name"/>
                        <button id="compliment-btn" class="btn btn-success">Compliment me!</button>
                    </div>          
                    
                    <div class="col-md-6">
                        <h3>Get Random Animal</h3>
                        <h1 id="animal"></h1>
                        <button id="getRandomAnimal" class="btn btn-danger">Get Animal</button>
                        <!--if you need server stuff, type="submit"-->
                    </div>   
                </div>  
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/restfulWarmUp.js"></script>
    </body>
</html>

