package com.lv_base.designpatterns.AbstractFactory.concreteProduct;

import com.lv_base.designpatterns.AbstractFactory.abstractProduct.Mainboard;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description: 技嘉的主板厂商实现
 * @Date: 2018/8/14 20:10
 * @Version: 1.0
 * modified by:
 */
@Service
public class GAMainboard implements Mainboard{
    @Override
    public void installCpu() {
        System.out.println("我是技嘉厂商的主板，只能安装 9999帧数的CPU");
    }
}
