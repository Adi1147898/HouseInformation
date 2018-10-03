package pers.adi.house.service.impl;

import pers.adi.house.beans.HouseInfo;
import pers.adi.house.dao.AddHouseInfoDao;
import pers.adi.house.dao.impl.AddHouseInfoDaoImpl;
import pers.adi.house.service.AddHouseInfoService;

public class AddHouseInfoServiceImpl implements AddHouseInfoService {
    private AddHouseInfoDao addNewHouse = new AddHouseInfoDaoImpl();

    @Override
    public void add(HouseInfo newHouse) {
        addNewHouse.add(newHouse);
    }
}
