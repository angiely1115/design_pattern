package com.lv_base.designpatterns.mediator;

import com.lv_base.designpatterns.mediator.colleague.Colleague;

/**
 * @Author: lvrongzhuan
 * @Description: 定义一个抽象中介者
 * @Date: 2018/8/15 10:57
 * @Version: 1.0
 * modified by:
 */
public abstract class Mediator {

    //中介着也肯定要与同事类打交道
    public abstract void changed(Colleague colleague);
}
