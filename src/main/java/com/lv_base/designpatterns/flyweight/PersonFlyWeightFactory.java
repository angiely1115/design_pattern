package com.lv_base.designpatterns.flyweight;

import com.google.common.collect.Maps;
import com.lv_base.designpatterns.flyweight.domain.PersonDomain;
import com.lv_base.designpatterns.flyweight.domain.PersonDomain4Pool;
import com.vip.vjtools.vjkit.collection.MapUtil;

import java.util.Map;

/**
 * @Author: lvrongzhuan
 * @Description:享元工厂类 暂时还没有想到实际应用场景 分离出内部状态和外部状态 内部状态是不变的可以共享的
 * 减少系统的对象，降低系统内存的消耗 享元模式主要针对那些使用比较频繁，而种类又不是很多的业务
 * @Date: 2018/8/27 11:11
 * @Version: 1.0
 * modified by:
 */
public class PersonFlyWeightFactory {
    public static Map<String,PersonDomain> personDomainMap = MapUtil.newHashMap();

    public static PersonDomain getPersonDomain(String key){
        if(personDomainMap.containsKey(key)){
            return personDomainMap.get(key);
        }else{
            PersonDomain4Pool personDomain4Pool = new PersonDomain4Pool(key);
            personDomainMap.put(key,personDomain4Pool);
            return personDomain4Pool;
        }
    }
}
