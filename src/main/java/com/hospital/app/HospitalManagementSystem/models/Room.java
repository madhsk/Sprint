package com.hospital.app.HospitalManagementSystem.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Room")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @Column(name = "RoomNumber", nullable = false)
    private Integer roomNumber;

    @Column(name = "RoomType", nullable = false)
    private String roomType;

    @Embedded
    private BlockId blockId;

    @Column(name = "Unavailable", nullable = false)
    private Boolean unavailable;
}
