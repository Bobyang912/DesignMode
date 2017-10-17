package com.senior.bob.designpattern.samplefactory2tostrategy;

/**
 * Author: Bob on 2017/10/13 11:34
 * QQ:754444814
 * E-mail:754444814@qq.com
 */
//正常收费子类
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
