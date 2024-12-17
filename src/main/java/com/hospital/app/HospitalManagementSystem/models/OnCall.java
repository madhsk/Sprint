package com.hospital.app.HospitalManagementSystem.models;

import java.time.*;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "On_Call")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OnCall {
    @EmbeddedId
    private OnCallId id;

    @Column(name = "OnCallStart", nullable = false)
    private LocalDateTime onCallStart;

    @Column(name = "OnCallEnd", nullable = false)
    private LocalDateTime onCallEnd;
}
