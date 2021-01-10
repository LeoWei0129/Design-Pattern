package com.unimicron.pattern.builder.tradition;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 13:21:31
 * @remarks TODO
 */
public abstract class AbstractHouse {
    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void buildRoof();

    public void build() {
        buildBasic();
        buildWall();
        buildRoof();
    }
}
