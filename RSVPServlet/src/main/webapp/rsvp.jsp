<%-- 
    Document   : rsvp
    Created on : Mar 25, 2016, 10:24:28 AM
    Author     : Rene Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RSVP to Boat Party</title>
    </head>
    <body>
        <h1>I'mma having a boat party! You can come on my boat.</h1>
        <div>
            <h2>Can you attend? It's on a boat!</h2>
            <form action="OurWeb" method="POST">
                Yes<input type="radio" name="answer" value="da" />
                No<input type="radio" name="answer" value="nyet" />
                <input type="submit" value="RSVP"/>
            </form>
            
        </div>
        
    </body>
</html>
