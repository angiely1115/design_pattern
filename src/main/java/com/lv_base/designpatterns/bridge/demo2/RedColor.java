package com.lv_base.designpatterns.bridge.demo2;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2019/6/5 22:34
 * @Version: 1.0
 * modified by:
 */
public class RedColor extends Color{
    @Override
    protected void drawShape() {
        System.out.println("画红色的："+super.getShape().makeShape());
    }
}
