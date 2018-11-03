<%--
  Created by IntelliJ IDEA.
  User: valik
  Date: 03-Nov-18
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Categories</title>
    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/static/css/bootstrap.min.css"/>" rel="stylesheet">
</head>
<body>
<div>
    <h1>Categories</h1>
    <c:forEach var = "c" items="${categories}">
        <h3>Category name:
            <a href="<c:url value="/category?c_id=${c.id}"/>">
                <c:out value="${c.name}"/>
            </a>
        </h3>
    </c:forEach>
</div>
</body>
</html>
