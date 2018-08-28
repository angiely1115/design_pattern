package com.lv_base.designpatterns.decorator;

import com.lv_base.designpatterns.decorator.decorator.MusicPhone;
import com.lv_base.designpatterns.decorator.decorator.PhoneDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/24 15:46
 * @Version: 1.0
 * modified by:
 */
@Service
public class ViVoPhone {
    @Autowired
    private SimplePhone simplePhone;
    public void call(){
        System.out.println("vivo手机的功能");
        PhoneComponent phoneComponent = simplePhone;
        MusicPhone musicPhone = new MusicPhone(phoneComponent);
        musicPhone.call();
    }
}
