package pers.adi.house.dao.impl;

import pers.adi.house.beans.HouseInfo;
import pers.adi.house.dao.AddHouseInfoDao;
import pers.adi.house.util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddHouseInfoDaoImpl implements AddHouseInfoDao {
    @Override
    public void add(HouseInfo newHouse) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "insert into house_info values( default , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )";
        try {
            conn = DBHelper.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, newHouse.getHouseName());
            ps.setString(2, newHouse.getHouseType());
            ps.setString(3, newHouse.getHouseFloor());
            ps.setString(4, newHouse.getHouseFloorSpace());
            ps.setString(5, newHouse.getHouseDecorate());
            ps.setString(6, newHouse.getHouseLocation());
            ps.setDouble(7, newHouse.getHouseRentMoney());
            ps.setString(8, newHouse.getHouseLandlord());
            ps.setString(9, newHouse.getHouseLandlordTelphone());
            ps.setByte(10, newHouse.getHouseIsrent());
            int i = ps.executeUpdate();
            System.out.println(i + "条记录已添加");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBHelper.free(conn, ps, rs);
        }
    }
}
