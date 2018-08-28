package com.lv_base.designpatterns.factoryMethod;

import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description: 具体的产品实现类
 * @Date: 2018/8/14 18:55
 * @Version: 1.0
 * modified by:
 */
@Service
public class ProductAPiImplB extends ProductApi{
    @Override
    public boolean api() {
        System.out.println("一个具体的产品实现：ProductAPiImplB");
        return true;
    }
}
