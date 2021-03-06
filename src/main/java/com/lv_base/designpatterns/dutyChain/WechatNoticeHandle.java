package com.lv_base.designpatterns.dutyChain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @Author: lvrongzhuan
 * @Description: 发送微信消息
 * @Date: 2018/8/25 15:12
 * @Version: 1.0
 * modified by:
 */
@Service
public class WechatNoticeHandle extends NoticeHandler{
    @Override
    public String noticeHandler(NoticeDomain noticeDomain) {
       int hour =  LocalDateTime.now().getHour();
       if(hour<6){
           System.out.println("早上6点前不发送微信消息");
       }else {
           System.out.println("发送微信消息：消息接收者："+noticeDomain.getRecipient()+"消息内容:"+noticeDomain.getContent());
       }
        noticeDomain.setIswxfail(false);
       if(noticeHandler!=null){
           return noticeHandler.noticeHandler(noticeDomain);
       }
        return "微信发送";
    }
}
