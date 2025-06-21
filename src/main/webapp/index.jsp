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
<%@include file="header.jsp" %>
<a href="${pageContext.request.contextPath}/downLoad">下载</a><br>
<a href="${pageContext.request.contextPath}/image">验证码</a><br>
<a href="${pageContext.request.contextPath}/cookie">cookie使用</a><br>
<a href="${pageContext.request.contextPath}/dispatcherServlet">转发到：cookie使用</a><br>
<a href="${pageContext.request.contextPath}/redirect">重定向到：验证码</a><br>
<a href="${pageContext.request.contextPath}/session">session使用</a><br>
<a href="${pageContext.request.contextPath}/sessionGet">sessionGet内容</a><br>
<a href="${pageContext.request.contextPath}/sessionRemove">清除session</a><br>
<a href="${pageContext.request.contextPath}/jsp.jsp"><span style="color: red">jsp语法学习</span></a><br>
<a href="${pageContext.request.contextPath}/inline.jsp"><span style="color: red">jsp九大内置对象</span></a><br>


<form action="${pageContext.request.contextPath}/login" method="get">
    username:<input type="text" name="username"> <br>
    password:<input type="password" name="password"><br>
    <input type="submit">
</form>
<jsp:include page="footer.jsp"/>


</body>
</html>
</body>
</html>
