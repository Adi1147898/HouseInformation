<%--
  Created by IntelliJ IDEA.
  User: adi11
  Date: 2018/9/28
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new house info</title>
</head>
<body>
    <form action="/AddHouseInfoServlet" method="post">
        <table align="center" border="1px">
            <tr><td>小区名</td> <td><input type="text" name="housename"></td></tr>
            <tr><td>房型</td> <td><input type="text" name="housetype"></td></tr>
            <tr><td>楼层</td> <td><input type="text" name="housefloor"></td></tr>
            <tr><td>房屋面积</td> <td><input type="text" name="housefloorspace"></td></tr>
            <tr><td>房屋装修情况</td> <td><input type="text" name="housedecorate"></td></tr>
            <tr><td>地址</td> <td><input type="text" name="houselocation"></td></tr>
            <tr><td>租金</td> <td><input type="text" name="houserentmoney"></td></tr>
            <tr><td>房东</td> <td><input type="text" name="houselandlord"></td></tr>
            <tr><td>房东电话</td> <td><input type="text" name="houselandlordtelphone"></td></tr>
            <tr><td>是否出租(0-未出租 1-已出租)</td> <td><input type="text" name="houseisrent"></td></tr>
            <tr>
                <td><input type="submit" name="upload" value="Upload"></td>
                <td><input type="reset" name="reset" value="Reset"></td>
            </tr>
        </table>
    </form>
</body>
</html>
