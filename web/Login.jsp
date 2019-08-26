<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean" %>
<%--
  Created by IntelliJ IDEA.
  User: air
  Date: 2019-08-23
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登录银行系统</title>
</head>
<body>
    <html:form action="/Login">
        账号：<html:text property="account"></html:text><br/>
        密码：<html:password property="password"></html:password><br/>
        <html:errors property="login"/>
        <html:submit value="登录"></html:submit><br/>
    </html:form>
    <html:link action="/register">注册</html:link>
</body>
</html>
