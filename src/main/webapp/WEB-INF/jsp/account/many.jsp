<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Entertainment</title>
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
                <c:forEach var="accountName" items="${someAccount}">
                    <tr>
                        <spring:url value="/account" var="accountLink">
                            <spring:param name="id" value="${accountName.id}"/>
                        </spring:url>
                        <td><a href="${accountLink}">${accountName.owner}</a></td>
                        <td>${accountName.datePlaced}</td>
                        <td>${accountName.startBalance}</td>
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