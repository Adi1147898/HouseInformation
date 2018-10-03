package pers.adi.house.service;

import pers.adi.house.beans.HouseInfo;

import java.util.List;

public interface ShowHouseInfoService {
    List<HouseInfo> findAll();

    HouseInfo findById(Integer id);
}
