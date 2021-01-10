package com.unimicron.pattern.factory.factorymethod.pizzastore.order;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 11:18:14
 * @remarks TODO
 */
// 相當於一個客戶端，發出訂購任務
public class PizzaStore {
    public static void main(String[] args) {
        // 創建北京口味的各種披薩
        new BJOrderPizza();
        // 創建倫敦口味的各種披薩
        new LDOrderPizza();
    }
}
