package com.company.creational.builder;

public class AgentBuilder {
    public static void main(String[] args) {

         House build = HouseBuilder.startBuild()
                .setRegion("Gence")
                .setCity("Gence")
                .setStreet("Aran")
                .setApartmentYear(2011)
                .setRoomNumber(2)
                .setHasChildPark(true)
                .setHasParking(true)
                .build();

         printHouse(build);

    }

    private static void printHouse(House house){
        System.out.println();

        System.out.println("House added -> " + house);

        System.out.println();
    }
}
