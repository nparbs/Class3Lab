<%-- 
    Document   : welcomeResponse
    Created on : Sep 7, 2016, 4:18:53 PM
    Author     : Nick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Response</title>
    </head>
    <body>
        <h1>Welcome Response</h1>
        <%
            Object obj = request.getAttribute("msg");
            String msg = "no name";
            if(obj != null){
                msg = obj.toString();
            }
            
            out.println("<h3 style='color:red;'>" + msg + "</h3>");
        %>
    </body>
</html>
