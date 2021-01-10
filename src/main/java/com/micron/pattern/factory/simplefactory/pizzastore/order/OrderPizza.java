package com.micron.pattern.factory.simplefactory.pizzastore.order;

import com.micron.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 11:09:37
 * @remarks TODO
 */
public class OrderPizza {
    SimpleFactory simpleFactory; // 定義一個簡單工廠對象
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = getType(); // 用戶輸入披薩類型
        this.simpleFactory = simpleFactory;

        do {
            pizza = this.simpleFactory.createPizza(orderType);

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
