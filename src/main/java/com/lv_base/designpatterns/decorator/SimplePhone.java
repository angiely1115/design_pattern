package com.lv_base.designpatterns.decorator;

import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/24 15:34
 * @Version: 1.0
 * modified by:
 */
@Service
public class SimplePhone implements PhoneComponent{
    @Override
    public void call() {
        System.out.println("打电话");
    }
}
