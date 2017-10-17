package com.senior.bob.designpattern.samplefactory2;

/**
 * Author: Bob on 2017/10/13 11:44
 * QQ:754444814
 * E-mail:754444814@qq.com
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type){
        CashSuper cs = null;
        switch (type){
            case "正常扣款":
                cs = new CashNormal();
                break;
            case "打8折":
                cs = new CashRebate("0.8");
                break;
            case "满300减100":
                cs = new CashReturn("300","100");
                break;
        }

        return cs;
    }
}
