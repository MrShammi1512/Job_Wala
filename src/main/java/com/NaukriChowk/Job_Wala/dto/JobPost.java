package com.NaukriChowk.Job_Wala.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPost {


    @Column(unique = true)
    private Long companyJobId;


    private String jobTitle;


    private String jobDescription;


    private String jobDesignation;


    private String ctc;


    private Integer yearsOfExperience;


    private String jobLocation;


    private String skills;
}
