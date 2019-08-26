<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<%--
  Created by IntelliJ IDEA.
  User: air
  Date: 2019-08-25
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>取款</title>
</head>
<body>
<html:form action="/withdraw">
    取款金额<html:text property="money"></html:text><br/>
    <html:submit value="提交"/>
    <html:errors property="withdraw"/>
</html:form>
</body>
</html>
