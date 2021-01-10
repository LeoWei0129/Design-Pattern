package com.micron.pattern.adapter.objectadapter;

/**
 * 適配器類
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V; // 關聯關係 - 聚合，符合合成復用原則

    /**
     * 通過構造器，傳入一個Voltage220V實例
     *
     * @param voltage220V
     */
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    /**
     * 實現適配邏輯
     * 無法如class adapter的作法，可以直接調用output220V，因為沒有繼承Voltage220V類了
     *
     * @return
     */
    public int output5V() {
        int dstV = 0;

        // 檢查voltage220V是否已經關聯上了
        if(voltage220V != null){
            int srcV = voltage220V.output220V(); // 獲取220V電壓
            System.out.println("使用對象適配器，進行適配~~");
            dstV = srcV / 44;
            System.out.println("適配完成，輸出電壓 = " + dstV);
        }

        return dstV;
    }
}
