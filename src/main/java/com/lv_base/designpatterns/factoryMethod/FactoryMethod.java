package com.lv_base.designpatterns.factoryMethod;

/**
 * @Author: lvrongzhuan
 * @Description: 一个工厂方法类,工厂方法的本质是：延迟到子类来选择实现
 * @Date: 2018/8/14 18:56
 * @Version: 1.0
 * modified by:
 */
public abstract class FactoryMethod {
    public boolean option(){
        ProductApi productApi = this.getProductApi();
        return productApi.api();
    }

    /**
     * 获取一个产品实现类
     * @return
     */
    protected abstract ProductApi getProductApi();
}
