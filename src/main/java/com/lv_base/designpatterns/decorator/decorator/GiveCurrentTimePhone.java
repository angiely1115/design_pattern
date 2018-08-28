package com.lv_base.designpatterns.decorator.decorator;

import com.lv_base.designpatterns.decorator.PhoneComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: lvrongzhuan
 * @Description:计时加强 打完电话后可以记录通话时间
 * @Date: 2018/8/24 15:43
 * @Version: 1.0
 * modified by:
 */
public class GiveCurrentTimePhone extends PhoneDecorator{
    public GiveCurrentTimePhone(PhoneComponent phoneComponent) {
        super(phoneComponent);
    }

    @Override
    public void call() {
        System.out.println("GiveCurrentTimePhone super:"+super.toString());
        super.call();
        System.out.println("本次通话时间："+ ThreadLocalRandom.current().nextInt(1000)+"s");
    }
}
