package com.lv_base.designpatterns.prototype;

/**
 * @Author: lvrongzhuan
 * @Description:原型模式
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
