<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"/>
    <title>ToDo list application</title>
</head>

<body>

<jsp:include page="navigation.jsp"/>

<div class="container">
    <div class="row py-2">
        <div class="col-12">
            <c:url value="/new" var="newToDoUrl"/>
            <a class="btn btn-primary" href="${newToDoUrl}">Add Todo</a>
        </div>

        <div class="col-12">
            <table class="table table-bordered my-2">
                <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Description</th>
                    <th scope="col">User</th>
                    <th scope="col">Target date</th>
                    <th scope="col">Actions</th>
                </tr>
                </thead>
                <tbody>

                <%-- for (ToDo toDo : (List<ToDo>) request.getAttribute("todos")) { --%>
                <c:forEach var="toDo" items="${requestScope.todos}">
                <tr>
                    <th scope="row">
                        <%--= toDo.getId() --%>
                        <c:out value="${toDo.id}"/>
                    </th>
                    <td>
                        <%--= toDo.getDescription() --%>
                        <c:out value="${toDo.description}"/>
                    </td>
                    <td>
                        Cristina
                    </td>
                    <td>
                        <%--= toDo.getTargetDate() --%>
                        <c:out value="${toDo.targetDate}"/>
                    </td>
                    <td>
                        <c:url value="/edit" var="todoEditUrl">
                            <c:param name="id" value="${toDo.id}"/>
                        </c:url>
                        <a class="btn btn-success" href="${todoEditUrl}"><i class="fas fa-edit"></i></a>
                        <a class="btn btn-danger" href="#"><i class="far fa-trash-alt"></i></a>
                    </td>
                </tr>
                </c:forEach>
                <%-- } --%>
                </tbody>
            </table>
        </div>
    </div>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
