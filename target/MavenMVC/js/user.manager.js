function deleteUser(id) {
    if (confirm('ȷ��ɾ����')) {
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