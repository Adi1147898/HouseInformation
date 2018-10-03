package pers.adi.house.servlet;

import pers.adi.house.beans.HouseInfo;
import pers.adi.house.service.ShowHouseInfoService;
import pers.adi.house.service.impl.ShowHouseInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ShowHouseInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ShowHouseInfoService show = new ShowHouseInfoServiceImpl();
        List<HouseInfo> houseInfos = show.findAll();
        request.setAttribute("houseInfos", houseInfos);
        response.sendRedirect("HousesInfo.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
