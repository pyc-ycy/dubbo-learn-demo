package com.pyc.service.impl;

import com.pyc.entity.UserAddress;
import com.pyc.service.OrderService;
import com.pyc.service.UserService;

import java.util.List;

/*
@author pengyoucong
 */
public class OrderServiceImpl implements OrderService {

    UserService userService;

    @Override
    public void initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
    }
}
