package com.unimicron.pattern.builder.improve;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 16:38:22
 * @remarks 具體建造者(公寓)
 */
public class Apartment extends HouseBuilder {
    public void buildBasic() {
        System.out.println("公寓打地基5公尺");
    }

    public void buildWall() {
        System.out.println("公寓砌牆10公分");
    }

    public void buildRoof() {
        System.out.println("公寓封頂3cm");
    }
}
