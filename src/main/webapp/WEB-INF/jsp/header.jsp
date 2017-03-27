<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>

<link href="/kidsclub/resources/static/css/main.css" rel="stylesheet"/>

<div class="container">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <ul class="nav navbar-nav">
                    <spring:url var="home" value="/"/>
                    <li><a href="${home}">Home</a></li>

                    <spring:url var="users" value="/user/all"/>
                    <li><a href="${users}">Clients</a></li>

                    <spring:url var="accounts" value="/account/all"/>
                    <li><a href="${accounts}">Accounts</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>


