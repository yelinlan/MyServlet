<%@ page import="java.util.Date" %>
<%@ page import="java.util.stream.IntStream" %>
<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: 夜林蓝
  Date: 2022/11/8
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1>页面有50%概率崩溃！小心啦！</h1>
<%= new Date()%>
<hr>
<%
    out.println(IntStream.range(1, 100).sum());
%>
<%
    Random random = new Random();
    int i = random.nextInt(2);
    int c = 1 / i;
%>
<jsp:include page="footer.jsp"/>
</body>
</html>
