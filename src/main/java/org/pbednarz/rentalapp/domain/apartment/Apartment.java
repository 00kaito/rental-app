package org.pbednarz.rentalapp.domain.apartment;

public class Apartment {
    private final String ownerId;
    private final Address address;
    private String description;

    public Apartment(String ownerId, Address address, String description) {
        this.ownerId = ownerId;
        this.address = address;
        this.description = description;
    }
}
