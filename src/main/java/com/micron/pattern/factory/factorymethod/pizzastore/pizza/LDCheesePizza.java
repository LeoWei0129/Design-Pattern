package com.micron.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 15:08:10
 * @remarks TODO
 */
public class LDCheesePizza extends Pizza {
    public void prepare() {
        System.out.println("準備倫敦奶酪披薩的原材料");
        setName("倫敦奶酪披薩");
    }
}

