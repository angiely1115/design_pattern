package com.lv_base.designpatterns.bridge.demo2;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2019/6/5 22:21
 * @Version: 1.0
 * modified by:
 */
public abstract class Color {
    // 桥
    private Shape shape;

    protected abstract void drawShape();

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
