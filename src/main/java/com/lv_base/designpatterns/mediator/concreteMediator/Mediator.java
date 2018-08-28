package com.lv_base.designpatterns.mediator.concreteMediator;

import com.lv_base.designpatterns.mediator.AbstractMediator;
import com.lv_base.designpatterns.mediator.concreteColleague.PuschaseService;
import com.lv_base.designpatterns.mediator.concreteColleague.SaleService;
import com.lv_base.designpatterns.mediator.concreteColleague.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lvrongzhuan
 * @Description:中介着的实现类
 * @Date: 2018/8/16 10:08
 * @Version: 1.0
 * modified by:
 */
@Service
public class Mediator extends AbstractMediator{
    @Autowired
    private PuschaseService puschaseService;
    @Autowired
    private StockService stockService;
    @Autowired
    private SaleService saleService;
    @Override
    public void execute(String str, Object... objects) {
        //逻辑 1 采购电脑 增加库存 需要根据销售情况来
        if ("pus".equals(str)){
                this.puschase((int)objects[0]);
        }
        //逻辑2 销售电脑 减库存 要求采购
        if("sale".equals(str)){
            this.saleComputer((int)objects[0]);
        }
        //逻辑3 清仓处理 半价销售，减库存，停止采购
        if("clear".equals(str)){
            this.clearStock();
        }

    }
    //采购加库存
    private void puschase(int number){
        int num = saleService.saleStatus();
        if(num>80){
            stockService.increase(number);
        }else{
            stockService.increase(number/2);
        }
    }

    public void saleComputer(int number){
        //减库存
        stockService.decrease(number);
        if(StockService.getComputerNumber()<number){
            //通知采购进行采购
            puschaseService.startPuschase(number);
            //增加库存
            stockService.increase(number);
        }
    }

    public void clearStock(){
        int num = StockService.getComputerNumber();
        puschaseService.stopPuschase();
        saleService.offSale(num);
        stockService.clearStock();
    }
}
