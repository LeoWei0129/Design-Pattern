package com.unimicron.pattern.factory.abstractfactory.pizzastore.order;

import com.unimicron.pattern.factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 11:09:37
 * @remarks TODO
 */
public class OrderPizza {
    AbsFactory factory;

    // 構造器
    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType;
        this.factory = factory;

        do {
            orderType = getType();
            // 抽象方法，由工廠子類完成
            // factory可能是北京工廠子類，也可能是倫敦工廠子類
            pizza = factory.createPizza(orderType);

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
