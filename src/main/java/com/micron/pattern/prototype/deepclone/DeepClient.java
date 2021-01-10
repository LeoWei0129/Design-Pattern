package com.micron.pattern.prototype.deepclone;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 10:48:31
 * @remarks TODO
 */
public class DeepClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype deepPrototype1 = new DeepPrototype();
        deepPrototype1.name = "Ryan";
        deepPrototype1.deepCloneableTarget = new DeepCloneableTarget("小Ryan", "GG");

        // 深拷貝，引用類型的對象屬性也會有各自的存儲空間
        DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype1.clone();
        DeepPrototype deepPrototype3 = (DeepPrototype) deepPrototype1.serializableClone();

        System.out.println("deepPrototype1.name = " + deepPrototype1.name +
                "\tdeepPrototype2.deepCloneableTarget = " + deepPrototype1.deepCloneableTarget);

        System.out.println("deepPrototype2.name = " + deepPrototype2.name +
                "\tdeepPrototype2.deepCloneableTarget = " + deepPrototype2.deepCloneableTarget);

        System.out.println("deepPrototype3.name = " + deepPrototype3.name +
                "\tdeepPrototype3.deepCloneableTarget = " + deepPrototype3.deepCloneableTarget);
    }
}
