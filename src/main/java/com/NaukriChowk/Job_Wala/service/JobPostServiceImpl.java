package com.NaukriChowk.Job_Wala.service;

import com.NaukriChowk.Job_Wala.dto.JobDetailDto;
import com.NaukriChowk.Job_Wala.model.Company;
import com.NaukriChowk.Job_Wala.model.JobDetail;

import com.NaukriChowk.Job_Wala.repo.CompanyRepository;
import com.NaukriChowk.Job_Wala.repo.JobPostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobPostServiceImpl implements JobPostService {

    @Autowired
    private JobPostRepository jobPostRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<JobDetailDto> getAllJobPost() {

        List<JobDetail> jd=this.jobPostRepository.findAll();
        return jd.stream().map(job-> modelMapper.map(job,JobDetailDto.class)).collect(Collectors.toList());
    }

    @Override
    public String addNewJobPost(JobDetailDto jobdetail) {
        JobDetail newJob=modelMapper.map(jobdetail,JobDetail.class);
        JobDetail jd=this.jobPostRepository.save(newJob);
        if(jd !=null) return "Job Post added successfully";
        else return "Job Post not added";
    }

    @Override
    public JobDetailDto getJobByJobId(Long jobId) {
        JobDetail job=this.jobPostRepository.findById(jobId).get();
        return modelMapper.map(job,JobDetailDto.class);

    }



    @Override
    public JobDetailDto postNewJob(JobDetailDto jobPost) {
        JobDetail job=modelMapper.map(jobPost,JobDetail.class);
        return modelMapper.map(jobPostRepository.save(job),JobDetailDto.class);
    }

    @Override
    public void deleteJobPost(Long jobId) {

            JobDetail jd=this.jobPostRepository.findById(jobId).get();
            this.jobPostRepository.delete(jd);


    }

    @Override
    public List<JobDetailDto> getJobByCompanyName(String companyName) {
        List<JobDetail> jd=this.jobPostRepository.findJobsByCompanyName(companyName);
        return jd.stream().map(job ->modelMapper.map(job,JobDetailDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<JobDetailDto> getJobByCompanyId(Long id) {
        List<JobDetail> jd= this.jobPostRepository.findJobsByCompanyDetailsCompanyId(id);
        return jd.stream().map(job ->modelMapper.map(job,JobDetailDto.class)).collect(Collectors.toList());
    }

    @Override
    public void updateJob(JobDetailDto jobDetail) {
        JobDetail jd=modelMapper.map(jobDetail,JobDetail.class);
        this.jobPostRepository.save(jd);

    }
}
