package com.lv_base.designpatterns.mediator.concreteColleague;

import com.lv_base.designpatterns.mediator.colleague.AbstractColleague;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:库存服务
 * @Date: 2018/8/16 9:51
 * @Version: 1.0
 * modified by:
 */
@Service
public class StockService extends AbstractColleague{
    private static int COMPUTER_NUMBER=100;

    /**
     * 增加库存
     * @param number
     */
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER+number;
        System.out.println("增加库存后数量:"+COMPUTER_NUMBER);
    }

    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER-number;
        System.out.println("减少库存后数量:"+COMPUTER_NUMBER);
    }

    public void clearStock(){
        System.out.println("清理存货前数量:"+COMPUTER_NUMBER);
        COMPUTER_NUMBER = 0;
        System.out.println("清理存货后数量:"+COMPUTER_NUMBER);
    }

    /**
     * 清仓
     */
    public void clear(){
        super.abstractMediator.execute("clear");
    }

    public static int getComputerNumber() {
        return COMPUTER_NUMBER;
    }

    public static void setComputerNumber(int computerNumber) {
        COMPUTER_NUMBER = computerNumber;
    }
}
