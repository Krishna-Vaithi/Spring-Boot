package org.springdemo.spring_boot_web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    @NotBlank(message = "Please add Department Name")
    /*@Length(min = 2, max=5)
    @Size(min = 2, max = 5)
    @Email
    @Future
    @FutureOrPresent
    @Past
    @PastOrPresent
    @Positive
    @PositiveOrZero
    @Negative
    @NegativeOrZero*/
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
