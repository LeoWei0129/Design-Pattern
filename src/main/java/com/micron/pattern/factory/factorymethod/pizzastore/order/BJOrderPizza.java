package com.micron.pattern.factory.factorymethod.pizzastore.order;

import com.micron.pattern.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.micron.pattern.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.micron.pattern.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 15:22:28
 * @remarks TODO
 */
public class BJOrderPizza extends OrderPizza {
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("Cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("Pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
