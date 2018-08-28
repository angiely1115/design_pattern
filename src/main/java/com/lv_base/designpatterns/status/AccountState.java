package com.lv_base.designpatterns.status;

/**
 * 状态模式 同一个对象下可能存在多种种情况 并且每种情况还可以进行转换
 */
public abstract class AccountState {
    //存款 每个状态下都可以存款
    public  void deposit(String userId,double amount){
        Double amtTmp =  UserAccountDao.userAccountMap.get(userId).getAmt();
        Double amt = amtTmp+amount;
        UserAccountDao.userAccountMap.get(userId).setAmt(amt);
        this.computeInterest(userId);
    }
    //取款
    public abstract void withdraw(String userId,double amount);
    //计算利息
    public abstract void computeInterest(String userId);
    public abstract String state();
}