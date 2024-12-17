package com.hospital.app.HospitalManagementSystem.models;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Trained_In")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainedIn {
    @EmbeddedId
    private TrainedInId id;

    @Column(name = "CertificationDate", nullable = false)
    private LocalDateTime certificationDate;

    @Column(name = "CertificationExpires", nullable = false)
    private LocalDateTime certificationExpires;
}