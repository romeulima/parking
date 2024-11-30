package com.romeulima.parking_lot.infrastructure.repository;

import com.romeulima.parking_lot.infrastructure.entity.ParkingEntranceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParkingEntranceJpaRepository extends JpaRepository<ParkingEntranceEntity, UUID> {
}
