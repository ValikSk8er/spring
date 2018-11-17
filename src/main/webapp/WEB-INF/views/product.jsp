<%--
  Created by IntelliJ IDEA.
  User: valik
  Date: 06-Oct-18
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp" %>
<%--@elvariable id="product" type="com.valiksk8.model.Product"--%>
<div>
    <h3>Product id: ${product.id}</h3>
    <h3>Product name: ${product.productName}</h3>
    <h3>Product price: ${product.price}</h3>
    <h3>Product description: ${product.description}</h3>
</div>
</body>
</html>
