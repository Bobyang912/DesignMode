package com.senior.bob.designpattern.samplefactory;

/**
 * Author: Bob on 2017/10/12 17:36
 * QQ:754444814
 * E-mail:754444814@qq.com
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = get_numberA() * get_numberB();
        return result;
    }
}
