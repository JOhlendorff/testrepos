<%-- 
    Document   : bmijsp
    Created on : 1. okt. 2019, 15.28.42
    Author     : jenso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Din BMI er: </h1>
        <% out.print(request.getAttribute("bmi")); %>
        <h1>Og du er:</h1>
        <% out.print(request.getAttribute("ov")); %>
                
    </body>
</html>
