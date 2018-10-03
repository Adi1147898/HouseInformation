package pers.adi.house.service.impl;

import pers.adi.house.dao.DeleteHouseInfoDao;
import pers.adi.house.dao.impl.DeleteHouseInfoDaoImpl;
import pers.adi.house.service.DeleteHouseInfoService;

public class DeleteHouseInfoServiceImpl implements DeleteHouseInfoService {
    private DeleteHouseInfoDao delete = new DeleteHouseInfoDaoImpl();

    @Override
    public void deleteById(Integer id) {
        delete.deleteById(id);
    }
}
