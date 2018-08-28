package com.lv_base.designpatterns.command;

import com.lv_base.designpatterns.command.receive.MenuBoardScreen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/23 15:30
 * @Version: 1.0
 * modified by:
 */
@Service
public class MenuOpenCommand extends MenuCommand{
    @Override
    public void execute() {
        menuBoardScreen.openMenu();
    }
}
