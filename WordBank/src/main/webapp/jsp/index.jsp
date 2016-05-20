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

        <style>
            body {
                /* Permalink - use to edit and share this gradient: http://colorzilla.com/gradient-editor/#d8e0de+0,aebfbc+22,99afab+33,8ea6a2+50,829d98+67,4e5c5a+82,0e0e0e+100;Grey+3D */
                background-color: #d8e0de; /* Old browsers */
                background-color: -moz-linear-gradient(top,  #d8e0de 0%, #aebfbc 22%, #99afab 33%, #8ea6a2 50%, #829d98 67%, #4e5c5a 82%, #0e0e0e 100%); /* FF3.6-15 */
                background-color: -webkit-linear-gradient(top,  #d8e0de 0%,#aebfbc 22%,#99afab 33%,#8ea6a2 50%,#829d98 67%,#4e5c5a 82%,#0e0e0e 100%); /* Chrome10-25,Safari5.1-6 */
                background-color: linear-gradient(to bottom,  #d8e0de 0%,#aebfbc 22%,#99afab 33%,#8ea6a2 50%,#829d98 67%,#4e5c5a 82%,#0e0e0e 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */
                filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#d8e0de', endColorstr='#0e0e0e',GradientType=0 ); /* IE6-9 */

            }


        </style>

    </head>
    <body>
        <div class="container">
            <h1>Dictionary of personal meaning</h1>
            <hr/>

            <div class="row">
                <div class="col-md-6">
                    <h2>Word Bank</h2>

                    <div class="jumbotron">
                        <c:forEach var="word" items="${dictionary}">
                            <p><strong>${word.word}:</strong> ${word.definition}</p>
                        </c:forEach>
                    </div>
                </div>

                <div class="col-md-6">
                    <h2>Word and Definition</h2>
                    <form class="form-horizontal" role="form" action="getWordForm" method="POST">
                        <div class="form-group">
                            
                            <input type="text" class="form-control" name="word" id="add-word" placeholder="word"/>
                        </div>

                        <div class="form-group">
                            <input type="text" class="form-control" name="definition" id="add-definition" placeholder="definition"/>
                        </div>

                        <div class="form-group pull-right">
                            <button type="submit" class="glyphicon glyphicon-check btn btn-success"/>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.12.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

