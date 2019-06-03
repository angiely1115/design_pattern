package com.lv_base.designpatterns;
import com.lv_base.designpatterns.strategy.BankPaymentRequestDto;
import com.lv_base.designpatterns.strategy.PaymentEnum;
import com.lv_base.designpatterns.strategy.PaymentEnum.PaymentTypeEnum;

import com.lv_base.designpatterns.AbstractFactory.concreteFactory.ComputerFactoryA;
import com.lv_base.designpatterns.AbstractFactory.concreteFactory.ComputerFactoryB;
import com.lv_base.designpatterns.adapter.AdaperVoltage;
import com.lv_base.designpatterns.bridge.CommonMessage;
import com.lv_base.designpatterns.bridge.ImportantMessage;
import com.lv_base.designpatterns.command.MenuCommand;
import com.lv_base.designpatterns.command.MenuCreateCommand;
import com.lv_base.designpatterns.command.MenuEditCommand;
import com.lv_base.designpatterns.command.MenuOpenCommand;
import com.lv_base.designpatterns.command.invoke.Box;
import com.lv_base.designpatterns.command.invoke.MenuItem;
import com.lv_base.designpatterns.command.window.Menu;
import com.lv_base.designpatterns.decorator.PhoneX;
import com.lv_base.designpatterns.decorator.ViVoPhone;
import com.lv_base.designpatterns.dutyChain.NoticeDomain;
import com.lv_base.designpatterns.dutyChain.PushNoticeHandle;
import com.lv_base.designpatterns.dutyChain.SmsNoticeHandle;
import com.lv_base.designpatterns.dutyChain.WechatNoticeHandle;
import com.lv_base.designpatterns.facade.Facade;
import com.lv_base.designpatterns.factoryMethod.FactoryMethodA;
import com.lv_base.designpatterns.factoryMethod.FactoryMethodB;
import com.lv_base.designpatterns.mediator.concreteColleague.CDdriver;
import com.lv_base.designpatterns.mediator.concreteColleague.PuschaseService;
import com.lv_base.designpatterns.mediator.concreteColleague.SaleService;
import com.lv_base.designpatterns.mediator.concreteColleague.StockService;
import com.lv_base.designpatterns.observer.subject.NewsPaper;
import com.lv_base.designpatterns.observer.subject.WaterSubject;
import com.lv_base.designpatterns.simpleFactory.SimpleFactory;
import com.lv_base.designpatterns.status.AccountContext;
import com.lv_base.designpatterns.strategy.PaymentContext;
import com.lv_base.designpatterns.strategy.PaymentRequestDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternApplicationTests {
    @Autowired
    private SimpleFactory simpleFactory;
    @Autowired
    private FactoryMethodA factoryMethodA;
    @Autowired
    private FactoryMethodB factoryMethodB;
    @Autowired
    private ComputerFactoryA computerFactoryA;
    @Autowired
    private ComputerFactoryB computerFactoryB;
    @Autowired
    private Facade facade;
    @Autowired
    private CDdriver cDdriver;
    @Autowired
    private SaleService saleService;
    @Autowired
    private StockService stockService;
    @Autowired
    private PuschaseService puschaseService;
    @Autowired
    private AdaperVoltage adaperVoltage;
    @Autowired
    private CommonMessage commonMessage;
    @Autowired
    private ImportantMessage importantMessage;
    @Autowired
    private NewsPaper newsPaper;
    @Autowired
    private WaterSubject waterSubject;
    @Autowired
    private AccountContext accountContext;
    @Autowired
    private Box box;
    @Autowired
    private MenuCreateCommand menuCreateCommand;
    @Autowired
    private MenuOpenCommand menuOpenCommand;
    @Autowired
    private MenuEditCommand menuEditCommand;
    @Autowired
    private ViVoPhone viVoPhone;
    @Autowired
    private PhoneX phoneX;
    @Autowired
    private WechatNoticeHandle wechatNoticeHandle;
    @Autowired
    private SmsNoticeHandle smsNoticeHandle;
    @Autowired
    private PushNoticeHandle pushNoticeHandle;
    @Autowired
    private PaymentContext paymentContext;
    @Test
    public void testSimpleFactory() {
        simpleFactory.getApiProduct("B").hello();
    }

    @Test
    public void testFactoryMethod() {
        factoryMethodA.option();
        factoryMethodB.option();
    }

    /**
     * 抽象工厂模式
     */
    @Test
    public void testAbstractFactory() {
        computerFactoryA.buildComputer();
        computerFactoryB.buildComputer();
    }

    @Test
    public void testFacade() {
        facade.operation();
    }

    @Test
    public void testMediator() {
        cDdriver.readCD();
    }

    @Test
    public void testMediator2() {
        //采购电脑
        puschaseService.startPuschase(100);
        System.out.println("**************");
        //销售
//        saleService.saleComputer(100);
        System.out.println("**************");
        //清仓
        stockService.clear();
    }

    @Test
    public void testAdapter(){
        adaperVoltage.request();
    }

    @Test
    public void testBridge(){
        commonMessage.sendMessage("SMS","王子","来喝酒");
        importantMessage.sendMessage("Email","王子","来喝酒了");
    }

    @Test
    public void testObserver(){
        newsPaper.publishNews("赵雅芝不老神话");
    }

    @Test
    public void testObserver2(){
        waterSubject.notifyObservers(0);
        waterSubject.notifyObservers(1);
        waterSubject.notifyObservers(2);
    }

    @Test
    public void testStatus(){
        accountContext.deposit("1",1000);
        accountContext.withdraw("1",4000);
        accountContext.deposit("1",1000);
        accountContext.withdraw("1",1000);
    }

    @Test
    public void testCommand01(){
        box.open();
        box.reset();
    }

    @Test
    public void testCommand02(){
        Menu menu = new Menu();
        MenuItem menuItem = new MenuItem(menuCreateCommand);
        menu.addMenuItem(menuItem);
        menuItem = new MenuItem(menuOpenCommand);
        menu.addMenuItem(menuItem);
        menuItem = new MenuItem(menuEditCommand);
        menu.addMenuItem(menuItem);
        Menu.menuItems.stream().forEach((m)->m.click());
    }

    @Test
    public void testDecorator(){
        viVoPhone.call();
        phoneX.call();
    }

    @Test
    public void testDutyChain(){
        NoticeDomain noticeDomain = new NoticeDomain();
        noticeDomain.setRecipient("白素贞");
        noticeDomain.setContent("娘子回来做饭啦");
        wechatNoticeHandle.setNoticeHandler(smsNoticeHandle);
        smsNoticeHandle.setNoticeHandler(pushNoticeHandle);
//        pushNoticeHandle.setNoticeHandler(wechatNoticeHandle);出现了死循环 调用
        System.out.println(wechatNoticeHandle.noticeHandler(noticeDomain));
    }

    /**
     * 策略模式
     */
    @Test
    public void testStrategy() {
        PaymentRequestDto paymentRequestDto = new PaymentRequestDto();
        paymentRequestDto.setAmount(1000L);
        paymentRequestDto.setAccount("522516230@qq.com");
        paymentRequestDto.setPaymentTypeEnum(PaymentTypeEnum.PAYMENT_TYPE_ALI_ENUM);
        paymentContext.invokePayment(paymentRequestDto);
        paymentRequestDto.setAccount("18811879608@qq.com");
        paymentRequestDto.setPaymentTypeEnum(PaymentTypeEnum.PAYMENT_TYPE_WEIXIN_ENUM);
        paymentContext.invokePayment(paymentRequestDto);
        paymentRequestDto = new BankPaymentRequestDto();
        paymentRequestDto.setAmount(1000L);
        paymentRequestDto.setAccount("522516230@qq.com");
        paymentRequestDto.setPaymentTypeEnum(PaymentTypeEnum.PAYMENT_TYPE_BANK_ENUM);
        ((BankPaymentRequestDto) paymentRequestDto).setBankName("中国银行");
        paymentContext.invokePayment(paymentRequestDto);
    }
}
