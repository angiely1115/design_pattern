package com.lv_base.designpatterns.AbstractFactory.abstractProduct;

/**
 * @Author: lvrongzhuan
 * @Description:一块没有实现的主板
 * @Date: 2018/8/14 20:04
 * @Version: 1.0
 * modified by:
 */
public interface Mainboard {
    //在主板上安装CPU
    public void installCpu();
}
