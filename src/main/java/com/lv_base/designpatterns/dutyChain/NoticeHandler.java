package com.lv_base.designpatterns.dutyChain;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/25 15:05
 * @Version: 1.0
 * modified by:
 */
public abstract class NoticeHandler {
    //持有自己的对象
    protected NoticeHandler noticeHandler;

    public void setNoticeHandler(NoticeHandler noticeHandler) {
        this.noticeHandler = noticeHandler;
    }

    public abstract String noticeHandler(NoticeDomain noticeDomain);
}
