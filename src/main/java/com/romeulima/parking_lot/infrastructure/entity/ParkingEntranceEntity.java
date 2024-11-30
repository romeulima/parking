package com.romeulima.parking_lot.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "parking_entrances")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ParkingEntranceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "client_id", nullable = false)
    private ClientEntity clientEntity;

    @CreationTimestamp
    @Column(name = "check_in")
    private LocalDateTime checkIn;

    @Column(name = "check_out")
    private LocalDateTime checkOut;

    @Column(name = "paid_value")
    private Double paidValue;

    public ParkingEntranceEntity (ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }
}
