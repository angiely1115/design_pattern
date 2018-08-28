package com.lv_base.designpatterns.mediator.colleague;

import com.lv_base.designpatterns.mediator.AbstractMediator;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: lvrongzhuan
 * @Description:一个抽象的同事类
 * @Date: 2018/8/16 10:03
 * @Version: 1.0
 * modified by:
 */
public abstract class AbstractColleague {
    @Autowired
   protected   AbstractMediator abstractMediator;
}
