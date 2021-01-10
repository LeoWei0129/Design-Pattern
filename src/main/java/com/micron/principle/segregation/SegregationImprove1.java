package com.micron.principle.segregation;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-03 15:13:07
 * @remarks TODO
 */
public class SegregationImprove1 {
    public static void main(String[] args) {
        AA a = new AA();
        a.depend1(new BB()); // AA類通過接口去依賴(使用)DD類
        a.depend2(new BB());
        a.depend3(new BB());

        CC c = new CC();
        c.depend1(new DD()); // CC類通過接口去依賴(使用)DD類
        c.depend4(new DD());
        c.depend5(new DD());
    }
}

interface Interface11 {
    void operation1();
}

interface Interface12{
    void operation2();
    void operation3();
}

interface Interface13{
    void operation4();
    void operation5();
}

class BB implements Interface11, Interface12 {
    public void operation1() {
        System.out.println("B實現了operation1");
    }

    public void operation2() {
        System.out.println("B實現了operation2");
    }

    public void operation3() {
        System.out.println("B實現了operation3");
    }
}

class DD implements Interface11, Interface13 {
    public void operation1() {
        System.out.println("D實現了operation1");
    }

    public void operation4() {
        System.out.println("D實現了operation4");
    }

    public void operation5() {
        System.out.println("D實現了operation5");
    }
}

// AA類通過接口Interface11, Interface12依賴(使用)B類，但只會使用到1、2、3方法
class AA {
    public void depend1(Interface11 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface12 interface1) {
        interface1.operation2();
    }

    public void depend3(Interface12 interface1) {
        interface1.operation3();
    }
}

// CC類通過接口Interface11, Interface13依賴(使用)D類，但只會使用到1、4、5方法
class CC {
    public void depend1(Interface11 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface13 interface1) {
        interface1.operation4();
    }

    public void depend5(Interface13 interface1) {
        interface1.operation5();
    }
}
