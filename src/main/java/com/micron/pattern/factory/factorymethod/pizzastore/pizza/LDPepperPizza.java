package com.unimicron.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 15:08:41
 * @remarks TODO
 */
public class LDPepperPizza extends Pizza {
    public void prepare() {
        System.out.println("準備倫敦胡椒披薩的原材料");
        setName("倫敦胡椒披薩");
    }
}
