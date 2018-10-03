package pers.adi.house.dao;

import pers.adi.house.beans.Account;

import java.util.List;

public interface LoginDao {
    boolean login(Account account);
}
