<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Account</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<div class="container">
    <div class="col-md-8 col-sm-12">
        <div class="row">
            <table class="table table-bordered table-hover">
                <thead>
                <tr class="success">
                    <th>Name</th>
                    <th>Date Placed</th>
                    <th>Balance</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="user" items="${someAccount}">
                    <tr>
                        <spring:url value="/account" var="userLink">
                            <spring:param name="id" value="${user.id}"/>
                        </spring:url>
                        <td><a href="${userLink}">${user.owner.name}</a></td>
                        <td>${user.datePlaced}</td>
                        <td>${user.startBalance}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="col-md-4 col-sm-12">
            <spring:url value="/account/add" var="createUrl"/>
            <form action="${createUrl}" method="post">
                <input type="text" name="owner" class="form-control"/>
                <input type="text" name="Open Date" class="form-control"/>
                <input type="text" name="balance" class="form-control"/>
                <input class="btn  btn-primary" type="submit" value="add">
            </form>
        </div>
    </div>
</div>
</body>
</html>