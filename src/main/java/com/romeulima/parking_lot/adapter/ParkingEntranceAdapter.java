package com.romeulima.parking_lot.adapter;

import com.romeulima.parking_lot.core.entity.ParkingEntrance;
import com.romeulima.parking_lot.infrastructure.entity.ParkingEntranceEntity;

public class ParkingEntranceAdapter {

    public static ParkingEntrance toDomain(ParkingEntranceEntity parkingEntranceEntity) {
        return new ParkingEntrance(
                parkingEntranceEntity.getId(),
                ClientAdapter.toDomain(parkingEntranceEntity.getClientEntity()),
                parkingEntranceEntity.getCheckIn(),
                parkingEntranceEntity.getCheckOut(),
                parkingEntranceEntity.getPaidValue()
        );
    }
}
