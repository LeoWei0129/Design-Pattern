package com.micron.pattern.builder.improve;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 16:24:34
 * @remarks 抽象的建造者
 */
public abstract class HouseBuilder {
    private House house = new House();

    // 將建造的流程寫好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoof();

    // 建造好房子後，將房子返回
    public House getHouse(){
        return house;
    }
}
