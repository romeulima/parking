package com.romeulima.parking_lot.infrastructure.repository;

import com.romeulima.parking_lot.adapter.ParkingEntranceAdapter;
import com.romeulima.parking_lot.core.entity.ParkingEntrance;
import com.romeulima.parking_lot.core.repository.IParkingEntranceRepository;
import com.romeulima.parking_lot.infrastructure.entity.ClientEntity;
import com.romeulima.parking_lot.infrastructure.entity.ParkingEntranceEntity;

public class ParkingEntranceRepository implements IParkingEntranceRepository {

    private final ParkingEntranceJpaRepository repository;

    public ParkingEntranceRepository (ParkingEntranceJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public ParkingEntrance insertEntrance(String name, String phone) {
        ClientEntity clientEntity = new ClientEntity(name, phone);
        ParkingEntranceEntity parkingEntranceEntity = new ParkingEntranceEntity(clientEntity);

        this.repository.save(parkingEntranceEntity);

        return ParkingEntranceAdapter.toDomain(parkingEntranceEntity);
    }
}