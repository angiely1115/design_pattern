package com.lv_base.designpatterns.bridge;

import com.lv_base.designpatterns.bridge.abstract1.AbstractMessage;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:发送普通消息
 * @Date: 2018/8/16 18:05
 * @Version: 1.0
 * modified by:
 */
@Service
public class CommonMessage extends AbstractMessage{
    @Override
    public void sendMessage(String sendType,String userName, String content) {
        super.sendMessage(sendType,userName, content);
    }
}
