package org.pbednarz.rentalapp.domain.apartment;

import java.util.List;

public class Apartment {
    private final String ownerId;
    private final Address address;
    private List<Room> rooms;
    private String description;

     Apartment(String ownerId, Address address, List<Room> rooms, String description) {
        this.ownerId = ownerId;
        this.address = address;
         this.rooms = rooms;
         this.description = description;
    }
}
