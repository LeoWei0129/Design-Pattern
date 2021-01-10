package com.unimicron.principle.singleresponsibility;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-10-28 11:00:56
 * @remarks TODO
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();

        roadVehicle.run("摩托車");
        airVehicle.run("飛機");
        waterVehicle.run("郵輪");
    }
}

// 方式2
// 1. 嚴格遵守單一職責原則
// 2. 但是這樣做的改動很大，需要將類分解，同時要修改客戶端
// 3. 由於此例類中只有一個方法，代碼量少且單純，所以可以這樣修改
// 4. 改進: 直接修改Vehicle類，這樣修改的代碼會比較少 => 方式3
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上運行...");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在空中運行...");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水上運行...");
    }
}

