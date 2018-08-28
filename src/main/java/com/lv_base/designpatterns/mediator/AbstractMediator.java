package com.lv_base.designpatterns.mediator;

import com.lv_base.designpatterns.AbstractFactory.AbstractFactoryComputer;
import com.lv_base.designpatterns.mediator.colleague.AbstractColleague;

import java.util.Objects;

/**
 * @Author: lvrongzhuan
 * @Description: 一个抽象的中介着
 * @Date: 2018/8/16 10:04
 * @Version: 1.0
 * modified by:
 */
public abstract class AbstractMediator {
    private AbstractColleague abstractColleague;

    public abstract void execute(String str, Object...objects);
}
