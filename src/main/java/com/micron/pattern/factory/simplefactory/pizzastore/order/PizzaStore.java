package com.unimicron.pattern.factory.simplefactory.pizzastore.order;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 11:18:14
 * @remarks TODO
 */
// 相當於一個客戶端，發出訂購任務
public class PizzaStore {
    public static void main(String[] args) {
        // 使用簡單工廠模式
        new OrderPizza(new SimpleFactory());
    }
}
