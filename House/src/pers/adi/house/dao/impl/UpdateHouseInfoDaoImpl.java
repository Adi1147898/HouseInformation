package pers.adi.house.dao.impl;

import pers.adi.house.beans.HouseInfo;
import pers.adi.house.dao.UpdateHouseInfoDao;
import pers.adi.house.util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateHouseInfoDaoImpl implements UpdateHouseInfoDao {
    @Override
    public void update(HouseInfo updateHouse) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "update house_info set house_name = ? , house_type = ? , house_floor = ? , house_floor_space = ? , house_decorate = ? , house_location = ? , house_rent_money = ? , house_landlord = ? , house_landlord_telphone = ? , house_isrent = ? where house_id=? ";
        try {
            conn = DBHelper.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, updateHouse.getHouseName());
            ps.setString(2, updateHouse.getHouseType());
            ps.setString(3, updateHouse.getHouseFloor());
            ps.setString(4, updateHouse.getHouseFloorSpace());
            ps.setString(5, updateHouse.getHouseDecorate());
            ps.setString(6, updateHouse.getHouseLocation());
            ps.setDouble(7, updateHouse.getHouseRentMoney());
            ps.setString(8, updateHouse.getHouseLandlord());
            ps.setString(9, updateHouse.getHouseLandlordTelphone());
            ps.setByte(10, updateHouse.getHouseIsrent());
            ps.setInt(11, updateHouse.getHouseId());
            int i = ps.executeUpdate();
            System.out.println(i + "条记录已修改");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBHelper.free(conn, ps, rs);
        }
    }
}
