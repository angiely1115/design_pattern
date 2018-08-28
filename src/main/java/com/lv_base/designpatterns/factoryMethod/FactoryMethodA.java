package com.lv_base.designpatterns.factoryMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description: 一个具体工厂方法类的实现类
 * @Date: 2018/8/14 19:16
 * @Version: 1.0
 * modified by:
 */
@Service
public class FactoryMethodA extends FactoryMethod{
    @Autowired
    private ProductAPiImplA productAPiImplA;
    @Override
    protected ProductApi getProductApi() {
        return productAPiImplA;
    }
}
