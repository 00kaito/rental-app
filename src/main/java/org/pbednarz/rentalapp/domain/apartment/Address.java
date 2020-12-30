package org.pbednarz.rentalapp.domain.apartment;

public class Address {
    private final String postalCode;
    private final String houseNumber;
    private final String apartmentNumber;
    private final String city;
    private final String country;

    public Address(String postalCode, String houseNumber, String apartmentNumber, String city, String country) {
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.country = country;
    }
}
