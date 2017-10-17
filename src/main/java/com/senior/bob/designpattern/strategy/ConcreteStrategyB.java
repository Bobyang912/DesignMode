package com.senior.bob.designpattern.strategy;

import android.util.Log;

/**
 * Author: Bob on 2017/10/13 13:40
 * QQ:754444814
 * E-mail:754444814@qq.com
 */
//具体算法A
public class ConcreteStrategyB extends Strategy {
    //算法A实现方法
    @Override
    public void AlgorithmInterface() {
        Log.i("TAG", "AlgorithmInterface: 算法B实现");
    }
}
