<%--
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
    <%@page import="servlet.FirstServlet" %>
    <%@ page import="model.Workable" %>
<% Workable w = (Workable) request.getSession().getAttribute("worker"); %>
  <div class="container">
    <div class="table-row-cell">
      <p><b>
        <%="Login : " + w.getName()%>
      </b></p>
      <p><b>
        <%="Password : " + w.getPass()%>
      </b></p>
      <p><b>
          <%="Session Id : " + w.getId()%>
      </b></p>
    </div>
  </div>
  </body>
</html>
