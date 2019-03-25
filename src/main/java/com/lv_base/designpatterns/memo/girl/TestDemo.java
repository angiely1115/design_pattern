package com.lv_base.designpatterns.memo.girl;

import org.junit.jupiter.api.Test;

/**
 * @Author: lvrongzhuan
 * @Description: 备忘录模式测试类
 * @Date: 2019/3/25 21:39
 * @Version: 1.0
 * modified by:
 */
public class TestDemo {
    /**
     * 测试下皇帝选妃后悔的场景
     */
    @Test
    public void testMemento() {
        BeautifulGirl beautifulGirl = new BeautifulGirl("彭雪梅",26,"湖南长沙");
        Emperor emperor = new Emperor();
        // 皇帝开始选妃
        beautifulGirl = emperor.election(beautifulGirl);
        Girls girls = new Girls();
        // 后管记录下皇帝选的妃子
        girls.saveGirl(beautifulGirl);
        beautifulGirl = new BeautifulGirl("彭小小",18,"云南昆明");
        beautifulGirl = emperor.election(beautifulGirl);
        //皇帝还是想要第一个妃子
        emperor.beforeGirl(girls.getGirl());
    }
}
