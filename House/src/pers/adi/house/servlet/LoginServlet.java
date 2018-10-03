package pers.adi.house.servlet;

import pers.adi.house.beans.Account;
import pers.adi.house.beans.HouseInfo;
import pers.adi.house.service.LoginService;
import pers.adi.house.service.ShowHouseInfoService;
import pers.adi.house.service.impl.LoginServiceImpl;
import pers.adi.house.service.impl.ShowHouseInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Account account = new Account(username, password);
        LoginService login = new LoginServiceImpl();
        boolean isPass = login.login(account);
        if (isPass) {
            ShowHouseInfoService show = new ShowHouseInfoServiceImpl();
            List<HouseInfo> houseInfos = show.findAll();
            request.setAttribute("houseInfos", houseInfos);
            request.getRequestDispatcher("/HousesInfo.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("Mistake.jsp").forward(request, response);
        }
    }
}
