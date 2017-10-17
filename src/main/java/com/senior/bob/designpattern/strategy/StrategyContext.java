package com.senior.bob.designpattern.strategy;

/**
 * Author: Bob on 2017/10/13 13:44
 * QQ:754444814
 * E-mail:754444814@qq.com
 */
public class StrategyContext {
    Strategy strategy = null;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.AlgorithmInterface();
    }
}
