package com.lv_base.designpatterns.decorator;

import com.lv_base.designpatterns.decorator.decorator.GiveCurrentTimePhone;
import com.lv_base.designpatterns.decorator.decorator.MusicPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/24 16:20
 * @Version: 1.0
 * modified by:
 */
@Service
public class PhoneX {
    @Autowired
    private SimplePhone simplePhone;

    public void call(){
        System.out.println("phoneX手机功能");
        PhoneComponent phoneComponent = simplePhone;
        MusicPhone musicPhone = new MusicPhone(phoneComponent);
        GiveCurrentTimePhone giveCurrentTimePhone = new GiveCurrentTimePhone(musicPhone);
        giveCurrentTimePhone.call();
    }
}
