package com.lv_base.designpatterns.command.receive;

import com.lv_base.designpatterns.AbstractFactory.abstractProduct.Mainboard;
import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:技嘉主板
 * @Date: 2018/8/23 11:48
 * @Version: 1.0
 * modified by:
 */
@Service
public class GiJaMainboardApiImpl implements MainBoardApi{
    @Override
    public void open() {
        System.out.println("技嘉主板开机过程:*********");
        System.out.println("接通电源");
        System.out.println("设备检测 内存 显卡等检测");
        System.out.println("装载操作系统");
        System.out.println("已经开机 你可以随意操作了");
    }

    @Override
    public void reset() {
        System.out.println("技嘉主板重启中....");
        System.out.println("技嘉主板关机...");
        this.open();
    }
}
