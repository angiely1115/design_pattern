package com.lv_base.designpatterns.command.invoke;

import com.lv_base.designpatterns.command.Command;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/23 14:50
 * @Version: 1.0
 * modified by:
 */
public class CommandInvoke {
    public void executePrint(Command command){
        System.out.println("在请求者中，输出服务前");
        command.execute();
        System.out.println("输出服务结束");
    }
}
