package com.unimicron.pattern.factory.abstractfactory.pizzastore.order;

import com.unimicron.pattern.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 16:06:24
 * @remarks TODO
 */
// 一個抽象工廠模式的抽象層(接口)
public interface AbsFactory {
    // 讓工廠子類來實現此抽象方法
    public Pizza createPizza(String orderType);
}
