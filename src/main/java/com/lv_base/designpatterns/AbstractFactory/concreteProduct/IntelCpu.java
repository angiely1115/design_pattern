package com.lv_base.designpatterns.AbstractFactory.concreteProduct;

import com.lv_base.designpatterns.AbstractFactory.abstractProduct.CPU;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description: Intel厂商的CPU实现
 * @Date: 2018/8/14 20:06
 * @Version: 1.0
 * modified by:
 */
@Service
public class IntelCpu implements CPU{
    @Override
    public void yunsuan() {
        System.out.println("我是Intel厂商CPU的实现 9999帧数");
    }
}
