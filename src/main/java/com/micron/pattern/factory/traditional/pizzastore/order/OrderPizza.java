package com.unimicron.pattern.factory.traditional.pizzastore.order;

import com.unimicron.pattern.factory.traditional.pizzastore.pizza.CheesePizza;
import com.unimicron.pattern.factory.traditional.pizzastore.pizza.GreekPizza;
import com.unimicron.pattern.factory.traditional.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 11:09:37
 * @remarks TODO
 */
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType = ""; // 訂購披薩的類型

        do {
            orderType = getType();
            if (orderType.equals("Cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披薩");
            } else if (orderType.equals("Greek")) {
                pizza = new GreekPizza();
                pizza.setName("希臘披薩");
            } else {
                break;
            }
            // 輸出披薩製作過程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    // 寫一個方法，可以動態獲取客戶訂購的披薩種類
    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("請輸入披薩種類");
            String type = bufferedReader.readLine();
            return type;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
