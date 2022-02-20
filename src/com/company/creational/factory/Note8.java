package com.company.creational.factory;

public class Note8 implements Phone {
    private String model;
    private String battery;
    int width;
    int length;

    public Note8(String model, String battery, int width, int length) {
        this.model = model;
        this.battery = battery;
        this.width = width;
        this.length = length;
    }

    public String getModel() {
        return model;
    }

    public String getBattery() {
        return battery;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Note8{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public String model() {
        return null;
    }

    @Override
    public String battery() {
        return null;
    }

    @Override
    public int width() {
        return 0;
    }

    @Override
    public int length() {
        return 0;
    }
}
