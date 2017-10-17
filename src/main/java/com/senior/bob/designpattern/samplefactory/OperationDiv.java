package com.senior.bob.designpattern.samplefactory;

/**
 * Author: Bob on 2017/10/12 17:36
 * QQ:754444814
 * E-mail:754444814@qq.com
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        if(get_numberB() == 0){
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        result = get_numberA() / get_numberB();
        return result;
    }
}
