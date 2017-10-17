package com.senior.bob.designpattern.samplefactory;

/**
 * Author: Bob on 2017/10/12 17:34
 * QQ:754444814
 * E-mail:754444814@qq.com
 */
public class Operation {
    private double _numberA = 0;
    private double _numberB = 0;
    public double get_numberA() {
        return _numberA;
    }
    public double get_numberB() {
        return _numberB;
    }
    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }
    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }
    public double getResult(){
        double result = 0;
        return result;
    }
}
