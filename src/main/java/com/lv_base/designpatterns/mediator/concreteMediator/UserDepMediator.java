package com.lv_base.designpatterns.mediator.concreteMediator;

import com.lv_base.designpatterns.mediator.domain.UserDepModel;
import com.vip.vjtools.vjkit.collection.ListUtil;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @Author: lvrongzhuan
 * @Description: 用户部门中介着
 * @Date: 2018/8/15 16:54
 * @Version: 1.0
 * modified by:
 */
@Service
public class UserDepMediator {
    public List<UserDepModel>  userDepModels = ListUtil.newArrayList();
    public UserDepMediator() {
        this.initData();
    }


    public boolean deleteDep(String depId){
       List<UserDepModel> temps =  ListUtil.newArrayList();
        int size = userDepModels.size();
        for (int i=0;i<size;i++){
            if(userDepModels.get(i).getDepId().equals(depId)){
                temps.add(userDepModels.get(i));
            }
        }
        userDepModels.removeAll(userDepModels);
        return true;
    }


      private void initData(){
           UserDepModel userDepModel = new UserDepModel();
          userDepModel.setUserDepId("ud1");
           userDepModel.setDepId("d1");
           userDepModel.setUserId("u1");
          userDepModels.add(userDepModel);
          userDepModel = new UserDepModel();
          userDepModel.setUserDepId("ud2");
          userDepModel.setDepId("d1");
          userDepModel.setUserId("u2");
          userDepModels.add(userDepModel);
          userDepModel = new UserDepModel();
          userDepModel.setUserDepId("ud3");
          userDepModel.setDepId("d2");
          userDepModel.setUserId("u3");
          userDepModels.add(userDepModel);
          userDepModel = new UserDepModel();
          userDepModel.setUserDepId("ud4");
          userDepModel.setDepId("d2");
          userDepModel.setUserId("u4");
          userDepModels.add(userDepModel);
          userDepModel = new UserDepModel();
          userDepModel.setUserDepId("ud5");
          userDepModel.setDepId("d2");
          userDepModel.setUserId("u5");
          userDepModels.add(userDepModel);
      }


}
