package com.lv_base.designpatterns.command.receive;

import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description: 命令接收者 就是苦逼干活的
 * @Date: 2018/8/23 15:31
 * @Version: 1.0
 * modified by:
 */
@Service
public class MenuBoardScreen {
    public void openMenu(){
        System.out.println("打开菜单");
    }

    public void editMenu(){
        System.out.println("编辑菜单");
    }

    public void create(){
        System.out.println("创建菜单");
    }
}
