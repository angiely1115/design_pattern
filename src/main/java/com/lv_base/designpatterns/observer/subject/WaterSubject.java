package com.lv_base.designpatterns.observer.subject;

import com.lv_base.designpatterns.observer.WatcherObserver;
import com.vip.vjtools.vjkit.collection.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lvrongzhuan
 * @Description:被观察者
 * @Date: 2018/8/20 16:16
 * @Version: 1.0
 * modified by:
 */
@Service
public class WaterSubject {
    @Autowired
    private List<WatcherObserver> watcherObservers;

    //通知观察者
    public void notifyObservers(int level){
        if (ListUtil.isEmpty(watcherObservers)) {
            return;
        }
        int size = watcherObservers.size();
        WatcherObserver watcherObserver;
        for(int i=0;i<size;i++){
            watcherObserver = watcherObservers.get(i);
            if (level==0&&watcherObserver.watcherLevel()==0){
                watcherObserver.watch("当前水质良好");
            }if(level==1&&watcherObserver.watcherLevel()<=1){
                watcherObserver.watch("当前水质轻度污染");
            }if(level==2&&watcherObserver.watcherLevel()<=2){
                watcherObserver.watch("当前水质重度污染");
            }

        }
    }


}
