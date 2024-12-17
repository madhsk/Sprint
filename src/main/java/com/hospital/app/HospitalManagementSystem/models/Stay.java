package com.hospital.app.HospitalManagementSystem.models;

import java.time.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Stay")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stay {
    @Id
    @Column(name = "StayID", nullable = false)
    private Integer stayId;

    @ManyToOne
    @JoinColumn(name = "Patient", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "Room", nullable = false)
    private Room room;

    @Column(name = "StayStart", nullable = false)
    private LocalDateTime stayStart;

    @Column(name = "StayEnd", nullable = false)
    private LocalDateTime stayEnd;
}