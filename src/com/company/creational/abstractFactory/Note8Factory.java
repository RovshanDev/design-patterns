package com.company.creational.abstractFactory;

public class Note8Factory implements PhoneFactory {
    @Override
    public Phone getPhone(String model, String battery, int width, int length) {
        return new Note8(model, battery, width, length);
    }
}
