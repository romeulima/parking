package com.romeulima.parking_lot.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingEntrance {

    private UUID id;

    private Client client;

    private LocalDateTime checkIn;

    private LocalDateTime checkOut;

    private Double paidValue;

    public ParkingEntrance(Client client) {
        this.client = client;
    }
}
