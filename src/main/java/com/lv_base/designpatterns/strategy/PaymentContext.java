package com.lv_base.designpatterns.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author: lvrongzhuan
 * @Description: 支付策略上下文
 * @Date: 2019/6/3 21:43
 * @Version: 1.0
 * modified by:
 */
@Component
public class PaymentContext {
    @Autowired
    private Map<String,PaymentStrategy> paymentStrategyList;

    /**
     *
     * @param paymentRequestDto
     */
    public void invokePayment(PaymentRequestDto paymentRequestDto) {
        paymentStrategyList.get(paymentRequestDto.getPaymentTypeEnum().getType()).payment(paymentRequestDto);
    }
}
