<%-- 
    Document   : newjsp
    Created on : 5. okt. 2019, 13.47.52
    Author     : jenso
--%>

<%@page import="persistence.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>BookTitle:</h1>
        <% out.print(request.getAttribute("bookTitle")); %>
        
    </body>
</html>
