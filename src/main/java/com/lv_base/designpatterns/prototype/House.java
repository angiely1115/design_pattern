package com.lv_base.designpatterns.prototype;

/**
 * @Author: lvrongzhuan
 * @Description:原型模式
 * 原型模式通常适用于以下场景。
 * 对象之间相同或相似，即只是个别的几个属性不同的时候。
 * 对象的创建过程比较麻烦，但复制比较简单的时候。 比如孙猴子 变很多猴子 大多数熟悉相同 只是名称不同 然而又要循环复制 这个时候就可以使用原型模式
 * clone 是不走构造方法的
 * @Date: 2018/8/17 16:33
 * @Version: 1.0
 * modified by:
 */
public class House implements Cloneable{
    private String address;
    private int age;
    private double size;

    public House() {
        System.out.println("默认无参构造方法");
    }

    public House(String address, int age, double size) {
        this.address = address;
        this.age = age;
        this.size = size;
        System.out.println("构造方法被执行");
    }

    @Override
    public House clone() throws CloneNotSupportedException {
        return (House) super.clone();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", age=" + age +
                ", size=" + size +
                '}';
    }
}
