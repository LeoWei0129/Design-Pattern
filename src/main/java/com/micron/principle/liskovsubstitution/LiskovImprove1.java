package com.unimicron.principle.liskovsubstitution;

import jdk.nashorn.internal.ir.CallNode;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-04 14:16:14
 * @remarks TODO
 */
public class LiskovImprove1 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.fun1(3, 5));

        D d = new D();
        // 因為D類不會繼承C類，所以調用者不會再認為func1是求減法
        // 可以很明確地知道fun1就是求加法以及fun3是用來求減法
        System.out.println(d.fun1(1, 4));
        System.out.println(d.fun2(6, 9));
        // 使用組合仍然可以使用A類的方法
        System.out.println(d.fun3(5, 2));
    }
}

// 創建一個更加基礎的類
class Base{
    // 把更加基礎的成員和方法放到Base類
}

class C extends Base{
    public int fun1(int a, int b){
        return a - b;
    }
}

class D extends Base{
    // 如果D要使用C的方法，使用組合關係
    C c = new C();

    // 這裡重寫了C的fun1()，但可能無意中寫錯裡面的邏輯
    public int fun1(int a, int b){
        return a + b;
    }

    public int fun2(int a, int b){
        return fun1(a, b) + 9;
    }

    // 這裡仍想使用類C的方法
    public int fun3(int a, int b){
        return c.fun1(a, b);
    }
}
