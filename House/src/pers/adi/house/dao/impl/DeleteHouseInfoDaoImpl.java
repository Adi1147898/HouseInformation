package pers.adi.house.dao.impl;

import pers.adi.house.beans.HouseInfo;
import pers.adi.house.dao.DeleteHouseInfoDao;
import pers.adi.house.util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeleteHouseInfoDaoImpl implements DeleteHouseInfoDao {
    @Override
    public void deleteById(Integer id) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "delete from house_info where house_id = ?";
        try {
            conn = DBHelper.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            System.out.println("已删除" + i + "条记录");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBHelper.free(conn, ps, rs);
        }
    }
}
