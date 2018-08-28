package com.lv_base.designpatterns.dutyChain;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @Author: lvrongzhuan
 * @Description:发送短信消息
 * @Date: 2018/8/25 15:18
 * @Version: 1.0
 * modified by:
 */
@Service
public class SmsNoticeHandle extends NoticeHandler{
    @Override
    public String noticeHandler(NoticeDomain noticeDomain) {
        int hour = LocalDateTime.now().getHour();
        if (hour<6){
            System.out.println("早上6点前不发送短信");
            //微信发送失败
        }else if(noticeDomain.isIswxfail()){
            System.out.println("发送短信消息：消息接收者："+noticeDomain.getRecipient()+"消息内容:"+noticeDomain.getContent());
        }
        if(noticeHandler!=null){
            return noticeHandler.noticeHandler(noticeDomain);
        }
        return "发送短信消息";
    }
}
