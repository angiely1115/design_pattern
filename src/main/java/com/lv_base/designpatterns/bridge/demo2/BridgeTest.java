package com.lv_base.designpatterns.bridge.demo2;

import org.junit.jupiter.api.Test;

/**
 * @Author: lvrongzhuan
 * @Description: 测试类
 * @Date: 2019/6/5 22:40
 * @Version: 1.0
 * modified by:
 */
public class BridgeTest {

    @Test
    public void testBridge() {
        RoundShape roundShape = new RoundShape();
        RedColor redColor = new RedColor();
        redColor.setShape(roundShape);
        redColor.drawShape();
        DiamondShape diamondShape = new DiamondShape();
        redColor.setShape(diamondShape);
        redColor.drawShape();
        YellowColor yellowColor = new YellowColor();
        yellowColor.setShape(roundShape);
        yellowColor.drawShape();
        yellowColor.setShape(diamondShape);
        yellowColor.drawShape();

    }
}
