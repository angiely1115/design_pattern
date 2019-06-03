package com.lv_base.designpatterns.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2019/6/3 21:51
 * @Version: 1.0
 * modified by:
 */
@Service
@Slf4j
public class BankPayment implements PaymentStrategy{
    @Override
    public void payment(PaymentRequestDto paymentRequestDto) {
      BankPaymentRequestDto bankPaymentRequestDto = (BankPaymentRequestDto) paymentRequestDto;
        log.info("用银行卡支付进行支付金额：{},支付账号：{},开户行：{}",paymentRequestDto.getAmount(),paymentRequestDto.getAccount(),bankPaymentRequestDto.getBankName());
    }
}
