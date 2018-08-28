package com.lv_base.designpatterns.facade;

import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description: 模拟一个业务模块B
 * @Date: 2018/8/15 9:55
 * @Version: 1.0
 * modified by:
 */
@Service
public class ModuleB {
     void moduleB(){
        System.out.println("业务模块B");
    }
}
