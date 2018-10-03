package pers.adi.house.servlet;

import pers.adi.house.beans.HouseInfo;
import pers.adi.house.service.ShowHouseInfoService;
import pers.adi.house.service.impl.ShowHouseInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowByIdServlet")
public class ShowByIdServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String sid = request.getParameter("house_id");
        Integer id = Integer.valueOf(sid);
        ShowHouseInfoService showById = new ShowHouseInfoServiceImpl();
        HouseInfo updateHouseInfo = null;
        updateHouseInfo = showById.findById(id);
        request.setAttribute("updateHouseInfo", updateHouseInfo);
        request.getRequestDispatcher("/UpdateHouseInfo.jsp").forward(request, response);
    }
}
