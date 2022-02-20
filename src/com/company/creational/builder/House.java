package com.company.creational.builder;

public class House {
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

    public House() {

    }
// important
    public House(String region, String city, String street, int apartmentYear, int balconyNumber, int roomNumber) {
        this.region = region;
        this.city = city;
        this.street = street;
        this.apartmentYear = apartmentYear;
        this.balconyNumber = balconyNumber;
        this.roomNumber = roomNumber;
    }



    public House(String region, String district, String street,
                 int apartmentYear, int balconyNumber, int roomNumber, int bathRoomNumber, int toiletNumber,
                 boolean isDuplex, boolean isFurnished, boolean hasParking, boolean hasChildPark, boolean hasPool, boolean hasAirCond) {
        this.region = region;
        this.city = district;
        this.street = street;
        this.apartmentYear = apartmentYear;
        this.balconyNumber = balconyNumber;
        this.roomNumber = roomNumber;
        this.bathRoomNumber = bathRoomNumber;
        this.toiletNumber = toiletNumber;
        this.isDuplex = isDuplex;
        this.isFurnished = isFurnished;
        this.hasParking = hasParking;
        this.hasChildPark = hasChildPark;
        this.hasPool = hasPool;
        this.hasAirCond = hasAirCond;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getApartmentYear() {
        return apartmentYear;
    }

    public void setApartmentYear(int apartmentYear) {
        this.apartmentYear = apartmentYear;
    }

    public int getBalconyNumber() {
        return balconyNumber;
    }

    public void setBalconyNumber(int balconyNumber) {
        this.balconyNumber = balconyNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBathRoomNumber() {
        return bathRoomNumber;
    }

    public void setBathRoomNumber(int bathRoomNumber) {
        this.bathRoomNumber = bathRoomNumber;
    }

    public int getToiletNumber() {
        return toiletNumber;
    }

    public void setToiletNumber(int toiletNumber) {
        this.toiletNumber = toiletNumber;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public boolean isHasChildPark() {
        return hasChildPark;
    }

    public void setHasChildPark(boolean hasChildPark) {
        this.hasChildPark = hasChildPark;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public boolean isHasAirCond() {
        return hasAirCond;
    }

    public void setHasAirCond(boolean hasAirCond) {
        this.hasAirCond = hasAirCond;
    }

    @Override
    public String toString() {
        return "House{" +
                "region='" + region + '\'' +
                ", district='" + city + '\'' +
                ", street='" + street + '\'' +
                ", apartmentYear=" + apartmentYear +
                ", balconyNumber=" + balconyNumber +
                ", roomNumber=" + roomNumber +
                ", bathRoomNumber=" + bathRoomNumber +
                ", toiletNumber=" + toiletNumber +
                ", isDuplex=" + isDuplex +
                ", isFurnished=" + isFurnished +
                ", hasParking=" + hasParking +
                ", hasChildPark=" + hasChildPark +
                ", hasPool=" + hasPool +
                ", hasAirCond=" + hasAirCond +
                '}';
    }
}
