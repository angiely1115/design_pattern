package com.lv_base.designpatterns.simpleFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @Author: lvrongzhuan
 * @Description: 一个简单工厂,简单工厂的本质：就是选择实现
 * @Date: 2018/8/14 17:12
 * @Version: 1.0
 * modified by:
 */
@Component
public class SimpleFactory {
    @Autowired
    private APIAImp apiaImp;
    @Autowired
    private APIBImp apibImp;
     public ApiProduct getApiProduct(String type){
         if(Objects.equals("A",type)){
             return apiaImp;
         }else {
             return apibImp;
         }
     }

}
