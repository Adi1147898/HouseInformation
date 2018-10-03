package pers.adi.house.service.impl;

import pers.adi.house.beans.HouseInfo;
import pers.adi.house.dao.UpdateHouseInfoDao;
import pers.adi.house.dao.impl.UpdateHouseInfoDaoImpl;
import pers.adi.house.service.UpdateHouseInfoService;

public class UpdateHouseInfoServiceImpl implements UpdateHouseInfoService {
    private UpdateHouseInfoDao updateDao = new UpdateHouseInfoDaoImpl();

    @Override
    public void update(HouseInfo updateHouse) {
        updateDao.update(updateHouse);
    }
}
