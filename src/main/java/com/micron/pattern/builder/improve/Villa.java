package com.unimicron.pattern.builder.improve;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 16:39:54
 * @remarks 具體建造者(別墅)
 */
public class Villa extends HouseBuilder {
    public void buildBasic() {
        System.out.println("別墅打地基100公尺");
    }

    public void buildWall() {
        System.out.println("別墅砌牆30公分");
    }

    public void buildRoof() {
        System.out.println("別墅封頂30cm");
    }
}