package com.lv_base.designpatterns.mediator.concreteColleague;

import com.lv_base.designpatterns.mediator.colleague.Colleague;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description: 一个CD同事
 * @Date: 2018/8/15 11:03
 * @Version: 1.0
 * modified by:
 */
@Service
public class CDdriver extends Colleague {
    //从CD光驱里面获取数据
    public String getData(){
        return "设计模式,值得研究";
    }

    //读取光盘数据
    public void readCD(){
        super.mediator.changed(this);
    }

}
