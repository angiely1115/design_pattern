package com.lv_base.designpatterns.observer;

import org.springframework.stereotype.Component;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/20 17:00
 * @Version: 1.0
 * modified by:
 */
@Component
public class Watcher1Observer extends WatcherObserver{
    @Override
    public String watcherName() {
        return "检测员";
    }

    @Override
    public int watcherLevel() {
        return 0;
    }

    @Override
    public Object watch0(Object object) {
        return object;
    }
}
