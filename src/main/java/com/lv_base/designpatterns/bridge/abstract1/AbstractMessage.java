package com.lv_base.designpatterns.bridge.abstract1;

import com.lv_base.designpatterns.bridge.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/16 17:52
 * @Version: 1.0
 * modified by:
 */
@Component
public abstract class AbstractMessage {
    //这个就是一座桥
    @Autowired
    private List<SendMessage> sendMessages;

    public  void sendMessage(String sendType,String userName,String content){
        this.getSendMessage(sendType).sendMessage(userName,content);
    }

    protected SendMessage getSendMessage(String sendType){
        for(int i=0;i<sendMessages.size();i++) {
            System.out.println(sendMessages.get(i).sendType());
            if (sendType.equals(sendMessages.get(i).sendType())) {
                return sendMessages.get(i);
            }
        }
        return null;
    }
}
