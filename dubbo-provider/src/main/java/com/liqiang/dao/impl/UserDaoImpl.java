package com.liqiang.dao.impl;

import com.liqiang.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
    @Override
    public String getDetail(String id) {
        return "用户余额：200元";
    }
}
