package com.lv_base.designpatterns.status.concreteStatus;

import com.lv_base.designpatterns.status.AccountState;
import com.lv_base.designpatterns.status.UserAccountDao;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:受限的账户
 * @Date: 2018/8/21 12:13
 * @Version: 1.0
 * modified by:
 */
@Service
public class RestrictedState extends AccountState{
    @Override
    public void withdraw(String userId, double amount) {
        System.out.println(UserAccountDao.userAccountMap.get(userId).getUserName()+"您的账户已经受限无法进行取款，请存款");
        this.computeInterest(userId);
    }

    @Override
    public void computeInterest(String userId) {
        System.out.println(UserAccountDao.userAccountMap.get(userId).getUserName()+"您的账户已经受限、计算利息");
    }

    @Override
    public String state() {
        return "restricted";
    }
}
