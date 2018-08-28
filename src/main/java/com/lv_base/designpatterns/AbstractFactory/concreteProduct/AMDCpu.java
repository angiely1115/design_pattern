package com.lv_base.designpatterns.AbstractFactory.concreteProduct;

import com.lv_base.designpatterns.AbstractFactory.abstractProduct.CPU;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:AMD厂商的CPU实现
 * @Date: 2018/8/14 20:07
 * @Version: 1.0
 * modified by:
 */
@Service
public class AMDCpu implements CPU{
    @Override
    public void yunsuan() {
        System.out.println("我的AMD厂商的CPU实现 8888 帧数");
    }
}
