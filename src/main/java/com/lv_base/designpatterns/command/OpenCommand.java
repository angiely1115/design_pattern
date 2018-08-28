package com.lv_base.designpatterns.command;

import com.lv_base.designpatterns.command.receive.MainBoardApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lvrongzhuan
 * @Description:开机命令
 * @Date: 2018/8/23 11:56
 * @Version: 1.0
 * modified by:
 */
@Service
public class OpenCommand implements Command{
    @Autowired
    private List<MainBoardApi> mainBoardApis;//接收者 苦逼的执行
    @Override
    public void execute() {
        mainBoardApis.get(0).open();
    }
}
