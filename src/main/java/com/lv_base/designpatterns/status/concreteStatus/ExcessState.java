package com.lv_base.designpatterns.status.concreteStatus;

import com.lv_base.designpatterns.status.AccountState;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:超额状态
 * @Date: 2018/8/21 14:15
 * @Version: 1.0
 * modified by:
 */
@Service
public class ExcessState extends AccountState{
    @Override
    public void withdraw(String userId, double amount) {
        System.out.println("您的账户余额不够!!");
        this.computeInterest(userId);
    }

    @Override
    public void computeInterest(String userId) {
        System.out.println("余额不足 不用计算利息");
    }

    @Override
    public String state() {
        return "excess";
    }
}
