package com.senior.bob.designpattern.samplefactory2tostrategy;


/**
 * Author: Bob on 2017/10/13 13:54
 * QQ:754444814
 * E-mail:754444814@qq.com
 */
public class CashContext {
    CashSuper cs = null;

    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    public double contextInterface(double money){
        return cs.acceptCash(money);
    }
}
