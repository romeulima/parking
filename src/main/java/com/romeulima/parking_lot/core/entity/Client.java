package com.romeulima.parking_lot.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private UUID id;

    private String name;

    private String phone;

    private boolean isPaid;

    public Client(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
