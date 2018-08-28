package com.lv_base.designpatterns.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:一个门面 门面模式的本质：封装交互，简化调用
 * @Date: 2018/8/15 10:11
 * @Version: 1.0
 * modified by:
 */
@Service
public class Facade {
    @Autowired
    private ModuleA moduleA;
    @Autowired
    private ModuleB moduleB;
    @Autowired
    private ModuleC moduleC;

    //处理一个业务需要A B C三个模块
    public void operation(){
        moduleA.moduleA();
        moduleB.moduleB();
        moduleC.moduleC();
    }
}
