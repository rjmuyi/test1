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

<c:if test="${info==null}">
<form action="insert" method="post">
<input name="name" value="${info.name}">
<select name="sex">
   <c:forEach items="${sexs}" var="r" varStatus="v">
      <option value="${v.index}">${r}</option>
   </c:forEach>
</select>
<select name="typeid">
   <c:forEach items="${typelist}" var="r">
      <option value="${r.id}">${r.name}</option>
   </c:forEach>
</select> 
<input type="submit" value="确定新增">
</form>
</c:if>

<c:if test="${info!=null}">
<form action="update" method="post">
<input name="id" type="hidden" value="${info.id}">
<input name="name" value="${info.name}">
<select name="sex">
   <c:forEach items="${sexs}" var="r" varStatus="v">
      <option value="${v.index}" <c:if test="${info.sex==v.index}">selected="selected"</c:if>>${r}</option>
   </c:forEach>
</select>
<select name="typeid">
   <c:forEach items="${typelist}" var="r" varStatus="v">
      <option value="${r.id}" <c:if test="${info.typeid==r.id}">selected="selected"</c:if>>${r.name}</option>
   </c:forEach>
</select>
<input type="submit" value="确定修改">
</form>
</c:if>

</body>
</html>