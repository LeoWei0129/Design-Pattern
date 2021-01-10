package com.micron.pattern.singleton.lazy;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-09 13:19:50
 * @remarks TODO
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        // 測試兩次調用Singleton1.getInstance()都會返回同一個對象實例
        System.out.println("懶漢式，線程不安全");
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {

    }

    // 提供一個公有的靜態方法，當使用到該方法時，才去創建instance實例
    // 加入了同步代碼(synchronized)，解決線程不安全問題
    // 當有一個線程在執行getInstance()的時候，別的線程不能執行getInstance()，會在後面排隊，解決instance重複new的風險
    // 即懶漢式(線程安全)
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}