package com.lv_base.designpatterns.command;

import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/23 15:42
 * @Version: 1.0
 * modified by:
 */
@Service
public class MenuCreateCommand extends MenuCommand{
    @Override
    public void execute() {
        menuBoardScreen.create();
    }
}
