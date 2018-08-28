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
public class Watcher2Observer extends WatcherObserver{
    @Override
    public String watcherName() {
        return "预警员";
    }

    @Override
    public int watcherLevel() {
        return 1;
    }

    @Override
    public Object watch0(Object object) {
        return object;
    }
}
