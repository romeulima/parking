package com.romeulima.parking_lot.adapter;

import com.romeulima.parking_lot.core.entity.Client;
import com.romeulima.parking_lot.infrastructure.entity.ClientEntity;

public class ClientAdapter {

    public static Client toDomain (ClientEntity clientEntity) {
        return new Client(
                clientEntity.getId(),
                clientEntity.getName(),
                clientEntity.getPhone(),
                clientEntity.isPaid()
        );
    }
}
