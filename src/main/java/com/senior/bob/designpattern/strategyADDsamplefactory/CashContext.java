package com.senior.bob.designpattern.strategyADDsamplefactory;


/**
 * Author: Bob on 2017/10/13 13:54
 * QQ:754444814
 * E-mail:754444814@qq.com
 */
public class CashContext {
    CashSuper cs = null;

    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "打8折":
                cs = new CashRebate("0.8");
                break;
            case "满300减100":
                cs = new CashReturn("300","100");
                break;
        }
    }

    public double contextInterface(double money){
        return cs.acceptCash(money);
    }
}
