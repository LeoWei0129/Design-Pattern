package com.micron.pattern.singleton.enumdemo;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-09 14:56:53
 * @remarks TODO
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.INSTANCE;
        Singleton1 singleton2 = Singleton1.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

enum Singleton1{
    INSTANCE;
    public void display(){
        System.out.println("ok~");
    }
}