package com.micron.pattern.builder.improve;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 16:53:20
 * @remarks TODO
 */
public class Client {
    public static void main(String[] args) {
        // 蓋公寓
        Apartment apartment = new Apartment();
        // 準備創建房子的指揮者
        HouseDirector houseDirector = new HouseDirector(apartment);
        // 完成蓋房子，返回產品(房子)
        House house = houseDirector.build();

        // 蓋別墅
        Villa villa = new Villa();
        // 重製建造者
        houseDirector.setHouseBuilder(villa);
        // 完成蓋房子，返回產品(房子)
        houseDirector.build();
    }
}
