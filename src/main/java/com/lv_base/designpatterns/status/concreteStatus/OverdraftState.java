package com.lv_base.designpatterns.status.concreteStatus;

import com.lv_base.designpatterns.status.AccountState;
import com.lv_base.designpatterns.status.UserAccountDao;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:透支状态下账户
 * @Date: 2018/8/21 12:08
 * @Version: 1.0
 * modified by:
 */
@Service
public class OverdraftState extends AccountState{
    @Override
    public void withdraw(String userId, double amount) {
        Double amtTmp =  UserAccountDao.userAccountMap.get(userId).getAmt();
        Double amt = amtTmp-amount;
        UserAccountDao.userAccountMap.get(userId).setAmt(amt);
        this.computeInterest(userId);
    }

    @Override
    public void computeInterest(String userId) {
        System.out.println(UserAccountDao.userAccountMap.get(userId).getUserName()+"您已经透支，开始计算利息");
    }

    @Override
    public String state() {
        return "overdraft";

    }
}
