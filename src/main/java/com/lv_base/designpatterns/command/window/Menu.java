package com.lv_base.designpatterns.command.window;

import com.lv_base.designpatterns.command.invoke.MenuItem;
import com.vip.vjtools.vjkit.collection.ListUtil;

import java.util.List;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/23 16:00
 * @Version: 1.0
 * modified by:
 */
public class Menu {
    public static List<MenuItem> menuItems = ListUtil.newArrayList();
    //添加菜单选项
    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }
}
