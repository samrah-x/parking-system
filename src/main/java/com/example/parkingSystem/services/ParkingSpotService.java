package com.example.parkingSystem.services;

import com.example.parkingSystem.models.ParkingSpot;
import org.springframework.stereotype.Service;
import com.example.parkingSystem.repositories.ParkingSpotRepository;

import java.util.List;

@Service
public class ParkingSpotService {
    private final ParkingSpotRepository repository;

    public ParkingSpotService(ParkingSpotRepository repository) {
        this.repository = repository;
    }

    public List<ParkingSpot> getAllSpots() {
        return repository.findAll();
    }
}