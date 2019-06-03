package com.lv_base.designpatterns.strategy;

import lombok.Data;

/**
 * @Author: lvrongzhuan
 * @Description: 支付请求dto
 * @Date: 2019/6/3 21:45
 * @Version: 1.0
 * modified by:
 */
@Data
public class PaymentRequestDto {
    /**
     * 支付金额
     */
    private long amount;

    /**
     * 支付账号
     */
    private String account;

    /**
     * 支付方式
     */
    private PaymentEnum.PaymentTypeEnum paymentTypeEnum;
}
