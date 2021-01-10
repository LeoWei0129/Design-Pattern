package com.micron.uml.composition;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-06 13:58:11
 * @remarks TODO
 */
public class Computer {
    // 如果Computer對象創建，Mouse對象和Monitor對象也創建了
    // 如果Computer對象銷毀，Mouse對象和Monitor對象也銷毀了
    private Mouse mouse = new Mouse(); // 滑鼠不可以和Computer分離
    private Monitor monitor = new Monitor(); // 螢幕不可以和Computer分離

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
