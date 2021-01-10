package com.micron.pattern.factory.abstractfactory.pizzastore.order;

import com.micron.pattern.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.micron.pattern.factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import com.micron.pattern.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 16:08:00
 * @remarks TODO
 */
public class BJFactory implements AbsFactory{
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if(orderType.equals("Cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("Pepper")){
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
