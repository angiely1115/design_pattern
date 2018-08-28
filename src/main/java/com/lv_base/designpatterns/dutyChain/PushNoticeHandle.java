package com.lv_base.designpatterns.dutyChain;

import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:发送push消息
 * @Date: 2018/8/25 15:21
 * @Version: 1.0
 * modified by:
 */
@Service
public class PushNoticeHandle extends NoticeHandler{
    @Override
    public String noticeHandler(NoticeDomain noticeDomain) {
        System.out.println("发送push消息：消息接收者："+noticeDomain.getRecipient()+"消息内容:"+noticeDomain.getContent());
        if(noticeHandler!=null){
           return noticeHandler.noticeHandler(noticeDomain);
        }
        return "push推送";
    }
}
