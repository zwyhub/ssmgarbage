<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="/account/selectfindAll">查询数据</a>
<h2>添加数据</h2>
<form action="/account/insertAccount">
   名字：<input type="text" name="name">
   金额：<input type="text" name="money">
    <input type="submit" value="确实">
</form>
</body>
</html>
