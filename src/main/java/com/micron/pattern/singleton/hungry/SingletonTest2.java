package com.unimicron.pattern.singleton.hungry;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-09 11:02:25
 * @remarks TODO
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        // 測試兩次調用Singleton1.getInstance()都會返回同一個對象實例
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

// 餓漢式(靜態方法)
class Singleton2 {
    // 1. 構造器私有化，防止外部new
    private Singleton2() {

    }

    // 2. 本類內部創建對象實例
    private static Singleton2 instance;

    // 3. 在靜態代碼塊中，創建實例對象
    static {
        instance = new Singleton2();
    }

    // 4. 提供一個公有的靜態方法，返回實例對象
    public static Singleton2 getInstance() {
        return instance;
    }
}