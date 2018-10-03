<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adi11
  Date: 2018/9/28
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Update House Info</title>
</head>
<body>
<form action="/UpdateHouseInfoServlet" method="post">
    <table align="center" border="1px">
        <tr><td>房子编号</td><td><input type="text" name="houseid" value="${updateHouseInfo.houseId}"></td></tr>
        <tr><td>小区名</td> <td><input type="text" name="housename" value="${updateHouseInfo.houseName}"></td></tr>
        <tr><td>房型</td> <td><input type="text" name="housetype" value="${updateHouseInfo.houseType}"></td></tr>
        <tr><td>楼层</td> <td><input type="text" name="housefloor" value="${updateHouseInfo.houseFloor}"></td></tr>
        <tr><td>房屋面积</td> <td><input type="text" name="housefloorspace" value="${updateHouseInfo.houseFloorSpace}"></td></tr>
        <tr><td>房屋装修情况</td> <td><input type="text" name="housedecorate" value="${updateHouseInfo.houseDecorate}"></td></tr>
        <tr><td>地址</td> <td><input type="text" name="houselocation" value="${updateHouseInfo.houseLocation}"></td></tr>
        <tr><td>租金</td> <td><input type="text" name="houserentmoney" value="${updateHouseInfo.houseRentMoney}"></td></tr>
        <tr><td>房东</td> <td><input type="text" name="houselandlord" value="${updateHouseInfo.houseLandlord}"></td></tr>
        <tr><td>房东电话</td> <td><input type="text" name="houselandlordtelphone" value="${updateHouseInfo.houseLandlordTelphone}"></td></tr>
        <tr><td>是否出租(0-未出租 1-已出租)</td> <td><input type="text" name="houseisrent" value="${updateHouseInfo.houseIsrent}"></td></tr>
        <tr>
            <td><input type="submit" name="upload" value="Upload"></td>
            <td><input type="reset" name="reset" value="Reset"></td>
        </tr>
    </table>
</form>

</body>
</html>
