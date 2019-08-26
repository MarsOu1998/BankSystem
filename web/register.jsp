<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<%--
  Created by IntelliJ IDEA.
  User: air
  Date: 2019-08-24
  Time: 09:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<html:form action="/Register">
    账号<html:text property="account"></html:text><br/>
    密码<html:password property="password"></html:password><br/>
    确认密码<html:password property="passwordAgain"></html:password><br/>
    昵称<html:text property="name"></html:text><br/>
    <html:submit value="提交"/>
</html:form>
</body>
</html>
