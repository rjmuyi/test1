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
<script type="text/javascript">
function del(id){
	if(confirm("删除？")){
		open("delete?id="+id,"_self");
	}
}
</script>

<a href="add" >新增</a>
<form action="index" method="post">
<input name="name">
<input type="submit" value="查询">
</form>
<table>
<tr>
<td>编号</td><td>名称</td><td>性别</td><td>类型</td><td>操作</td>
</tr>

<c:forEach items="${typelist}" var="r">
<tr>
<td>${r.id}</td><td>${r.name}</td><td>${r.sexname}</td><td>${r.bookname}</td>
<td><a href="edit?id=${r.id}">修改</a></td>
<td><a href="javascript:del(${r.id})">删除</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>