package com.micron.principle.segregation;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-10-30 15:09:51
 * @remarks TODO
 */
public class Segregation1 {
    public static void main(String[] args) {
    }
}

interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1 {
    public void operation1() {
        System.out.println("B實現了operation1");
    }

    public void operation2() {
        System.out.println("B實現了operation2");
    }

    public void operation3() {
        System.out.println("B實現了operation3");
    }

    public void operation4() {
        System.out.println("B實現了operation4");
    }

    public void operation5() {
        System.out.println("B實現了operation5");
    }
}

class D implements Interface1 {
    public void operation1() {
        System.out.println("D實現了operation1");
    }

    public void operation2() {
        System.out.println("D實現了operation2");
    }

    public void operation3() {
        System.out.println("D實現了operation3");
    }

    public void operation4() {
        System.out.println("D實現了operation4");
    }

    public void operation5() {
        System.out.println("D實現了operation5");
    }
}

// A類通過接口Interface1依賴(使用)B類，但只會使用到1、2、3方法
class A {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface1 interface1) {
        interface1.operation2();
    }

    public void depend3(Interface1 interface1) {
        interface1.operation3();
    }
}

// C類通過接口Interface1依賴(使用)D類，但只會使用到1、4、5方法
class C {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface1 interface1) {
        interface1.operation4();
    }

    public void depend5(Interface1 interface1) {
        interface1.operation5();
    }
}