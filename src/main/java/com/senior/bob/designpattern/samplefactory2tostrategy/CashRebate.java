package com.senior.bob.designpattern.samplefactory2tostrategy;

/**
 * Author: Bob on 2017/10/13 11:35
 * QQ:754444814
 * E-mail:754444814@qq.com
 */
//打折收费子类
public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {//折扣
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
