package com.micron.pattern.prototype;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-13 11:31:36
 * @remarks TODO
 */
public class PrototypeClient {
    public static void main(String[] args) {
        System.out.println("原型模式完成對象的創建");
        Sheep sheep1 = new Sheep("Tom", 1, "White");
        Sheep sheep2 = (Sheep) sheep1.clone(); // 克隆，不再是用new的方式創建一個新對象

        System.out.println("sheep1 = " + sheep1);
        System.out.println("sheep2 = " + sheep2);
        System.out.println(sheep1 == sheep2);
    }
}
