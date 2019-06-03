package com.lv_base.designpatterns.strategy;

/**
 * @Author: lvrongzhuan
 * @Description: 付款策略 策略模式实质 是分离算法 选择实现 策略模式关注的重点不是算法的实现，而且如何组织和调用
 * @Date: 2019/6/3 21:41
 * @Version: 1.0
 * modified by:
 */
public interface PaymentStrategy {

    /**
     * 进行支付
     * @param paymentRequestDto
     */
     void payment(PaymentRequestDto paymentRequestDto);
}
