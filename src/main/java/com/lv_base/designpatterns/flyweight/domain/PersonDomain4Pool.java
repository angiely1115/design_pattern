package com.lv_base.designpatterns.flyweight.domain;

import lombok.Data;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/27 11:36
 * @Version: 1.0
 * modified by:
 */
@Data
public class PersonDomain4Pool extends PersonDomain{
    private String key;

    public PersonDomain4Pool(String key) {
        this.key = key;
    }
}
