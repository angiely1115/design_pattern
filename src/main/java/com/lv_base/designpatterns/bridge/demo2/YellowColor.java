package com.lv_base.designpatterns.bridge.demo2;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2019/6/5 22:37
 * @Version: 1.0
 * modified by:
 */
public class YellowColor extends Color{
    @Override
    protected void drawShape() {
        System.out.println("画黄色的："+super.getShape().makeShape());
    }
}
