package pers.adi.house.servlet;

import pers.adi.house.beans.HouseInfo;
import pers.adi.house.service.AddHouseInfoService;
import pers.adi.house.service.ShowHouseInfoService;
import pers.adi.house.service.impl.AddHouseInfoServiceImpl;
import pers.adi.house.service.impl.ShowHouseInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AddHouseInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String houseName = request.getParameter("housename");
        String houseType = request.getParameter("housetype");
        String houseFloor = request.getParameter("housefloor");
        String houseFloorSpace = request.getParameter("housefloorspace");
        String houseDecorate = request.getParameter("housedecorate");
        String houseLocation = request.getParameter("houselocation");
        String houseRentMoney = request.getParameter("houserentmoney");
        Double money = Double.valueOf(houseRentMoney);
        String houseLandlord = request.getParameter("houselandlord");
        String houseLandlordTelphone = request.getParameter("houselandlordtelphone");
        String houseIsrent = request.getParameter("houseisrent");
        Byte isrent = Byte.valueOf(houseIsrent);
        HouseInfo newHouse = new HouseInfo(houseName, houseType, houseFloor, houseFloorSpace, houseDecorate, houseLocation, money, houseLandlord, houseLandlordTelphone, isrent);
        AddHouseInfoService add = new AddHouseInfoServiceImpl();
        add.add(newHouse);
        ShowHouseInfoService show = new ShowHouseInfoServiceImpl();
        List<HouseInfo> houseInfos = show.findAll();
        request.setAttribute("houseInfos", houseInfos);
        request.getRequestDispatcher("/HousesInfo.jsp").forward(request, response);
    }
}

