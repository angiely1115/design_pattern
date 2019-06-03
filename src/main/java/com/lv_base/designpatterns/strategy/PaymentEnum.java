package com.lv_base.designpatterns.strategy;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2019/6/3 21:56
 * @Version: 1.0
 * modified by:
 */
public interface PaymentEnum {

    enum PaymentTypeEnum {
        /**
         * 支付类型
         */
        PAYMENT_TYPE_ALI_ENUM("aliPayment", "支付宝支付"),
        PAYMENT_TYPE_WEIXIN_ENUM("weiXinPayment", "微信支付"),
        PAYMENT_TYPE_BANK_ENUM("bankPayment", "银行卡支付"),
        ;
        private String type;
        private String desc;

        PaymentTypeEnum(String type, String desc) {
            this.type = type;
            this.desc = desc;
        }

        public String getType() {
            return type;
        }

        public String getDesc() {
            return desc;
        }
    }
}
