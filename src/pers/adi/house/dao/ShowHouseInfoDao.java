package pers.adi.house.dao;

import pers.adi.house.beans.HouseInfo;

import java.util.List;

public interface ShowHouseInfoDao {

    List<HouseInfo> findAll();

    HouseInfo findById(Integer id);
}
