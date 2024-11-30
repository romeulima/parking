package com.romeulima.parking_lot.infrastructure.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record ParkingEntranceResponseDTO(
        UUID id,
        String name,
        String phone,
        LocalDateTime checkIn
) {
}
