<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 25, 2022, 8:08:05 PM
    Author     : Allan T
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="post" action="arithmetic">
            
            First: <input type="text" name="first" value="${firstNum}"<br><br><br>
            
            Second: <input type="text" name="second" value="${SecondNum}"<br><br><br>
            

            <input type="submit" name="operation" value="+">
            
            <input type="submit" name="operation" value="-">
            
            <input type="submit" name="operation" value="*">
            
            <input type="submit" name="operation" value="%"><br>
            
        </form>
        <p>Result: ${result}</p>
        
        <a href="age">Age Calculator</a>
        
    </body>
</html>
