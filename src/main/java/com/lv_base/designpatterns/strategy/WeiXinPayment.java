package com.lv_base.designpatterns.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2019/6/3 21:49
 * @Version: 1.0
 * modified by:
 */
@Service
@Slf4j
public class WeiXinPayment implements PaymentStrategy{
    @Override
    public void payment(PaymentRequestDto paymentRequestDto) {
        log.info("用微信支付进行支付金额：{},支付账号：{}",paymentRequestDto.getAmount(),paymentRequestDto.getAccount());
    }
}
