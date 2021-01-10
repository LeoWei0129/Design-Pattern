package com.micron.pattern.singleton.doublecheck;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-09 13:52:23
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
    private static volatile Singleton1 instance;

    private Singleton1() {

    }

    // 提供一個公有的靜態方法，加入雙重檢查代碼，解決線程安全問題，同時解決懶加載問題，同時保證了效率，推薦使用
    // 此方法不是在方法級別上做synchronized的，當有兩個線程a, b調用這個方法時，在一種情況下，線程a通過1-check，但還未進到下面的代
    // 碼塊，此時線程b也通過了1-check，但因為後續有synchronized機制在，線程a可以通過2-check並創建instance實例，線程b必須等線程a
    // 創建完後，才能進入synchronized代碼塊中，但就無法通過2-check了，這樣就確保線程安全
    // 以後其他線程要調用getInstance()時，會先經過1-check，只要做一次if判斷就離開if語句，然後返回instance實例即可，不需要先經過
    // synchronized，這樣就確保高效率
    public static Singleton1 getInstance() {
        if (instance == null) { // 1-check
            synchronized (Singleton1.class) {
                if (instance == null) { // 2-check
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
