package com.NaukriChowk.Job_Wala.controller;

import com.NaukriChowk.Job_Wala.dto.JobPost;
import com.NaukriChowk.Job_Wala.model.JobDetail;
import com.NaukriChowk.Job_Wala.service.PostJobService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/job-post")
@RequiredArgsConstructor
public class JobPostController {

    @Autowired
    private PostJobService postJobService;

    // Get all the jobs
    @GetMapping("/all_jobs")
    public ResponseEntity<?> getAllPostedJobs(){

        return ResponseEntity.ok(this.postJobService.getAllJobPost());
    }

    // Add a new job post
    @PostMapping("/add-job")
    private ResponseEntity<?> addJobPost( @Valid @RequestBody JobDetail jobDetail){
        return  ResponseEntity.ok(this.postJobService.addNewJobPost(jobDetail));
    }

    // Get job post by job id
    @GetMapping("/{jobId}")
    public ResponseEntity<?> getJobByJobId(@PathVariable("jobId") Long jobId){
        JobDetail jd=this.postJobService.getJobByJobId(jobId);
        if(jd !=null){
            return ResponseEntity.ok(jd);
        }
        else {
           return ResponseEntity.ok("No job is availabele for this job id");
        }

    }
}
