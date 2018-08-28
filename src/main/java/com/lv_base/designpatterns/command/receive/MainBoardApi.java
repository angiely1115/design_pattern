package com.lv_base.designpatterns.command.receive;

/**
 * @Author: lvrongzhuan
 * @Description: 命令模式的接收者抽象
 * @Date: 2018/8/23 11:44
 * @Version: 1.0
 * modified by:
 */
public interface MainBoardApi {

    //主板拥有开机功能
    void open();

    //主板拥有重启功能
    void reset();
}
