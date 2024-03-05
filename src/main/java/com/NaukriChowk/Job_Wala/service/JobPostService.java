package com.NaukriChowk.Job_Wala.service;

import com.NaukriChowk.Job_Wala.dto.JobDetailDto;
import com.NaukriChowk.Job_Wala.model.Company;
import com.NaukriChowk.Job_Wala.model.JobDetail;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface JobPostService {

    List<JobDetailDto> getAllJobPost();
    String addNewJobPost(JobDetailDto jobdetailDto);

     JobDetailDto  getJobByJobId(Long jobId);


    JobDetailDto postNewJob(JobDetailDto jobPostDto);

     public void deleteJobPost(Long jobId);

    public List<JobDetailDto> getJobByCompanyName(String companyName);

    public List<JobDetailDto> getJobByCompanyId(Long id);
    public void updateJob(JobDetailDto jobDetailDto);
}
