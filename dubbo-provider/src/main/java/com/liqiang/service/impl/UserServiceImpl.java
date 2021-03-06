package com.liqiang.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liqiang.dao.UserDao;
import com.liqiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public String getDetail(String id) {
        System.out.println(super.getClass().getName()+"被调用一次："+System.currentTimeMillis());
        return userDao.getDetail(id);
    }

}
