package com.lv_base.designpatterns.mediator.domain;

import lombok.Data;

/**
 * @Author: lvrongzhuan
 * @Description: 用户与部门的关联关系
 * @Date: 2018/8/15 16:50
 * @Version: 1.0
 * modified by:
 */
@Data
public class UserDepModel {
      private String userDepId;//用户部门ID

      private String userId;

      private String depId;

}
