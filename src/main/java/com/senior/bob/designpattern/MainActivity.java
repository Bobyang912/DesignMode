package com.senior.bob.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.senior.bob.designpattern.samplefactory.Operation;
import com.senior.bob.designpattern.samplefactory.OperationFactory;
import com.senior.bob.designpattern.samplefactory2.CashFactory;
import com.senior.bob.designpattern.samplefactory2.CashSuper;
import com.senior.bob.designpattern.samplefactory2tostrategy.CashContext;
import com.senior.bob.designpattern.samplefactory2tostrategy.CashNormal;
import com.senior.bob.designpattern.samplefactory2tostrategy.CashRebate;
import com.senior.bob.designpattern.samplefactory2tostrategy.CashReturn;
import com.senior.bob.designpattern.strategy.ConcreteStrategyB;
import com.senior.bob.designpattern.strategy.StrategyContext;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Design Mode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        sampleFactory();
//        sampleFactory2();
//        strategy();
//        sampleFactory2tostrategy();
        sampleFactoryADDstrategy();

    }

    //简单工厂
    void sampleFactory(){
        Operation oper = OperationFactory.createOperate("*");
        oper.set_numberA(3);
        oper.set_numberB(5);
        oper.getResult();

        Log.e(TAG, "sampleFactory: "+oper.getResult() );
    }

    //简单工厂
    void sampleFactory2(){
        CashSuper cs = CashFactory.createCashAccept("正常扣款");
        cs.acceptCash(100);
        Log.e(TAG, "sampleFactory2_1: "+cs.acceptCash(100));

        CashSuper cs1 = CashFactory.createCashAccept("打8折");
        cs1.acceptCash(100);
        Log.e(TAG, "sampleFactory2_2: "+cs1.acceptCash(100));

        CashSuper cs2 = CashFactory.createCashAccept("满300减100");
        cs2.acceptCash(100);
        Log.e(TAG, "sampleFactory2_3: "+cs2.acceptCash(700));
    }

    //策略模式
    void strategy(){
        StrategyContext strategyContext = new StrategyContext(new ConcreteStrategyB());
        strategyContext.contextInterface();
    }

    //简单工厂实现->策略模式实现
    void sampleFactory2tostrategy(){
        CashContext cc = new CashContext(new CashNormal());
        Log.d(TAG, "sampleFactory2tostrategy: "+cc.contextInterface(100));

        CashContext cc1 = new CashContext(new CashRebate("0.9"));
        Log.d(TAG, "sampleFactory2tostrategy: "+cc1.contextInterface(100));

        CashContext cc2 = new CashContext(new CashReturn("100","20"));
        Log.d(TAG, "sampleFactory2tostrategy: "+cc2.contextInterface(160));
    }

    //简单工厂+策略模式
    void sampleFactoryADDstrategy(){
        com.senior.bob.designpattern.strategyADDsamplefactory.CashContext cashContext = new com.senior.bob.designpattern.strategyADDsamplefactory.CashContext("正常收费");
        cashContext.contextInterface(1000);
        Log.d(TAG, "sampleFactory2tostrategy: "+cashContext.contextInterface(1000));
    }
}
