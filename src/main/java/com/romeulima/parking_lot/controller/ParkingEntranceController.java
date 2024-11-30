package com.romeulima.parking_lot.controller;

import com.romeulima.parking_lot.core.entity.ParkingEntrance;
import com.romeulima.parking_lot.core.usecase.EnterParkingLotUseCase;
import com.romeulima.parking_lot.infrastructure.dto.ParkingEntranceRequestDTO;
import com.romeulima.parking_lot.infrastructure.dto.ParkingEntranceResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrances")
public class ParkingEntranceController {

    private final EnterParkingLotUseCase enterParkingLotUseCase;

    public ParkingEntranceController (EnterParkingLotUseCase enterParkingLotUseCase) {
        this.enterParkingLotUseCase = enterParkingLotUseCase;
    }

    @PostMapping
    public ResponseEntity<ParkingEntranceResponseDTO> createParkingEntrance(@RequestBody ParkingEntranceRequestDTO request) {
        ParkingEntrance entrance = this.enterParkingLotUseCase.execute(request.name(), request.phone());

        ParkingEntranceResponseDTO response = new ParkingEntranceResponseDTO(entrance.getId(), entrance.getClient().getName(), entrance.getClient().getPhone(), entrance.getCheckIn());

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
