<%--
  Created by IntelliJ IDEA.
  User: 夜林蓝
  Date: 2022/11/6
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<jsp:include page="../header.jsp"/>
<a href="${pageContext.request.contextPath}/sessionRemove">登出</a><br>
username: ${pageContext.getAttribute("username")} <br>
password: ${pageContext.getAttribute("username")} <br>
<jsp:include page="../footer.jsp"/>
</body>
</html>
</body>
</html>
