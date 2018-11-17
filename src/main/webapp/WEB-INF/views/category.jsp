<%--
  Created by IntelliJ IDEA.
  User: valik
  Date: 01-Oct-18
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="header.jsp" %>

<%--@elvariable id="category" type="com.valiksk8.model.Category"--%>

<div>
<h1>category ${category.categoryName}</h1>
    <c:forEach var = "p" items="${category.productList}">
        <h3>Product name:
            <a href="<c:url value="/product?p_id=${p.id}"/>">
                <c:out value="${p.productName}"/>
            </a> ${p.price}
        </h3>
    </c:forEach>
</div>
</body>
</html>