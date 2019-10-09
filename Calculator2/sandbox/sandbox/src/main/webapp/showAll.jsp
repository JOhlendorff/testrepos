<%-- 
    Document   : showAll
    Created on : 1. okt. 2019, 13.25.32
    Author     : jenso
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello jsppppp World!</h1>
           Dag:  <% out.print(request.getAttribute("dag")); %>
           Navn: <% out.print(request.getParameter("name")); %>
           Tidspunkt: <%= LocalDateTime.now()%>
        <form action="FrontController">
            <input type="submit" value="ok" />
            
            <input type="hidden" name="cmd" value="hello" />
            
        </form>
    </body>
</html>
