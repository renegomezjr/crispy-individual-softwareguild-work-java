<%-- 
    Document   : index.jsp
    Created on : Mar 28, 2016, 10:17:54 AM
    Author     : Rene Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css.bootstrap.css"/>
        <link rel="stylesheet" type="text/css" href="css.bootstrap-theme.css"/>
        <title>Flooring Calc Store</title>
    </head>
    <body>
        <h1>Hello World! I hear you want some flooring.</h1>
        <form method="POST" action="FlooringCalc">
            Width: <input type=number min=100 max=1999 step=50 name="width">ft.<br/>
            Length: <input type=number min=100 max=1999 step=50 name="length">ft.<br/>
            Cost / SqFt: $<input type=number min=0 max=1999 step=1 name="costSqFt"><br/>
            <button type="submit" value="Submit">Submit</button>
            
        </form>
    </body>
</html>
