<%--
  Created by IntelliJ IDEA.
  User: adi11
  Date: 2018/9/27
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>HouseInfo</title>
</head>
<body>
<table align="center" border="1px">
    <tr>
        <td colspan="10" align="center">房屋出租信息</td> <td colspan="3" align="center"><a href="AddHouseInfo.jsp">发布信息</a></td>
    </tr>
    <tr>
        <td>房子编号</td>
        <td>小区名</td>
        <td>房型</td>
        <td>楼层</td>
        <td>房屋面积</td>
        <td>房屋装修情况</td>
        <td>地址</td>
        <td>租金</td>
        <td>房东</td>
        <td>房东电话</td>
        <td>是否出租(0-未出租 1-已出租)</td>
        <td></td>
        <td></td>

    </tr>
<c:forEach items="${houseInfos}" var="houseInfos">
    <tr>
        <td>${houseInfos.houseId}</td>
        <td>${houseInfos.houseName}</td>
        <td>${houseInfos.houseType}</td>
        <td>${houseInfos.houseFloor}</td>
        <td>${houseInfos.houseFloorSpace}</td>
        <td>${houseInfos.houseDecorate}</td>
        <td>${houseInfos.houseLocation}</td>
        <td>${houseInfos.houseRentMoney}</td>
        <td>${houseInfos.houseLandlord}</td>
        <td>${houseInfos.houseLandlordTelphone}</td>
        <td>${houseInfos.houseIsrent}</td>
        <td><a href="DeleteHouseInfoServlet?house_id=${houseInfos.houseId}">删除</a></td>
        <td><a href="ShowByIdServlet?house_id=${houseInfos.houseId}">修改</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
