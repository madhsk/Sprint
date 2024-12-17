package com.hospital.app.HospitalManagementSystem.models;

import jakarta.persistence.*;
import lombok.*;
//import java.time.LocalDateTime;
 
@Entity
@Table(name = "Physician")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Physician 
{
    @Id
    @Column(name = "EmployeeID", nullable = false)
    private Integer employeeId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Position", nullable = false)
    private String position;

    @Column(name = "SSN", nullable = false, unique = true)
    private Integer ssn;
}