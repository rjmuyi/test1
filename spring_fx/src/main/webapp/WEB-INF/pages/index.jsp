<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>

<form action="index" method="post">
<input name="name">
<input type="submit" value="查询">
</form>
<table>
<tr>
<td>编号</td><td>名称</td><td>状态</td>
</tr>

<c:forEach items="${typelist}" var="r">
<tr>
<td>${r.id}</td><td>${r.name}</td><td>${r.status}</td>
</tr>
</c:forEach>
</table>

</body>
</html>