package org.pbednarz.rentalapp.application.apartment;


import org.pbednarz.rentalapp.domain.apartment.Apartment;
import org.pbednarz.rentalapp.domain.apartment.ApartmentFactory;

import java.util.Map;

public class ApartmentApplicationService {
    public void add(String ownerId, String street, String postalCode, String houseNumber, String apartmentNumber,
                    String city, String country, String description, Map<String, Double> roomsDefinition) {
        Apartment apartment = new ApartmentFactory().create(ownerId, postalCode, houseNumber, apartmentNumber, city, country, description, roomsDefinition);
    }

}
