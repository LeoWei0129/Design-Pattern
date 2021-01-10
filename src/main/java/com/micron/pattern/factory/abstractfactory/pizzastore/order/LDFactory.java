package com.unimicron.pattern.factory.abstractfactory.pizzastore.order;

import com.unimicron.pattern.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.unimicron.pattern.factory.abstractfactory.pizzastore.pizza.LDPepperPizza;
import com.unimicron.pattern.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 16:08:07
 * @remarks TODO
 */
public class LDFactory implements AbsFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if(orderType.equals("Cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("Pepper")){
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
