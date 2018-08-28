package com.lv_base.designpatterns.bridge;

import com.lv_base.designpatterns.bridge.abstract1.AbstractMessage;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:重要的消息
 * @Date: 2018/8/16 18:18
 * @Version: 1.0
 * modified by:
 */
@Service
public class ImportantMessage extends AbstractMessage{
    @Override
    public void sendMessage(String sendType, String userName, String content) {
        content = "重要！！".concat(content);
        super.sendMessage(sendType, userName, content);
    }

    public void watch(){
        System.out.println("重要消息看完监控");
    }
}
