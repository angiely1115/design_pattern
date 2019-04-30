package com.lv_base.designpatterns.build;

import com.lv_base.designpatterns.build.product.Person;
import lombok.Data;

/**
 * @Author: lvrongzhuan
 * @Description:创建者模式的本质：分离整体构建算法，和部件构建 主要是概念是组装一个产品
 * @Date: 2018/8/17 14:54
 * @Version: 1.0
 * modified by:
 */
@Data
public class ManPersionBuild extends AbstractPersonBuilder {
    Person person;
    private String head;
    private String body;
    private String foot;

    public ManPersionBuild(String head, String body, String foot) {
        this.head = head;
        this.body = body;
        this.foot = foot;
        person = new Person(head,body,foot);
    }

    @Override
    public AbstractPersonBuilder buildHead(String head) {
        return this;
    }

    @Override
    public AbstractPersonBuilder buildBody(String body) {
        return this;
    }

    @Override
    public AbstractPersonBuilder buildFoot(String foot) {
        return this;
    }

    @Override
    public AbstractPersonBuilder buildSkin(String skin) {
        person.setSkin(skin);
        return this;
    }

    @Override
    public AbstractPersonBuilder buildArms(String arms) {
        person.setArms(arms);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
