package com.hospital.app.HospitalManagementSystem.models;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "Affiliated_With")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AffiliatedWith {
    @EmbeddedId
    private AffiliatedWithId id;

    @Column(name = "PrimaryAffiliation", nullable = false)
    private Boolean primaryAffiliation;
}


