package com.lv_base.designpatterns.bridge;

/**
 * @Author: lvrongzhuan
 * @Description: 发送消息接口
 * @Date: 2018/8/16 17:40
 * @Version: 1.0
 * modified by:
 */
public interface SendMessage {

    public void sendMessage(String userName,String content);

    public String sendType();
}
