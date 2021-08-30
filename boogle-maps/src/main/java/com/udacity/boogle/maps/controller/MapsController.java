package com.udacity.boogle.maps.controller;

import com.udacity.boogle.maps.entity.Address;
import com.udacity.boogle.maps.repository.MockAddressRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maps")
public class MapsController {

    /**
     * Retrieves address information based on latitude and longitude.
     * @param lat Latitude
     * @param lon Longitude
     * @return Address information
     */
    @GetMapping
    public Address get(@RequestParam Double lat, @RequestParam Double lon) {
        return MockAddressRepository.getRandom();
    }
}
