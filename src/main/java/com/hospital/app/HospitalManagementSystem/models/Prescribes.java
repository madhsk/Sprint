package com.hospital.app.HospitalManagementSystem.models;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Prescribes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prescribes {
    @EmbeddedId
    private PrescribesId id;

    @Column(name = "Date", nullable = false)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "Appointment")
    private Appointment appointment;

    @Column(name = "Dose", nullable = false)
    private String dose;
}