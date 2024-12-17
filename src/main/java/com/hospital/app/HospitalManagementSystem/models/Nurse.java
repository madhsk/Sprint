package com.hospital.app.HospitalManagementSystem.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Nurse")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nurse {
    @Id
    @Column(name = "EmployeeID", nullable = false)
    private Integer employeeId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Position", nullable = false)
    private String position;

    @Column(name = "Registered", nullable = false)
    private Boolean registered;

    @Column(name = "SSN", nullable = false, unique = true)
    private Integer ssn;
}