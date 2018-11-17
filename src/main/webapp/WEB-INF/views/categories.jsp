<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp" %>
<%--@elvariable id="categories" type="java.util.List<com.valiksk8.model.Category>"--%>

<div >
    <h1>Categories</h1>
    <c:forEach var = "c" items="${categories}">
        <h3>Category name: <a href="<c:url value="/category?c_id=${c.id}"/>">
            <c:out value="${c.categoryName}"/></a></h3>
    </c:forEach>
</div>
</body>
</html>