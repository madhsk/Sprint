package com.hospital.app.HospitalManagementSystem.models;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Appointment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @Column(name = "AppointmentID", nullable = false)
    private Integer appointmentId;

    @ManyToOne
    @JoinColumn(name = "Patient", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "PrepNurse")
    private Nurse prepNurse;

    @ManyToOne
    @JoinColumn(name = "Physician", nullable = false)
    private Physician physician;

    @Column(name = "Starto", nullable = false)
    private LocalDateTime starto;

    @Column(name = "Endo", nullable = false)
    private LocalDateTime endo;

    @Column(name = "ExaminationRoom", nullable = false)
    private String examinationRoom;
}