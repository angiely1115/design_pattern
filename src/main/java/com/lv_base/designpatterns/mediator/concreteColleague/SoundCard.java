package com.lv_base.designpatterns.mediator.concreteColleague;

import com.lv_base.designpatterns.mediator.colleague.Colleague;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:声卡同事类
 * @Date: 2018/8/15 11:27
 * @Version: 1.0
 * modified by:
 */
@Service
public class SoundCard extends Colleague {

    //声卡播放声音数据
    public void soundData(String data){
        System.out.println("您听到的声音:"+data);
    }
}
