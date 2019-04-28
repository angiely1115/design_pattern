package com.lv_base.designpatterns.创建型模式.单例模式;

/**
 * @Author: lvrongzhuan
 * @Description: 通过枚举方式来实现单例，
 * @Date: 2019/4/28 21:33
 * @Version: 1.0
 * modified by:
 */
public class SingletonEnum {
    // 构造方法私有
    private SingletonEnum() {
    }

    public static SingletonEnum getInstance() {
        return SingletonFactory.INSTANCE.getSingletonEnum();
    }

    private static enum SingletonFactory {
        /**
         * 一个实例对象
         */
        INSTANCE;

        private SingletonEnum singletonEnum;
        SingletonFactory() {
           System.out.println("枚举构造方法");
           singletonEnum = new SingletonEnum();
        }
        public SingletonEnum getSingletonEnum() {
            System.out.println("getSingletonEnum 方法");
           return singletonEnum;
        }
    }

    public static void main(String[] args) {

        SingletonEnum singletonEnum1 = SingletonEnum.getInstance();
        SingletonEnum singletonEnum2 = SingletonEnum.getInstance();
        System.out.println(singletonEnum1==singletonEnum2);

    }

}
