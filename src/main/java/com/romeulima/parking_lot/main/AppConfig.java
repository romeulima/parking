package com.romeulima.parking_lot.main;

import com.romeulima.parking_lot.core.repository.IParkingEntranceRepository;
import com.romeulima.parking_lot.core.usecase.EnterParkingLotUseCase;
import com.romeulima.parking_lot.infrastructure.repository.ParkingEntranceJpaRepository;
import com.romeulima.parking_lot.infrastructure.repository.ParkingEntranceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    IParkingEntranceRepository parkingEntranceRepository(ParkingEntranceJpaRepository parkingEntranceJpaRepository) {
        return new ParkingEntranceRepository(parkingEntranceJpaRepository);
    }

    @Bean
    EnterParkingLotUseCase enterParkingLotUseCase (IParkingEntranceRepository iParkingEntranceRepository) {
        return new EnterParkingLotUseCase(iParkingEntranceRepository);
    }
}
