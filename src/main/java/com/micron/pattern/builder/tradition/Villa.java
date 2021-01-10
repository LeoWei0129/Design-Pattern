package com.unimicron.pattern.builder.tradition;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 13:25:16
 * @remarks TODO
 */
public class Villa extends AbstractHouse {
    public void buildBasic() {
        System.out.println("別墅打地基");
    }

    public void buildWall() {
        System.out.println("別墅砌牆");
    }

    public void buildRoof() {
        System.out.println("別墅封頂");
    }
}
