package com.pyc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.pyc.entity.UserAddress;

import java.util.List;

/*
@author pengyoucong
 */
@Service(interfaceName = "UserService")
public interface UserService {
    List<UserAddress> getUserAddressList(String userId);
}
