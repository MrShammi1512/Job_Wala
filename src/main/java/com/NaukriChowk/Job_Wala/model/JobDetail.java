package com.NaukriChowk.Job_Wala.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "JobDetail", uniqueConstraints = { @UniqueConstraint(columnNames = { "jobId" }) })
public class JobDetail {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long jobId;


    @Column(unique = true)
    private Long companyJobId;

    @Column
    private String jobTitle;

    @Column
    private String jobDescription;

    @Column
    private String jobDesignation;

    @Column
    private String ctc;

    @Column
    private Integer yearsOfExperience;

    @Column
    private String jobLocation;

    @Column
    private String skills;

    @Column
    private String jobUrl;

}
