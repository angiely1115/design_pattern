package com.lv_base.designpatterns.status;

import com.google.common.collect.Maps;
import com.vip.vjtools.vjkit.collection.MapUtil;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/21 11:50
 * @Version: 1.0
 * modified by:
 */
@Service
public class UserAccountDao {
    public static Map<String,UserAccount> userAccountMap = MapUtil.newHashMapWithCapacity(3,0.75f);

    @PostConstruct
    public void initUserAccount(){
        UserAccount userAccount = new UserAccount();
        userAccount.setAmt(1000d);
        userAccount.setUserId("1");
        userAccount.setUserName("小钓丝");
        userAccountMap.put(userAccount.getUserId(),userAccount);
    }
}
