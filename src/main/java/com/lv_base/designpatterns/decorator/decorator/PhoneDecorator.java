package com.lv_base.designpatterns.decorator.decorator;

import com.lv_base.designpatterns.decorator.PhoneComponent;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: lvrongzhuan
 * @Description:装饰器 透明的对源对象进行加强
 * @Date: 2018/8/24 15:38
 * @Version: 1.0
 * modified by:
 */
public abstract class PhoneDecorator implements PhoneComponent{
    private PhoneComponent phoneComponent;

    public PhoneDecorator(PhoneComponent phoneComponent) {
        this.phoneComponent = phoneComponent;
    }

    @Override
    public void call(){
        phoneComponent.call();
    }
}
