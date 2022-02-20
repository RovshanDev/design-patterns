package com.company.creational.abstractFactory;

public class PhoneCompany {
    public static void main(String[] args) {
        S8Factory s8Factory = new S8Factory();
        Phone s8 = s8Factory.getPhone("S8", "3000", 4, 5);
        Note8Factory note8Factory = new Note8Factory();
        Phone note8 = note8Factory.getPhone("note8", "3500", 5, 4);

        System.out.println(s8);
        System.out.println(note8);

    }
}
