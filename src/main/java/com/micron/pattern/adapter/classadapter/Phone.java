package com.micron.pattern.adapter.classadapter;

/**
 * 類Phone還是依賴於接口IVoltage5V，但實際上在執行階段傳的是類VoltageAdapter
 */
public class Phone {
    /**
     * 充電
     * @param iVoltage5V 使用該接口以依賴於適配器類VoltageAdapter
     */
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("電壓為5V，可以充電");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("電壓大於5V，不能充電");
        }
    }
}
