package com.hospital.app.HospitalManagementSystem.models;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
class AffiliatedWithId
{
    @Column(name = "Physician", nullable = false)
    private Integer physician;

    @Column(name = "Department", nullable = false)
    private Integer department;
}
