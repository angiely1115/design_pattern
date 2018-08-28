package com.lv_base.designpatterns.flyweight.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/27 11:12
 * @Version: 1.0
 * modified by:
 */
@Data
public class PersonDomain implements Serializable{
    private static final long serialVersionUID = 3285626540336318832L;
    private String name;
    private int age;
    private String address;

}
