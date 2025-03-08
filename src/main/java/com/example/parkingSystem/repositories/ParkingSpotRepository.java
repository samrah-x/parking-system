package com.example.parkingSystem.repositories;

import com.example.parkingSystem.models.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepository  extends
        JpaRepository<ParkingSpot, Long> {
    // provides in-built CRUD functions
}
