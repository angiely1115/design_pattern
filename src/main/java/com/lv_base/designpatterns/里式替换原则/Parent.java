package com.lv_base.designpatterns.里式替换原则;

import com.google.common.collect.Maps;
import com.vip.vjtools.vjkit.collection.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lvrongzhuan
 * @Description: 里式替换原则验证
 * @Date: 2019/4/27 20:32
 * @Version: 1.0
 * modified by:
 */
public abstract class Parent {
    protected abstract Integer getAge();

    protected void params(HashMap map) {
        System.out.println("parent map:"+map);
    }

   static class Children extends Parent {
        /**
         * 重写父类的方法 返回值要比父类的返回更小或者相同
         * @return
         */
        @Override
        protected Integer getAge() {
            return 28;
        }

       /**
        * 当子类的方法重载父类的方法时候，方法的形参要比父类的方法的输入参数更加宽松。
        * 实质向调用的是父类的方法 否则会出现你没有覆写父类的方法 子类的方法被执行
        * @param map
        */
        protected void params(Map map) {
            System.out.println("children map:"+map);
        }
    }

    public static void main(String[] args) {
        Children parent = new Children();
        parent.params(Maps.newHashMap());

    }

}
