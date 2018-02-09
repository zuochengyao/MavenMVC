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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>User CRUD</title>
</head>
<body>
<div>
    <input type="button" id="delete" value="delete" onclick='deleteUser(1)' />
</div>
<script src="<%=basePath%>js/libs/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript" >
    function deleteUser(id) {
        if (confirm('确认删除吗？')) {
            $.post("<%=basePath%>user/delete.action", {"id": id}, function (data) {
                if (data == "OK") {
                    alert("success");
                }
                else {
                    alert("fail");
                }
            })
        }
    }
</script>
</body>
</html>
