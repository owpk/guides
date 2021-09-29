<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: Slava
  Date: 10.05.2020
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>ExampleJSP</title>
  </head>
  <body>
      <% Cookie[] c = request.getCookies();
        for (Cookie cookie: c) {
          out.println("<p>"+cookie.getValue());
          out.println(" : "+cookie.getName()+"</p>");
        }
        String name = request.getParameter("query");%>
      <b><%=name%></b>

  </body>
</html>
