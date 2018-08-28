package com.lv_base.designpatterns.build.product;

import lombok.Data;

/**
 * @Author: lvrongzhuan
 * @Description:一个需要创建的产品定义
 * @Date: 2018/8/17 14:46
 * @Version: 1.0
 * modified by:
 */
@Data
public class Person {
    //必选的
    private String head;
    private String body;
    private String foot;

    //不是必须的
    private String skin;

    private String  arms;

     public Person(String head,String body,String foot){
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

}
