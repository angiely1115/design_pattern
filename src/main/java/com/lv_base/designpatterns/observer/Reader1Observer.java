package com.lv_base.designpatterns.observer;

import org.springframework.stereotype.Component;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: lvrongzhuan
 * @Description:读者1观察着
 * @Date: 2018/8/20 15:04
 * @Version: 1.0
 * modified by:
 */
@Component
public class Reader1Observer extends AbstractObServer implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observable:"+o+"读者1接收发送内容:"+arg);
    }
}
