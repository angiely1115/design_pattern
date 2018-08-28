package com.lv_base.designpatterns.mediator.concreteColleague;

import com.lv_base.designpatterns.mediator.colleague.AbstractColleague;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description: 采购服务
 * @Date: 2018/8/16 9:45
 * @Version: 1.0
 * modified by:
 */
@Service
public class PuschaseService extends AbstractColleague{
    public void stopPuschase(){
        System.out.println("库存已经满了 ，停止采购");
    }

    public void startPuschase(int number){
        System.out.println("开始采购");
        super.abstractMediator.execute("pus",number);
    }

}
