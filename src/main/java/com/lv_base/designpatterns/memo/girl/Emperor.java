package com.lv_base.designpatterns.memo.girl;

/**
 * @Author: lvrongzhuan
 * @Description: 皇帝 发起者 就是主要业务处理
 * @Date: 2019/3/25 21:25
 * @Version: 1.0
 * modified by:
 */
public class Emperor {

    public BeautifulGirl election(BeautifulGirl beautifulGirl) {
        System.out.println("皇帝开始选的妃："+beautifulGirl);
        return beautifulGirl;
    }

    /**
     * 之前的妃子
     * @param beautifulGirl
     * @return
     */
    public BeautifulGirl beforeGirl(BeautifulGirl beautifulGirl) {
        System.out.println("皇帝后悔了 要上一个漂亮女孩："+beautifulGirl);
        return beautifulGirl;
    }
}
