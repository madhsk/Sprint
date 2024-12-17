package com.hospital.app.HospitalManagementSystem.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Medication")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medication {
    @Id
    @Column(name = "Code", nullable = false)
    private Integer code;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Brand", nullable = false)
    private String brand;

    @Column(name = "Description", nullable = false)
    private String description;
}