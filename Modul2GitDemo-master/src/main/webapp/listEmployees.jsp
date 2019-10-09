<%-- 
    Document   : listEmployees
    Created on : Sep 14, 2017, 2:38:19 PM
    Author     : kasper
--%>

<%@page import="java.util.List"%>
<%@page import="sem2.module2gitdemo.RenderUtil"%>
<%@page import="sem2.module2gitdemo.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% List<Employee> list = (List<Employee>)request.getAttribute( "employees");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee List</title>
    </head>
    <body>
        <h1>List of employees at ClassicModels</h1>
        <%= RenderUtil.employeeTable(list) %>
    </body>
</html>
