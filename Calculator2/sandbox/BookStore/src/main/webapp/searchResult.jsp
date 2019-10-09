<%-- 
    Document   : searchResult
    Created on : 2. okt. 2019, 11.40.26
    Author     : jenso
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="persistence.Book"%>
<%@page import="persistence.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <h1>Search result for <% request.getParameter("searchTitle"); %></h1>
        
            <table width = "50%" border = "1" align = "center">
                <thead>
                    <tr>
                        <td>Title</td>
                        <td>Author</td>
                        <td>Price</td>
                        <td>Select</td>
                    </tr>
                </thead>
                <tbody>
                    <% ArrayList<Book> books = (ArrayList<Book>) request.getAttribute("bookList");
                        for (Book book : books) {%>                    
                    <tr bgcolor = "#949494">

                        <td><%=book.getTitle()%></td>
                        <td><%=book.getAuthor()%></td>
                        <td><%=book.getPrice()%></td>
                        <td><input type="checkbox" name=id value="<%=book.getId()%>"</td> 

                    </tr>
                    <% } //end loop %>
                </tbody>
            </table>   
            <p>Indtast navn:      <input type="text" name="name" value="" /></p>
            <p>Indtast email:     <input type="text" name="email" value="" /></p>
            <p>Indtast telefonnr: <input type="text" name="phone" value="" /></p>
            <input type="hidden" name="cmd" value="order" />
            <input type="submit" value="Process order" /> 

    </body>
</html>
