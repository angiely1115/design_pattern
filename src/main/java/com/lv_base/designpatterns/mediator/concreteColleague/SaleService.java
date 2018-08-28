package com.lv_base.designpatterns.mediator.concreteColleague;

import com.lv_base.designpatterns.mediator.colleague.AbstractColleague;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: lvrongzhuan
 * @Description:销售服务
 * @Date: 2018/8/16 9:57
 * @Version: 1.0
 * modified by:
 */
@Service
public class SaleService extends AbstractColleague{
    public int saleStatus(){
        return ThreadLocalRandom.current().nextInt(100);
    }

    public void offSale(int num){
        System.out.println("半价销售:"+num+"");
    }

    /**
     * 销售电脑
     * @param number
     */
    public void saleComputer(int number){
        super.abstractMediator.execute("sale",number);
    }
}
