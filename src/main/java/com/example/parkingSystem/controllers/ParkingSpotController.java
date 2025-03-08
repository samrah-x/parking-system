package com.example.parkingSystem.controllers;

import com.example.parkingSystem.models.ParkingSpot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.parkingSystem.services.ParkingSpotService;

import java.util.List;

@RestController
@RequestMapping("/api/parking-spots")
public class ParkingSpotController {
    private final ParkingSpotService service;

    public ParkingSpotController(ParkingSpotService service) {
        this.service = service;
    }

    @GetMapping
    public List<ParkingSpot> getParkingSpots() {
        return service.getAllSpots();
    }
}