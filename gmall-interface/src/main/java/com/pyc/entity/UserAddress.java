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
    private String UserId;
    private String consignee;
    private String phoneNumber;
    private String isDefault;
}
