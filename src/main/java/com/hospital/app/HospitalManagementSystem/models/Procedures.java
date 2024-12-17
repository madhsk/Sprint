package com.hospital.app.HospitalManagementSystem.models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Procedures")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Procedures {
    @Id
    @Column(name = "Code", nullable = false)
    private Integer code;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Cost", nullable = false)
    private Double cost;
}
