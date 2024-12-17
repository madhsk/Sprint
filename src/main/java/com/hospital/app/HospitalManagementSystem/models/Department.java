package com.hospital.app.HospitalManagementSystem.models;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "Department")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @Column(name = "DepartmentID", nullable = false)
    private Integer departmentId;

    @Column(name = "Name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "Head", nullable = false)
    private Physician head;
}