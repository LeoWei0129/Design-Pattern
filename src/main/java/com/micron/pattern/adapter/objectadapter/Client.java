package com.micron.pattern.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("~~對象適配器模式~~");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
