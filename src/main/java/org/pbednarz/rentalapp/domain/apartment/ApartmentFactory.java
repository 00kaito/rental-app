package org.pbednarz.rentalapp.domain.apartment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApartmentFactory {
    public Apartment create(
            String ownerId, String postalCode, String houseNumber, String apartmentNumber, String city, String country,
            String description, Map<String, Double> roomsDefinition) {
        Address address = new Address(postalCode, houseNumber, apartmentNumber, city, country);
        List<Room> rooms = new ArrayList<>();
        roomsDefinition.forEach((name, size) -> {
            SquareMeter squareMeter = new SquareMeter(size);
            rooms.add(new Room(name, squareMeter));
        });
        return new Apartment(ownerId,address, description);
    }
}