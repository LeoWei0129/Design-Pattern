package com.micron.principle.singleresponsibility;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-10-28 10:50:40
 * @remarks TODO
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托車");
        vehicle.run("郵輪");
        vehicle.run("飛機");
    }
}

// 交通工具類
// 方式1
// 1. 在方式1的run()中，違反了單一職責原則
// 2. 解決的方案很簡單，根據交通工具的運行方式不同，分解成不同類即可
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上運行...");
    }
}
