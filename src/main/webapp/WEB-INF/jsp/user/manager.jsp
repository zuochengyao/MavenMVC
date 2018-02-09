<%--
  Created by IntelliJ IDEA.
  User: zuochengyao
  Date: 2018/2/9
  Time: 下午3:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>User CRUD</title>
    <script src="<%=basePath%>js/libs/jquery.min.js"/>
    <script type="javascript" src="<%=basePath%>js/user.manager.js"/>
</head>
<body>
<div>
    <input id="delete" onclick="deleteUser(1)" value="delete">

</div>
</body>
</html>
