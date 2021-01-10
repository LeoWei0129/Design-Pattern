package com.unimicron.pattern.factory.abstractfactory.pizzastore.pizza;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 15:07:55
 * @remarks TODO
 */
public class BJPepperPizza extends Pizza {
    public void prepare() {
        System.out.println("準備北京胡椒披薩的原材料");
        setName("北京胡椒披薩");
    }
}
