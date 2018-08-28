package com.lv_base.designpatterns.adapter;

import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description: 存在一个与现在不兼容的实现类
 * @Date: 2018/8/16 15:36
 * @Version: 1.0
 * modified by:
 */
@Service
public class V18 {
    public void miniV(){
        System.out.println("有一个18V的小电压");
    }
}
