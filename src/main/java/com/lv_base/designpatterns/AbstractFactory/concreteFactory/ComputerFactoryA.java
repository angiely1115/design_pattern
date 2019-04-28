package com.lv_base.designpatterns.AbstractFactory.concreteFactory;

import com.lv_base.designpatterns.AbstractFactory.AbstractFactoryComputer;
import com.lv_base.designpatterns.AbstractFactory.abstractProduct.CPU;
import com.lv_base.designpatterns.AbstractFactory.abstractProduct.Mainboard;
import com.lv_base.designpatterns.AbstractFactory.concreteProduct.GAMainboard;
import com.lv_base.designpatterns.AbstractFactory.concreteProduct.IntelCpu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:电脑生产商A
 * @Date: 2018/8/14 20:15
 * @Version: 1.0
 * modified by:
 */
@Service
public class ComputerFactoryA extends AbstractFactoryComputer {
    @Autowired
    private IntelCpu intelCpu;
    @Autowired
    private GAMainboard gaMainboard;
    @Override
    protected CPU getCPU() {
        return intelCpu;
    }

    @Override
    protected Mainboard getMainboard() {
        return gaMainboard;
    }
}
