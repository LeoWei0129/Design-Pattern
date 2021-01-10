package com.unimicron.pattern.factory.abstractfactory.pizzastore.pizza;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 15:06:25
 * @remarks TODO
 */
public class BJCheesePizza extends Pizza {
    public void prepare() {
        System.out.println("準備北京奶酪披薩的原材料");
        setName("北京奶酪披薩");
    }
}
