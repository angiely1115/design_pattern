package com.lv_base.designpatterns.bridge.demo2;

/**
 * @Author: lvrongzhuan
 * @Description: 菱形
 * @Date: 2019/6/5 22:38
 * @Version: 1.0
 * modified by:
 */
public class RoundShape implements Shape{
    @Override
    public String makeShape() {
        return "圆形";
    }
}
