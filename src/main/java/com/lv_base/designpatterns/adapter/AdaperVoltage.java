package com.lv_base.designpatterns.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:适配器 要使得用原来的已经存在的V18 适配器模式本质：转换匹配，功能复用
 * @Date: 2018/8/16 15:37
 * @Version: 1.0
 * modified by:
 */
@Service
public class AdaperVoltage implements Voltage{
    @Autowired
    private V18 v18;
    @Override
    public void request() {
        v18.miniV();
    }
}
