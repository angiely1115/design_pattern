package com.lv_base.designpatterns.AbstractFactory.concreteProduct;

import com.lv_base.designpatterns.AbstractFactory.abstractProduct.Mainboard;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:微星主板厂商的实现
 * @Date: 2018/8/14 20:12
 * @Version: 1.0
 * modified by:
 */
@Service
public class MSIMainboard implements Mainboard{
    @Override
    public void installCpu() {
        System.out.println("我是微星厂商的主板实现，只能安装 8888帧数的CPU");
    }
}
