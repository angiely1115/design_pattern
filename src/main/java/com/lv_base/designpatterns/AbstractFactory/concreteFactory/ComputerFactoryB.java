package com.lv_base.designpatterns.AbstractFactory.concreteFactory;

import com.lv_base.designpatterns.AbstractFactory.AbstractFactoryComputer;
import com.lv_base.designpatterns.AbstractFactory.abstractProduct.CPU;
import com.lv_base.designpatterns.AbstractFactory.abstractProduct.Mainboard;
import com.lv_base.designpatterns.AbstractFactory.concreteProduct.AMDCpu;
import com.lv_base.designpatterns.AbstractFactory.concreteProduct.MSIMainboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:电脑生产厂商B
 * @Date: 2018/8/14 20:18
 * @Version: 1.0
 * modified by:
 */
@Service
public class ComputerFactoryB extends AbstractFactoryComputer {
    @Autowired
    private AMDCpu amdCpu;
    @Autowired
    private MSIMainboard msiMainboard;
    @Override
    public CPU getCPU() {
        return amdCpu;
    }

    @Override
    public Mainboard getMainboard() {
        return msiMainboard;
    }
}
