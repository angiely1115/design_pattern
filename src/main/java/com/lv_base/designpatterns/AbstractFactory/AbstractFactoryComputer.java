package com.lv_base.designpatterns.AbstractFactory;

import com.lv_base.designpatterns.AbstractFactory.abstractProduct.CPU;
import com.lv_base.designpatterns.AbstractFactory.abstractProduct.Mainboard;

/**
 * @Author: lvrongzhuan
 * @Description:电脑组装抽象工厂类 抽象工厂的本质:选择实现产品簇
 * @Date: 2018/8/14 20:00
 * @Version: 1.0
 * modified by:
 */
public abstract class AbstractFactoryComputer {

   protected abstract CPU getCPU();

    protected abstract Mainboard getMainboard();
}
