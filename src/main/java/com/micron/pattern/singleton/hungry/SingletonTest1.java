package com.micron.pattern.singleton.hungry;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-09 09:47:55
 * @remarks TODO
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        // 測試兩次調用Singleton1.getInstance()都會返回同一個對象實例
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

// 餓漢式(靜態方法)
class Singleton1 {
    // 1. 構造器私有化，防止外部new
    private Singleton1() {

    }

    // 2. 本類內部創建對象實例
    private final static Singleton1 instance = new Singleton1();

    // 3. 提供一個公有的靜態方法，返回實例對象
    public static Singleton1 getInstance() {
        return instance;
    }
}
