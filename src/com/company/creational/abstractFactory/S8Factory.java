package com.company.creational.abstractFactory;

public class S8Factory implements PhoneFactory {
    @Override
    public Phone getPhone(String model, String battery, int width, int length) {
        return new S8(model, battery, width, length);
    }
}
