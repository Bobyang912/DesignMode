package com.senior.bob.designpattern.samplefactory;

/**
 * Author: Bob on 2017/10/12 17:30
 * QQ:754444814
 * E-mail:754444814@qq.com
 */

/**
 * 简单工厂模式
 */
public class OperationFactory {
    public static Operation createOperate(String operate)
    {
        Operation oper = null;
        switch (operate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;

        }
        return oper;
    }
}
