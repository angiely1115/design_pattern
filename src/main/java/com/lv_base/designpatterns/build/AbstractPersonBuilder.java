package com.lv_base.designpatterns.build;

import com.lv_base.designpatterns.build.product.Person;

/**
 * @Author: lvrongzhuan
 * @Description:构建着公共属性抽象
 * @Date: 2018/8/17 14:44
 * @Version: 1.0
 * modified by:
 */
public abstract class AbstractPersonBuilder {
   public abstract AbstractPersonBuilder buildHead(String head);

    public abstract AbstractPersonBuilder buildBody(String body);

    public abstract AbstractPersonBuilder buildFoot(String foot);

    public abstract AbstractPersonBuilder buildSkin(String skin);

    public abstract AbstractPersonBuilder buildArms(String arms);

    public abstract Person build();
}
