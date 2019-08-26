<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%--
  Created by IntelliJ IDEA.
  User: air
  Date: 2019-08-26
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>存款</title>
</head>
<body>
<html:form action="/deposit">
    存款金额<html:text property="money"></html:text>
    <html:submit value="提交"></html:submit>
</html:form>
</body>
</html>
