package org.pbednarz.rentalapp.application.apartment;


import org.pbednarz.rentalapp.domain.apartment.Address;
import org.pbednarz.rentalapp.domain.apartment.Apartment;
import org.pbednarz.rentalapp.domain.apartment.Room;
import org.pbednarz.rentalapp.domain.apartment.SquareMeter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApartmentApplicationService {
    String nic;

    public void add(String ownerId, String street, String postalCode, String houseNumber, String apartmentNumber,
                    String city, String country, String description, Map<String, Double> roomsDefinition) {
        Address address = new Address(postalCode, houseNumber, apartmentNumber, city, country);
        List<Room> rooms = new ArrayList<>();
        roomsDefinition.forEach((name, size) -> {
            SquareMeter squareMeter = new SquareMeter(size);
            rooms.add(new Room(name, squareMeter));
        });

        Apartment apartment = new Apartment(ownerId);
    }
}
