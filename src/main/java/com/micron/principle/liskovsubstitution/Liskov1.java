package com.micron.principle.liskovsubstitution;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-04 14:08:37
 * @remarks TODO
 */
public class Liskov1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fun1(3, 5));

        B b = new B();
        System.out.println(b.fun1(1, 4)); // 本意是1-4，實際上卻是1+4
        System.out.println(b.fun2(6, 9)); // 本意是6-9，實際上卻是6+9
    }
}

class A {
    public int fun1(int a, int b){
        return a - b;
    }
}

class B extends A{
    // 這裡重寫了A的fun1()，但可能無意中寫錯裡面的邏輯
    public int fun1(int a, int b){
        return a + b;
    }

    public int fun2(int a, int b){
        return fun1(a, b) + 9;
    }
}
