package com.lv_base.designpatterns.bridge.impl;

import com.lv_base.designpatterns.bridge.SendMessage;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/16 17:55
 * @Version: 1.0
 * modified by:
 */
@Service
public class SendMessageByEmail implements SendMessage{
    @Override
    public String sendType() {
        return "Email";
    }

    @Override
    public void sendMessage(String userName, String content) {
        System.out.println("通过邮件发送消息：发送给："+userName+"发送内容:"+content);
    }
}
