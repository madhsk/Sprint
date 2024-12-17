package com.hospital.app.HospitalManagementSystem.models;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
class TrainedInId
{
    @Column(name = "Physician", nullable = false)
    private Integer physician;

    @Column(name = "Treatment", nullable = false)
    private Integer treatment;
}
