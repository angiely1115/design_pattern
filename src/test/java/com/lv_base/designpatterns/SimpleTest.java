package com.lv_base.designpatterns;

import com.lv_base.designpatterns.build.ManPersionBuild;
import com.lv_base.designpatterns.build.product.Person;
import com.lv_base.designpatterns.command.Command;
import com.lv_base.designpatterns.command.invoke.CommandInvoke;
import com.lv_base.designpatterns.decorator.decorator.IO.EncryptOutPutStream;
import com.lv_base.designpatterns.memo.Chessman;
import com.lv_base.designpatterns.memo.Memento;
import com.lv_base.designpatterns.memo.MementoCaretaker;
import com.lv_base.designpatterns.prototype.House;
import org.junit.Test;

import java.io.*;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/8/17 15:12
 * @Version: 1.0
 * modified by:
 */
public class SimpleTest {
    @Test
    public void testBulid(){
        ManPersionBuild manPersionBuild = new ManPersionBuild("大大的头","强健的身躯","千禧的脚");
        Person person = manPersionBuild.buildSkin("洁白的肌肤").build();
        System.out.println(person);
    }

    @Test
    public void testProtoType() throws CloneNotSupportedException {
        House house = new House("茅草房",1000,888.88);
        System.out.println(house);
        House house1  = house.clone();
        house1.setSize(9999);
        house1.setAddress("峨眉金顶");
        System.out.println("clone huose1:"+house1);
        System.out.println("原装："+house);
        House  house2 = house1.clone();
        System.out.println("house2:"+house2);
        System.out.println("house1==house2:"+(house1==house2));
        house2.setAddress("青城山下");
        System.out.println(house2);
        System.out.println("house1:"+house1);
    }

    @Test
    public void testCommandCallBack(){
        //命令模式实现回调
        CommandInvoke commandInvoke = new CommandInvoke();
        commandInvoke.executePrint(new Command() {
            @Override
            public void execute() {
                System.out.println("执行回调");
            }
        });
    }

    @Test
    public void testMemento(){
        Chessman chessman = new Chessman("炮",1,4);
        display(chessman);
//        Memento memento = chessman.save();
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
//        mementoCaretaker.saveMemento(memento);
        chessman.setY(7);
        display(chessman);
        mementoCaretaker.saveMemento(chessman.save()); //保存状态
        chessman.setX(5);
        display(chessman);
        System.out.println("******悔棋******");
        chessman.reset(mementoCaretaker.getMenoto()); //恢复状态
        display(chessman);

    }
    public static void display(Chessman chess) {
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    @Test
    public void testDecoratorIO() throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(
                new BufferedOutputStream(
                        new EncryptOutPutStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\replay_pid2520.log"))));
        dataOutputStream.write("ccbb".getBytes());
        dataOutputStream.close();
    }
}
