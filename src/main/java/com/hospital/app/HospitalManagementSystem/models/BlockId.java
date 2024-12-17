package com.hospital.app.HospitalManagementSystem.models;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
class BlockId 
{
    @Column(name = "BlockFloor", nullable = false)
    private Integer blockFloor;

    @Column(name = "BlockCode", nullable = false)
    private Integer blockCode;
}