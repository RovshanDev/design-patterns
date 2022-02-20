package com.company.creational.builder;

public class Agent {
    public static void main(String[] args) {

        House house1 = new House();
        house1.setRegion("Abseron");
        house1.setCity("Baki");
        house1.setStreet("Ebilov");
        house1.setRoomNumber(4);
        house1.setApartmentYear(2010);
        house1.setHasAirCond(true);

        House house2 = new House("Abseron","Sumqayit","Mikrorayon",
                2008,2,3,1,1,
                false,true,true,true,false,true);

        printHouse(house1);
        printHouse(house2);


    }

    private static void printHouse(House house){
        System.out.println();

        System.out.println("House added -> " + house);

        System.out.println();
    }
}
