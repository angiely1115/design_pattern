package com.lv_base.designpatterns.expression;

public interface Expression {
    //一定会有解释方法
    int interpreter(Context context);
}