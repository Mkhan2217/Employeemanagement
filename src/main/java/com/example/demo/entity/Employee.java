package com.example.demo.entity;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	@Id
	@Column(name="id",unique = true,nullable = false,length = 36)
	private Long id;
	@NotBlank(message = "Pleas fill the data")
	@Pattern(regexp = "^[A-Za-z]{3,30}$")
	@Column(nullable = false,length = 50)
	private String firstName;
	@Column(nullable = false,length = 50)
	private String lastName;
	@Pattern(regexp = "(?:M|F|O)$")
	@Column(length = 1)
	private String gender;
	@NotBlank(message = "Pleas fill the data")
	@Pattern(regexp ="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+[a-zA-Z]{2,}")
	@Column(name="email",unique = true,nullable = false)
	private String email;
	@NotBlank(message = "Pleas fill the data")
	@Pattern(regexp = "[\\\\\\\\+]+[0-9]{2}+[-]+[0-9]{10}")
	@Column(name="phone",unique = true,nullable = false)
	private String phone;
	private Date dateOfBirth;
	private String img;
}
