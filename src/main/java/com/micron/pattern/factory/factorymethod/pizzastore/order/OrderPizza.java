package com.micron.pattern.factory.factorymethod.pizzastore.order;

import com.micron.pattern.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 11:09:37
 * @remarks TODO
 */
// OrderPizza類在此處充當工廠的角色，BJOrderPizza和LDOrderPizza是該工廠的子類，將createPizza()放到工廠子類去實現
public abstract class OrderPizza {
    // 定義一個抽象方法createPizza，讓各個工廠子類自己去實現
    public abstract Pizza createPizza(String orderType);

    // 構造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;

        do {
            orderType = getType();
            pizza = createPizza(orderType); // 抽象方法，由工廠子類完成

            if (pizza != null) {
                System.out.println("披薩訂購成功");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("披薩訂購失敗");
                break;
            }
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
