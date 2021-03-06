package com.senior.bob.designpattern.samplefactory2;

/**
 * Author: Bob on 2017/10/13 11:38
 * QQ:754444814
 * E-mail:754444814@qq.com
 */
//返利收费子类
public class CashReturn extends CashSuper {
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition){
//            result = money - moneyReturn;
            result = money - Math.floor(money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}
