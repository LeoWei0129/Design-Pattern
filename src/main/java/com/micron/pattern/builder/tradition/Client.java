package com.micron.pattern.builder.tradition;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 13:30:11
 * @remarks TODO
 */
public class Client {
    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        Villa villa = new Villa();
        apartment.build();
        villa.build();
    }
}
