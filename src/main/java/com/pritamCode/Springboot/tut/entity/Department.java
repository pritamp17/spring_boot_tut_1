package com.pritamCode.Springboot.tut.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data  // plugins tht generate getters setters
@NoArgsConstructor
@AllArgsConstructor
@Builder  // builder pattern will be generaated
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    /// annotations for hibernate validator
    @NotBlank(message = "Please Add Department Name")
//    @Length(max = 5,min =1)
//    Email
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;






}
