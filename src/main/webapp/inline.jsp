<%--
  Created by IntelliJ IDEA.
  User: 夜林蓝
  Date: 2022/11/8
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jsp</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<form action="inline.jsp" method="get">
    username:<input type="text" name="username" value="${param.username}"> <br>
    <input type="submit">
</form>
<c:if test="${param.username=='admin'}" var="isAdmin">
    <c:out value="管理员欢迎您！"/>
</c:if>
<jsp:include page="footer.jsp"/>
</body>
</html>
