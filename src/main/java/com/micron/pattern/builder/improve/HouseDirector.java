package com.micron.pattern.builder.improve;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 16:47:54
 * @remarks 指揮者，這裡去指定製作流程並返回產品
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    // 構造器傳入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通過Setter傳入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何處理建造房子的流程，交給指揮者
    public House build() {
        this.houseBuilder.buildBasic();
        this.houseBuilder.buildWall();
        this.houseBuilder.buildRoof();

        return this.houseBuilder.getHouse();
    }
}
