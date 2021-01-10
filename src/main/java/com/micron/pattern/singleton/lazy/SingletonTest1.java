package com.micron.pattern.singleton.lazy;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-09 11:20:27
 * @remarks TODO
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        // 測試兩次調用Singleton1.getInstance()都會返回同一個對象實例
        System.out.println("懶漢式，線程不安全");
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {

    }

    // 提供一個公有的靜態方法，當使用到該方法時，才去創建instance實例
    // 即懶漢式(線程不安全)
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}