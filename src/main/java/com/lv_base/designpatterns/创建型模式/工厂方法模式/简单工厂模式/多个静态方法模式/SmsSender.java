package com.lv_base.designpatterns.创建型模式.工厂方法模式.简单工厂模式.多个静态方法模式;

/**
 * 发送短信，实现Sender接口
 * 
 * 作者: zhoubang 
 * 日期：2015年10月26日 下午4:46:48
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("这是在发送短信...");
    }

}

