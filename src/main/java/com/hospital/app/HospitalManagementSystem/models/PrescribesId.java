package com.hospital.app.HospitalManagementSystem.models;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
class PrescribesId
{
    @Column(name = "Physician", nullable = false)
    private Integer physician;

    @Column(name = "Patient", nullable = false)
    private Integer patient;

    @Column(name = "Medication", nullable = false)
    private Integer medication;
}