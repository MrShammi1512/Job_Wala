package com.NaukriChowk.Job_Wala.service;

import com.NaukriChowk.Job_Wala.dto.JobPost;
import com.NaukriChowk.Job_Wala.model.JobDetail;
import com.NaukriChowk.Job_Wala.repo.JobPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostJobServiceImpl  implements  PostJobService{

    @Autowired
    private JobPostRepository jobPostRepository;
    @Override
    public List<JobDetail> getAllJobPost() {
        return this.jobPostRepository.findAll();
    }

    @Override
    public String addNewJobPost(JobDetail jobdetail) {
        JobDetail jd=this.jobPostRepository.save(jobdetail);
        if(jd !=null) return "Job Post added successfully";
        else return "Job Post not added";
    }

    @Override
    public JobDetail getJobByJobId(Long jobId) {
        return this.jobPostRepository.findById(jobId).get();

    }
}
