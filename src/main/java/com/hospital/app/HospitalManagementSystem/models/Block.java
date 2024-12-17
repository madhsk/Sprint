package com.hospital.app.HospitalManagementSystem.models;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Block")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Block
{
    @EmbeddedId
    private BlockId id;
}

