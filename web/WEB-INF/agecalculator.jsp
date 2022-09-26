<%-- 
    Document   : agecalculator
    Created on : Sep 25, 2022, 3:43:04 PM
    Author     : Allan T
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method ="post" action ="age">
          Enter Your Current Age: <input type="text" name="ageBefore" value="${ageBefore}" >
          <br>
          
         <input type="submit" value="Age next birthday">
        </form>
          
        <p>${ageNext}</p>
        
          <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
