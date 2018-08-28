package com.lv_base.designpatterns.command.invoke;

import com.lv_base.designpatterns.command.MenuCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lvrongzhuan
 * @Description:命令请求者
 * @Date: 2018/8/23 15:50
 * @Version: 1.0
 * modified by:
 */
public class MenuItem {
    private MenuCommand menuCommands;

    public MenuItem(MenuCommand menuCommands) {
        this.menuCommands = menuCommands;
    }

    //点击菜单选项
    public void click(){
        menuCommands.execute();
    }
}
