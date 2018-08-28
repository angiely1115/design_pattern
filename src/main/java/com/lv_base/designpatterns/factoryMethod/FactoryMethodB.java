package com.lv_base.designpatterns.factoryMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:又一个工厂方法类的实现类
 * @Date: 2018/8/14 19:19
 * @Version: 1.0
 * modified by:
 */
@Service
public class FactoryMethodB extends FactoryMethod{
    @Autowired
    private ProductAPiImplB productAPiImplB;
    @Override
    protected ProductApi getProductApi() {
        return productAPiImplB;
    }
}
