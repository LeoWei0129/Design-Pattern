package com.micron.pattern.builder.tradition;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 13:25:09
 * @remarks TODO
 */
public class Apartment extends AbstractHouse {
    public void buildBasic() {
        System.out.println("公寓打地基");
    }

    public void buildWall() {
        System.out.println("公寓砌牆");
    }

    public void buildRoof() {
        System.out.println("公寓封頂");
    }
}
