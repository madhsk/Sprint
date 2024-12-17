package com.hospital.app.HospitalManagementSystem.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Patient")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @Column(name = "SSN", nullable = false)
    private Integer ssn;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Address", nullable = false)
    private String address;

    @Column(name = "Phone", nullable = false)
    private String phone;

    @Column(name = "InsuranceID", nullable = false)
    private Integer insuranceId;

    @ManyToOne
    @JoinColumn(name = "PCP", nullable = false)
    private Physician pcp;
}