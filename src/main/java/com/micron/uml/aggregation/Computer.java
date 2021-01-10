package com.unimicron.uml.aggregation;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-06 13:58:11
 * @remarks TODO
 */
public class Computer {
    private Mouse mouse; // 滑鼠可以和Computer分離
    private Monitor monitor; // 螢幕可以和Computer分離

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
