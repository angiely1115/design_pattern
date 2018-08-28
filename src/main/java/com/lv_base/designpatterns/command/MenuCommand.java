package com.lv_base.designpatterns.command;

import com.lv_base.designpatterns.command.receive.MenuBoardScreen;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/23 15:39
 * @Version: 1.0
 * modified by:
 */
public abstract class MenuCommand {
    @Autowired
    protected MenuBoardScreen menuBoardScreen ;

    public abstract void execute();
}
