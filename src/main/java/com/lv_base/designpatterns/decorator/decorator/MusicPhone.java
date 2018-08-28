package com.lv_base.designpatterns.decorator.decorator;

import com.lv_base.designpatterns.decorator.PhoneComponent;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:加强手机 可以听音乐
 * @Date: 2018/8/24 15:40
 * @Version: 1.0
 * modified by:
 */
public class MusicPhone extends PhoneDecorator{

    public MusicPhone(PhoneComponent phoneDecorator) {
        super(phoneDecorator);
    }

    @Override
    public void call() {
        System.out.println("MusicPhone super:"+super.toString());
        System.out.println("打电话之前听首歌");
        super.call();
    }
}
