package com.anudip.CrudOperation.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Emploiee 
{
	@Id
	private int uid;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "CAN NOT LTFT BLANK")
	private String empName;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "CAN NOT LTFT BLANK")
	private String empAddress;
	
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "CAN NOT LTFT BLANK")
	@Email
	private String empEmail;
	
	
	@Column(length = 11, nullable = false, unique = true)
	@NotBlank(message = "CAN NOT LTFT BLANK")
	private long empPhone;
	
}
