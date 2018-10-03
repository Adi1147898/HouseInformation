package pers.adi.house.service.impl;

import pers.adi.house.beans.Account;
import pers.adi.house.dao.LoginDao;
import pers.adi.house.dao.impl.LoginDaoImpl;
import pers.adi.house.service.LoginService;

import java.util.List;

public class LoginServiceImpl implements LoginService {
    private LoginDao loginDao = new LoginDaoImpl();

    @Override
    public boolean login(Account account) {
        return loginDao.login(account);
    }
}
