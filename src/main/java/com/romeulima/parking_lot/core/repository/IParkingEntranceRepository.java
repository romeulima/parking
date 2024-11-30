package com.romeulima.parking_lot.core.repository;

import com.romeulima.parking_lot.core.entity.ParkingEntrance;

public interface IParkingEntranceRepository {
    ParkingEntrance insertEntrance(String name, String phone);
}
