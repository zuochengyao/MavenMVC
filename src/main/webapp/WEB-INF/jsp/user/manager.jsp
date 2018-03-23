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
<!DOCTYPE html>
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
    <input type="button" value="delete" onclick='deleteUser(1)'/>
    <input type="button" value="insert" onclick='insertUser()'/>
    <input type="button" value="getUser" onclick='getUser(2)'/>
    <br/>
    <div>
        <table>
            <thead>
            <tr>
                <td>ID</td>
                <td>用户名</td>
                <td>密码</td>
                <td>性别</td>
                <td></td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.gender}</td>
                    <td><a onclick="getUser(${user.id})" href="#">编辑</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <br/>
    <form id="edit_user_form">
        <input type="text" id="edit_user_id" name="id" readonly/>
        <input type="text" id="edit_user_name" name="username"/>
        <input type="text" id="edit_user_password" name="password"/>
        <input type="text" id="edit_user_gender" name="gender" readonly/>
        <button type="submit" onclick="updateUser()">修改</button>
    </form>
</div>
<script src="<%=basePath%>js/libs/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
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

    function insertUser() {
        if (confirm('确认删除添加吗？')) {
            $.post("<%=basePath%>user/insert.do", function (data) {
                if (data == "OK") {
                    alert("success");
                }
                else {
                    alert("fail");
                }
            })
        }
    }

    function updateUser() {
        alert($("edit_user_form").serialize());
        $.post("<%=basePath%>user/update", $("#edit_user_form").serialize(), function (data) {
            if (data == "OK") {
                alert("success");
            }
            else {
                alert("fail");
            }
        })
    }

    function getUser(id) {
        $.ajax({
            type: 'get',
            url: "<%=basePath%>user/getUser",
            data: {'id': id},
            success: function (data) {
                $("#edit_user_id").val(data.id);
                $("#edit_user_name").val(data.username);
                $("#edit_user_password").val(data.password);
                $("#edit_user_gender").val(data.gender);
            }
        });
    }
</script>
</body>
</html>
