package com.lv_base.designpatterns.dutyChain;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/25 15:05
 * @Version: 1.0
 * modified by:
 */
public abstract class NoticeHandler {

    protected NoticeHandler noticeHandler;//持有自己的对象

    public void setNoticeHandler(NoticeHandler noticeHandler) {
        this.noticeHandler = noticeHandler;
    }

    public abstract String noticeHandler(NoticeDomain noticeDomain);
}
