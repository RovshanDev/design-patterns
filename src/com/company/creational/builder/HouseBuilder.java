package com.company.creational.builder;

public class HouseBuilder {
    private String region;
    private String city;
    private String street;

    private int apartmentYear;
    private int balconyNumber;
    private int roomNumber;
    private int bathRoomNumber;
    private int toiletNumber;

    private boolean isDuplex;
    private boolean isFurnished;
    private boolean hasParking;
    private boolean hasChildPark;
    private boolean hasPool;
    private boolean hasAirCond;

     public static HouseBuilder startBuild(){
         return new HouseBuilder();
     }

     public House build(){
         House house = new House();
         house.setRegion(region);
         house.setCity(city);
         house.setStreet(street);

         house.setApartmentYear(apartmentYear);
         house.setBalconyNumber(balconyNumber);
         house.setRoomNumber(roomNumber);
         house.setBathRoomNumber(bathRoomNumber);
         house.setToiletNumber(toiletNumber);

         house.setDuplex(isDuplex);
         house.setFurnished(isFurnished);
         house.setHasParking(hasParking);
         house.setHasChildPark(hasChildPark);
         house.setHasPool(hasPool);
         house.setHasAirCond(hasAirCond);

         return house;
     }

    public HouseBuilder setRegion(String region) {
        this.region = region;
        return this;
    }

    public HouseBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public HouseBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public HouseBuilder setApartmentYear(int apartmentYear) {
        this.apartmentYear = apartmentYear;
        return this;
    }

    public HouseBuilder setBalconyNumber(int balconyNumber) {
        this.balconyNumber = balconyNumber;
        return this;
    }

    public HouseBuilder setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public HouseBuilder setBathRoomNumber(int bathRoomNumber) {
        this.bathRoomNumber = bathRoomNumber;
        return this;
    }

    public HouseBuilder setToiletNumber(int toiletNumber) {
        this.toiletNumber = toiletNumber;
        return this;
    }

    public HouseBuilder setDuplex(boolean duplex) {
        isDuplex = duplex;
        return this;
    }

    public HouseBuilder setFurnished(boolean furnished) {
        isFurnished = furnished;
        return this;
    }

    public HouseBuilder setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
        return this;
    }

    public HouseBuilder setHasChildPark(boolean hasChildPark) {
        this.hasChildPark = hasChildPark;
        return this;
    }

    public HouseBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    public HouseBuilder setHasAirCond(boolean hasAirCond) {
        this.hasAirCond = hasAirCond;
        return this;
    }
}
