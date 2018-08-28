package com.lv_base.designpatterns.adapter;

import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/16 15:35
 * @Version: 1.0
 * modified by:
 */
@Service
public class V220 implements Voltage{
    @Override
    public void request() {
        System.out.println("220V的电压");
    }
}
