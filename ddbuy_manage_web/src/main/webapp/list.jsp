<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; utf-8" pageEncoding="UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="static/js/jquery-1.8.3.js"></script>
    <script>
        $(function () {
            alert("看到本段文字说明你成功了！");
        })
    </script>
</head>
<body>
    <table>
        <tr>
            <td>区域编号</td>
            <td>区域名称</td>
        </tr>
        <c:forEach items="${districtList}" var="district">
            <tr>
                <td>${district.id}</td>
                <td>${district.name}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>