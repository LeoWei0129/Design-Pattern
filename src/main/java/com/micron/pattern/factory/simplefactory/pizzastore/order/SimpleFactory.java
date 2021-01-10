package com.micron.pattern.factory.simplefactory.pizzastore.order;

import com.micron.pattern.factory.simplefactory.pizzastore.pizza.Pizza;
import com.micron.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.micron.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.micron.pattern.factory.simplefactory.pizzastore.pizza.PepperPizza;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 11:56:44
 * @remarks TODO
 */
// 簡單工廠類
public class SimpleFactory {
    // 根據orderType，返回對應的Pizza種類
    public Pizza createPizza(String orderType){
        Pizza pizza = null;

        if (orderType.equals("Cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披薩");
        } else if (orderType.equals("Greek")) {
            pizza = new GreekPizza();
            pizza.setName("希臘披薩");
        } else if (orderType.equals("Pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披薩");
        }
        // 當有新披薩時，只需在此修改SimpleFactory類就好，不需再更動OrderPizza和PizzaStore類

        return pizza;
    }
}
