package com.hospital.app.HospitalManagementSystem.models;

import java.time.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Undergoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Undergoes 
{
    @EmbeddedId
    private UndergoesId id;

    @Column(name = "DateUndergoes", nullable = false)
    private LocalDateTime dateUndergoes;

    @ManyToOne
    @JoinColumn(name = "Physician", nullable = false)
    private Physician physician;

    @ManyToOne
    @JoinColumn(name = "AssistingNurse")
    private Nurse assistingNurse;
}