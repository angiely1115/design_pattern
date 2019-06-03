package com.lv_base.designpatterns.strategy;

import lombok.Data;

/**
 * @Author: lvrongzhuan
 * @Description: 使用银行卡支付
 * @Date: 2019/6/3 21:50
 * @Version: 1.0
 * modified by:
 */
@Data
public class BankPaymentRequestDto extends PaymentRequestDto {
    /**
     * 开户行
     */
    private String bankName;
}
