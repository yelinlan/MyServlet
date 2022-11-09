<%--
  Created by IntelliJ IDEA.
  User: 夜林蓝
  Date: 2022/11/8
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<hr>
<p style="background-color: lightblue"><a href="index.jsp">首页</a></p>
<p style="background-color: lawngreen">当前在线人数：<%=pageContext.getServletContext().getAttribute("onlineCount")%>
<p style="background-color: lightpink">sessionId：<%=((HttpServletRequest) pageContext.getRequest())
        .getRequestedSessionId()%>
<p style="background-color: lightpink">token：<%=((HttpServletRequest) pageContext.getRequest())
        .getSession().getAttribute("token")%>
</p>
</body>
</html>
