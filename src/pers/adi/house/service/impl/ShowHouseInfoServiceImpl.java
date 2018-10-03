package pers.adi.house.service.impl;

import pers.adi.house.beans.HouseInfo;
import pers.adi.house.dao.ShowHouseInfoDao;
import pers.adi.house.dao.impl.ShowHouseInfoDaoImpl;
import pers.adi.house.service.ShowHouseInfoService;

import java.util.List;

public class ShowHouseInfoServiceImpl implements ShowHouseInfoService {
    private ShowHouseInfoDao showDao = new ShowHouseInfoDaoImpl();

    @Override
    public List<HouseInfo> findAll() {
        return showDao.findAll();
    }

    @Override
    public HouseInfo findById(Integer id) {
        return showDao.findById(id);
    }
}
