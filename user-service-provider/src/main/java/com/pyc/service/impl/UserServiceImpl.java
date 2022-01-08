package com.pyc.service.impl;

import com.pyc.entity.UserAddress;
import com.pyc.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address = new UserAddress(1, "丕平郡天涯路定远公馆", "1", "Joh", "Y");
        UserAddress address1 = new UserAddress(2, "丕平郡天涯路定远公馆", "1", "Tom", "Y");
        return Arrays.asList(address, address1);
    }
}
