package com.lv_base.designpatterns.factoryMethod;

import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:具体的一个产品类
 * @Date: 2018/8/14 18:54
 * @Version: 1.0
 * modified by:
 */
@Service
public class ProductAPiImplA extends ProductApi{
    @Override
    public boolean api() {
        System.out.println("一个实现ProductApi具体产品类：ProductAPiImplA");
        return false;
    }
}
