package com.lv_base.designpatterns.mediator.concreteColleague;

import com.lv_base.designpatterns.mediator.colleague.Colleague;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:显卡同事
 * @Date: 2018/8/15 11:26
 * @Version: 1.0
 * modified by:
 */
@Service
public class VideoCard extends Colleague {
    //显卡用来显示数据
    public void   showData(String data){
        System.out.println("您正在观看："+data);
    }

}
