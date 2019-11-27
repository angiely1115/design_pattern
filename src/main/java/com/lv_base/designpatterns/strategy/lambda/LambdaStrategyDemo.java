package com.lv_base.designpatterns.strategy.lambda;

import com.lv_base.designpatterns.strategy.AliPayment;
import com.lv_base.designpatterns.strategy.BankPayment;
import com.lv_base.designpatterns.strategy.PaymentRequestDto;
import com.lv_base.designpatterns.strategy.PaymentStrategy;

import java.util.function.Function;

/**
 * @Author: lvrongzhuan
 * @Description: 利用lambda实现策略模式
 * @Date: 2019/11/27 14:20
 * @Version: 1.0
 * modified by:
 */
public class LambdaStrategyDemo {

    public static void main(String[] args) {
        // 支付
        Function<PaymentRequestDto, PaymentStrategy> aliPayment = paymentRequestDto -> {
            return new AliPayment();
        };

        Function<PaymentRequestDto, PaymentStrategy> bankPayment = paymentRequestDto -> new BankPayment();

        Function<PaymentStrategy,Integer> strategyIntegerFunction = paymentStrategy -> 100;
        System.out.println(aliPayment.andThen(strategyIntegerFunction).apply(new PaymentRequestDto()));
        Function<String,String> str1 = s -> s.concat(" lvrz").concat(" love");
        Function<String,String> str2 = s -> s.concat(" bsz");
        System.out.println(str1.andThen(str2).apply("lambda"));
    }
}
