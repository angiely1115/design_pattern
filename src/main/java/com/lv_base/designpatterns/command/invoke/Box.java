package com.lv_base.designpatterns.command.invoke;

import com.lv_base.designpatterns.command.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lvrongzhuan
 * @Description:机箱 请求发送着
 * @Date: 2018/8/23 12:00
 * @Version: 1.0
 * modified by:
 */
@Service
public class Box {
    @Autowired
    private List<Command> commands;
    //请求开机
    public void  open(){
        commands.get(0).execute();
    }


    public void reset(){
        commands.get(1).execute();
    }
}
