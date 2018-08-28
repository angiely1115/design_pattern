package com.lv_base.designpatterns.observer.subject;

import com.lv_base.designpatterns.observer.AbstractObServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @Author: lvrongzhuan
 * @Description:被观察者，就是目标 如果目标发生变化，观察者做出相应的逻辑处理
 * @Date: 2018/8/20 15:06
 * @Version: 1.0
 * modified by:
 */
@Service
public class NewsPaper extends Observable{
    //观察者集合
    @Autowired
    private List<AbstractObServer> abstractObServers;

    /**
     * 模拟出版社发布新闻消息
     * @param content
     */
    public void publishNews(String content){
        //1.添加观察者
        abstractObServers.stream().forEach(e->super.addObserver((Observer) e));
        //2.设置改变
        super.setChanged();
        //3.通知观察者
        super.notifyObservers(content);//
    }

}
