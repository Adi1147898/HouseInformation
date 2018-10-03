package pers.adi.house.util;

import java.sql.*;

public class DBHelper {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        //localhost:  The port number   /    Database
        String url = "jdbc:mysql://localhost:   /   ?useUnicode=true&characterEncoding=UTF8&useSSL=false&serverTimezone=UTC";
        //your MySQL admin
        String user = " ";
        //your MySQL password
        String password = " ";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void free(Connection conn, PreparedStatement ps, ResultSet rs) {
        try {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
