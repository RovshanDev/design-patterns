package com.company.creational.factory;

import com.company.creational.factory.Phone;
import com.company.creational.factory.PhoneFactory;

public class PhoneCompany {
    public static void main(String[] args) {
        Phone s8 = PhoneFactory.getPhone("S8", "3000", 4, 8);
        Phone note8 = PhoneFactory.getPhone("Note8", "4000", 6, 8);
        System.out.println("Parameters for S8");
        System.out.println(s8);
        System.out.println("Parameters for Note8");
        System.out.println(note8);
    }
}
