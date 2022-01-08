package com.pyc.service.impl;

import com.pyc.entity.UserAddress;
import com.pyc.service.OrderService;
import com.pyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author pengyoucong
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public void initOrder(String userId) {
        System.out.println(userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress address: userAddressList) {
            System.out.println(address.getAddress());
        }
    }
}
