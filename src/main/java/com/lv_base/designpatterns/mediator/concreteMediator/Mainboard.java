package com.lv_base.designpatterns.mediator.concreteMediator;

import com.lv_base.designpatterns.mediator.Mediator;
import com.lv_base.designpatterns.mediator.colleague.Colleague;
import com.lv_base.designpatterns.mediator.concreteColleague.CDdriver;
import com.lv_base.designpatterns.mediator.concreteColleague.CPU;
import com.lv_base.designpatterns.mediator.concreteColleague.SoundCard;
import com.lv_base.designpatterns.mediator.concreteColleague.VideoCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description: 中介着的实现着 主板 ,他需要用于同事类的实现类 便于交互
 * @Date: 2018/8/15 11:30
 * @Version: 1.0
 * modified by:
 */
@Service
public class Mainboard extends Mediator{
    @Autowired
    private CDdriver cDdriver;
    @Autowired
    private CPU cpu;
    @Autowired
    private VideoCard videoCard;
    @Autowired
    private SoundCard soundCard;
    @Override
    public void changed(Colleague colleague) {
        if(colleague.getClass()==CDdriver.class){
            this.openCDdriverReadData();
        }else if (colleague.getClass()==cpu.getClass()){
            this.opeCup();
        }

    }

    //打开光盘读取数据
    private void openCDdriverReadData(){
        //读取数据
        String data = cDdriver.getData();
        //把读取出的数据交给CPU处理
        cpu.executeData(data);
    }

    private void opeCup(){
        String[] strings = cpu.getExecuteData();
        videoCard.showData(strings[0]);
        soundCard.soundData(strings[1]);
    }
}
