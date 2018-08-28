package com.lv_base.designpatterns.dutyChain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/25 15:08
 * @Version: 1.0
 * modified by:
 */
@Data
public class NoticeDomain implements Serializable{
    private String recipient;//接收者

    private String content;//内容

    private boolean iswxfail = true;//微信消息是否发送成功 默认发送成功
}
