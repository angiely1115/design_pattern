package com.lv_base.designpatterns.AbstractFactory;

import com.lv_base.designpatterns.AbstractFactory.abstractProduct.CPU;
import com.lv_base.designpatterns.AbstractFactory.abstractProduct.Mainboard;

/**
 * @Author: lvrongzhuan
 * @Description:电脑组装抽象工厂类 抽象工厂的本质:选择实现产品簇
 * 这里使用的抽象工厂和工厂方法组合的模式
 * @Date: 2018/8/14 20:00
 * @Version: 1.0
 * modified by:
 */
public abstract class AbstractFactoryComputer {

   protected abstract CPU getCPU();

   protected abstract Mainboard getMainboard();

    /**
     * 组装电脑
     */
   public final void  buildComputer() {
       this.getCPU().yunsuan();
       this.getMainboard().installCpu();
    }
}
