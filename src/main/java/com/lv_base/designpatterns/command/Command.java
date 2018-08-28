package com.lv_base.designpatterns.command;

import com.lv_base.designpatterns.command.receive.MenuBoardScreen;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/23 11:46
 * @Version: 1.0
 * modified by:
 */
public interface Command {
    //执行命令
    public void execute();
}
