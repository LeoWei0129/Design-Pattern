package com.unimicron.pattern.factory.factorymethod.pizzastore.order;

import com.unimicron.pattern.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.unimicron.pattern.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.unimicron.pattern.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 15:27:11
 * @remarks TODO
 */
public class LDOrderPizza extends OrderPizza {
    Pizza pizza = null;

    public Pizza createPizza(String orderType) {
        if (orderType.equals("Cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("Pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}