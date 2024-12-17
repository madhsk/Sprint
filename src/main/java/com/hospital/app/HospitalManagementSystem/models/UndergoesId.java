package com.hospital.app.HospitalManagementSystem.models;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
class UndergoesId 
{
	@Column(name = "Patient", nullable = false)
	private Integer patient;

	@Column(name = "Procedures", nullable = false)
	private Integer procedures;

	@Column(name = "Stay", nullable = false)
	private Integer stay;
}
