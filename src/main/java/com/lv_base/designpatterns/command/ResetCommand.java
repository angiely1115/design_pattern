package com.lv_base.designpatterns.command;

import com.lv_base.designpatterns.command.receive.MainBoardApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/23 14:10
 * @Version: 1.0
 * modified by:
 */
@Service
public class ResetCommand implements Command{
    @Autowired
    private List<MainBoardApi> mainBoardApis;
    @Override
    public void execute() {
        mainBoardApis.get(0).reset();
    }
}
