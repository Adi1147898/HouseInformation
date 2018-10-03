package pers.adi.house.dao.impl;

import pers.adi.house.beans.HouseInfo;
import pers.adi.house.dao.ShowHouseInfoDao;
import pers.adi.house.util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ShowHouseInfoDaoImpl implements ShowHouseInfoDao {
    @Override
    public List<HouseInfo> findAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from house_info";
        List<HouseInfo> houseInfos = new ArrayList<HouseInfo>();
        try {
            conn = DBHelper.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                HouseInfo houseInfo = new HouseInfo();
                houseInfo.setHouseId(rs.getInt("house_id"));
                houseInfo.setHouseName(rs.getString("house_name"));
                houseInfo.setHouseType(rs.getString("house_type"));
                houseInfo.setHouseFloor(rs.getString("house_floor"));
                houseInfo.setHouseFloorSpace(rs.getString("house_floor_space"));
                houseInfo.setHouseDecorate(rs.getString("house_decorate"));
                houseInfo.setHouseLocation(rs.getString("house_location"));
                houseInfo.setHouseRentMoney(rs.getDouble("house_rent_money"));
                houseInfo.setHouseLandlord(rs.getString("house_landlord"));
                houseInfo.setHouseLandlordTelphone(rs.getString("house_landlord_telphone"));
                houseInfo.setHouseIsrent(rs.getByte("house_isrent"));
                houseInfos.add(houseInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBHelper.free(conn, ps, rs);
        }
        return houseInfos;
    }

    @Override
    public HouseInfo findById(Integer id) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from house_info where house_id = ? ";
        HouseInfo houseInfoById = new HouseInfo();
        try {
            conn = DBHelper.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                houseInfoById.setHouseId(rs.getInt("house_id"));
                houseInfoById.setHouseName(rs.getString("house_name"));
                houseInfoById.setHouseType(rs.getString("house_type"));
                houseInfoById.setHouseFloor(rs.getString("house_floor"));
                houseInfoById.setHouseFloorSpace(rs.getString("house_floor_space"));
                houseInfoById.setHouseDecorate(rs.getString("house_decorate"));
                houseInfoById.setHouseLocation(rs.getString("house_location"));
                houseInfoById.setHouseRentMoney(rs.getDouble("house_rent_money"));
                houseInfoById.setHouseLandlord(rs.getString("house_landlord"));
                houseInfoById.setHouseLandlordTelphone(rs.getString("house_landlord_telphone"));
                houseInfoById.setHouseIsrent(rs.getByte("house_isrent"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBHelper.free(conn, ps, rs);
        }
        return houseInfoById;
    }
}
