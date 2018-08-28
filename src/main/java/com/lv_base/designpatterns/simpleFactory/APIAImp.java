package com.lv_base.designpatterns.simpleFactory;

import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description: 抽象产品的一个具体实现
 * @Date: 2018/8/14 16:49
 * @Version: 1.0
 * modified by:
 */
@Service
public class APIAImp implements ApiProduct{
    @Override
    public void hello() {
        System.out.println("我是抽象产品的一个实现APIAImp");
    }
}
