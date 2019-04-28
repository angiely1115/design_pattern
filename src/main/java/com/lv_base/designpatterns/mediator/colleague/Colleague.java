package com.lv_base.designpatterns.mediator.colleague;

import com.lv_base.designpatterns.mediator.Mediator;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: lvrongzhuan
 * @Description:定义一个抽象同事
 * @Date: 2018/8/15 10:59
 * @Version: 1.0
 * modified by:
 */
public abstract class Colleague {
    //拥有一个中介者
    @Autowired
    protected Mediator mediator;
}
