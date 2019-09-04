<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="color:darkseagreen;background-color:palegoldenrod">
<center>
 <c:forEach items="${accounts}" var="account">
     <h2>  姓名 ：${account.name} </h2>
     <h2>  金额 ：${account.money}</h2>
 </c:forEach>
</center>
</body>
</html>
