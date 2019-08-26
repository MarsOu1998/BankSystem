<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean" %>
<%@ taglib prefix="logic" uri="http://jakarta.apache.org/struts/tags-logic" %>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<%--
  Created by IntelliJ IDEA.
  User: air
  Date: 2019-08-23
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎来到银行操作系统</title>
</head>
<body>
Welcome！
<bean:write name="users1" property="name"></bean:write><hr/>
您的余额：
<bean:write name="users1" property="balance"></bean:write><hr/>
<html:link action="/Withdraw">取款</html:link><br/>
<html:link action="/Deposit">存款</html:link><br/>
<html:link action="/logout">退出</html:link>
</body>
</html>
