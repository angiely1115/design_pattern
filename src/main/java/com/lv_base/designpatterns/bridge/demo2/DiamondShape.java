package com.lv_base.designpatterns.bridge.demo2;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2019/6/5 22:39
 * @Version: 1.0
 * modified by:
 */
public class DiamondShape implements Shape{
    @Override
    public String makeShape() {
        return "菱形";
    }
}
