package com.lv_base.designpatterns.status;

import lombok.Data;

import javax.annotation.PostConstruct;
import java.io.Serializable;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/21 11:48
 * @Version: 1.0
 * modified by:
 */
@Data
public class UserAccount implements Serializable{
    private String userId;
    private String userName;
    private Double amt;
}
