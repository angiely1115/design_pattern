package com.lv_base.designpatterns.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: lvrongzhuan
 * @Description:状态模式的上下文
 * @Date: 2018/8/21 12:16
 * @Version: 1.0
 * modified by:
 */
@Service
public class AccountContext {
    @Autowired
    private Map<String, AccountState> accountStates;
    public void deposit(String userId,double amount){
        AccountState accountState = this.stateCheck(userId,-amount);
        UserAccount userAccount = UserAccountDao.userAccountMap.get(userId);
        System.out.println(UserAccountDao.userAccountMap.get(userId).getUserName()+"存款前余额："+userAccount.getAmt());
        accountState.deposit(userId,amount);
        System.out.println(UserAccountDao.userAccountMap.get(userId).getUserName()+"存款后余额："+userAccount.getAmt());
        System.out.println("当前账户状态："+accountState.state());
        System.out.println("***************************");
    }
    public void withdraw(String userId, double amount) {
        AccountState accountState = this.stateCheck(userId,amount);
        UserAccount userAccount = UserAccountDao.userAccountMap.get(userId);
        System.out.println(UserAccountDao.userAccountMap.get(userId).getUserName()+"取款前余额："+userAccount.getAmt());
        accountState.withdraw(userId,amount);
        System.out.println(UserAccountDao.userAccountMap.get(userId).getUserName()+"取款后余额："+userAccount.getAmt());
        System.out.println("当前账户状态："+accountState.state());
        System.out.println("***************************");
    }

 /*   public void computeInterest(String userId){
        AccountState accountState = this.stateCheck(userId);
        accountState.computeInterest(userId);
        System.out.println("当前账户状态："+accountState.state());
        System.out.println("***************************");
    }*/

    private AccountState stateCheck(String userId,double amount) {
        Double amt = UserAccountDao.userAccountMap.get(userId).getAmt();
        Double resuAmt = amt-amount;
        if(resuAmt+2000<0){
            return accountStates.get("excessState");
        }
        if (resuAmt>=0) {
            return accountStates.get("normalStatus");
            //正常状态
        } if ((resuAmt > -2000 && resuAmt <= 0)||resuAmt+2000==0) {
            //透支状态
            return accountStates.get("overdraftState");
        } else {
            //受限状态
            return accountStates.get("restrictedState");
        }
    }
}
