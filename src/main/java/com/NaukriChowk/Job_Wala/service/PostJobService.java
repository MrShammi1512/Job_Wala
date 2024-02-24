package com.NaukriChowk.Job_Wala.service;

import com.NaukriChowk.Job_Wala.dto.JobPost;
import com.NaukriChowk.Job_Wala.model.JobDetail;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public interface PostJobService {

    List<JobDetail> getAllJobPost();
    String addNewJobPost(JobDetail jobdetail);

     JobDetail  getJobByJobId(Long jobId);
}
