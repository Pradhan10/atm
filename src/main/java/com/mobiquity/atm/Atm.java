package com.mobiquity.atm;

public class Atm {

    static class GeoLocation{
        public String lat;
        public String lng;

        public GeoLocation(String lat, String lng) {
            this.lat = lat;
            this.lng = lng;
        }
    }

    public static class Address{
        public String street;
        public String houseNum;
        public String postalCode;
        public String city;
        public GeoLocation geoLocation;

        public Address(String street, String houseNum, String postalCode, String city, GeoLocation geoLocation) {
            this.street = street;
            this.houseNum = houseNum;
            this.postalCode = postalCode;
            this.city = city;
            this.geoLocation = geoLocation;
        }
    }
    public Address address;
    public String distance;
    public String type;

    public Atm(Address address, String distance, String type) {
        this.address = address;
        this.distance = distance;
        this.type = type;
    }
}
