package com.lv_base.designpatterns.mediator.concreteColleague;

import com.lv_base.designpatterns.mediator.colleague.Colleague;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:CPU同事类
 * @Date: 2018/8/15 11:18
 * @Version: 1.0
 * modified by:
 */
@Service
@Scope(value = "prototype")
public class CPU extends Colleague {
    private String[] executeData;//CPU处理后的数据
    //CPU接收从光盘读取的数据来处理数据
    public void executeData(String  data){
        this.executeData = data.split(",");
        super.mediator.changed(this);
    }

    public String[] getExecuteData() {
        return executeData;
    }

    public void setExecuteData(String[] executeData) {
        this.executeData = executeData;
    }
}
