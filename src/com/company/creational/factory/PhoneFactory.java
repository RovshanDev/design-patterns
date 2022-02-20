package com.company.creational.factory;

public class PhoneFactory {

    public static Phone getPhone(String model, String battery, int width, int length) {
        Phone phone;
        if ("S8".equalsIgnoreCase(model)) {
            phone = new S8(model, battery, width, length);
        } else if ("Note8".equalsIgnoreCase(model)) {
            phone = new Note8(model, battery, width, length);
        } else {
            throw new RuntimeException("Value is not found");
        }


        return phone;
    }
}
