package com.unimicron.pattern.singleton.staticinternal;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-09 14:23:06
 * @remarks TODO
 */
public class SingletonTest1 {
}

class Singleton1 {
    private static volatile Singleton1 instance;

    private Singleton1() {

    }

    // 寫一個靜態內部類，該類中有一個靜態屬性Singleton1
    private static class SingletonInstance {
        private static final Singleton1 INSTANCE = new Singleton1();
    }

    // 提供一個公有的靜態方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton1 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}