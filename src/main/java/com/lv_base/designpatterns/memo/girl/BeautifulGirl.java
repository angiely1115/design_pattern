package com.lv_base.designpatterns.memo.girl;

import lombok.Data;

/**
 * @Author: lvrongzhuan
 * @Description: 四大美女 备忘录对象
 * @Date: 2019/3/25 21:21
 * @Version: 1.0
 * modified by:
 */
@Data
public class BeautifulGirl {
    /**
     * 美女名字
     */
    private String name;

    /**
     * 美女年龄
     */
    private int age;

    /**
     * 美女地址
     */
    private String address;

    public BeautifulGirl(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
