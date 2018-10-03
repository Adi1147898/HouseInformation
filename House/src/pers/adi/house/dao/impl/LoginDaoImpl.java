package pers.adi.house.dao.impl;

import pers.adi.house.beans.Account;
import pers.adi.house.dao.LoginDao;
import pers.adi.house.util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LoginDaoImpl implements LoginDao {
    @Override
    public boolean login(Account account) {
        Account check = new Account();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from account where user_name = ? and user_password = ?;";
        boolean isPass = false;
        try {
            conn = DBHelper.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, account.getUserName());
            ps.setString(2, account.getUserPassword());
            rs = ps.executeQuery();

            if (rs.next()) {
                isPass = true;
                rs.previous();
                check.setUserName(rs.getString("user_name"));
                check.setUserPassword(rs.getString("user_password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBHelper.free(conn, ps, rs);
        }
        return isPass;
    }
}
