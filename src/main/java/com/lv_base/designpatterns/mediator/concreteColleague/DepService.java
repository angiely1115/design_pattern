package com.lv_base.designpatterns.mediator.concreteColleague;

import com.lv_base.designpatterns.mediator.concreteMediator.UserDepMediator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:部门service
 * @Date: 2018/8/15 16:41
 * @Version: 1.0
 * modified by:
 */
@Service
public class DepService {
    @Autowired
    private UserDepMediator userDepMediator;
    //根据部门ID删除部门
    public boolean deleteDepById(String depId){
        return userDepMediator.deleteDep(depId);
    }
}
