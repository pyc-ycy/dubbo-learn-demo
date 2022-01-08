package com.pyc.service;

import com.pyc.entity.UserAddress;

import java.util.List;

/*
@author pengyoucong
 */
public interface UserService {
    List<UserAddress> getUserAddressList(String userId);
}
