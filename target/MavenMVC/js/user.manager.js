function deleteUser(id) {
    if (confirm('È·ÈÏÉ¾³ýÂð£¿')) {
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