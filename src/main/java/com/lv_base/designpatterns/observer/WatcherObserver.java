package com.lv_base.designpatterns.observer;

/**
 * @Author: lvrongzhuan
 * @Description:自定义一个观察者接口
 * @Date: 2018/8/20 16:13
 * @Version: 1.0
 * modified by:
 */
public abstract class  WatcherObserver {
    public abstract String watcherName();
    //观察者级别
    public abstract int watcherLevel();
    //观察者业务逻辑处理
    public abstract Object watch0(Object object);

    public void watch(Object object){
        System.out.println("观察员:"+this.watcherName()+"获取水质监控消息：消息内容："+this.watch0(object)+"当前水质污染级别:"+watcherLevel());
    }
}
