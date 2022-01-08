package com.pyc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*
@author pengyoucong
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserAddress implements Serializable {
    private Integer id;
    private String userId;
    private String address;
    private String consignee;
    private String phoneNumber;
    private String isDefault;

    public UserAddress(String userId, String address, String consignee, String phoneNumber, String isDefault){
        this.userId = userId;
        this.address=address;
        this.consignee = consignee;
        this.phoneNumber = phoneNumber;
        this.isDefault = isDefault;
    }
}
