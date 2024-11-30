package com.romeulima.parking_lot.core.usecase;

import com.romeulima.parking_lot.core.entity.ParkingEntrance;
import com.romeulima.parking_lot.core.repository.IParkingEntranceRepository;

public class EnterParkingLotUseCase {

    private final IParkingEntranceRepository IParkingEntranceRepository;

    public EnterParkingLotUseCase(IParkingEntranceRepository IParkingEntranceRepository) {
        this.IParkingEntranceRepository = IParkingEntranceRepository;
    }

    public ParkingEntrance execute(String name, String phone) {
        return IParkingEntranceRepository.insertEntrance(name, phone);
    }
}
