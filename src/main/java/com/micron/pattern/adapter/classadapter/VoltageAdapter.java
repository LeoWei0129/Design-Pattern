package com.micron.pattern.adapter.classadapter;

/**
 * 適配器類
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    /**
     * 實現適配邏輯
     * @return
     */
    public int output5V() {
        int srcV = output220V(); // 獲取220V電壓
        int dstV = srcV / 44; // 轉成5V
        return dstV;
    }
}
