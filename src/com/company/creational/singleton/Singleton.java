package com.company.creational.singleton;

public class Singleton {
    private static Singleton singleton;
    public static int count = 0;

    private Singleton() {
        System.out.println("I was created...");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }


        count++;
        System.out.println(count);
        return singleton;
    }
}
