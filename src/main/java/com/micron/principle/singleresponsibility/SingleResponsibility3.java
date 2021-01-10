package com.unimicron.principle.singleresponsibility;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-10-30 10:35:33
 * @remarks TODO
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();

        roadVehicle.run("摩托車");
        airVehicle.run("飛機");
        waterVehicle.run("郵輪");
    }
}

// 方式3
// 1. 這種修改方法沒有對類做大的修改，只是增加方法
// 2. 這裡雖然沒有在類的級別上遵守單一職責原則，但是在方法級別上，仍然遵守單一職責原則
// 3. 但要注意的是，如果在類中的方法數量較少，且每個方法有不同業務邏輯，應該將這些方法分離，而不要用if-else的方式做這些業務邏輯
//    的分離，這樣會增加功能的耦合性
class Vehicle3 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上運行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在空中運行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水上運行...");
    }
}
