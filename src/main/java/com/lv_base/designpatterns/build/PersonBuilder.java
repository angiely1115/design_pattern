package com.lv_base.designpatterns.build;

import com.lv_base.designpatterns.build.product.Person;

/**
 * @Author: lvrongzhuan
 * @Description:构建着公共属性抽象
 * @Date: 2018/8/17 14:44
 * @Version: 1.0
 * modified by:
 */
public abstract class PersonBuilder {
   public abstract PersonBuilder buildHead(String head);

    public abstract PersonBuilder buildBody(String body);

    public abstract PersonBuilder buildFoot(String foot);

    public abstract PersonBuilder buildSkin(String skin);

    public abstract PersonBuilder buildArms(String arms);

    public abstract Person build();
}
