package com.NaukriChowk.Job_Wala.repo;

import com.NaukriChowk.Job_Wala.model.JobDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobPostRepository extends JpaRepository<JobDetail,Long> {

   // @Query("SELECT jp FROM JobDetail jp WHERE jp.company_name = :companyName")
    public List<JobDetail> findJobsByCompanyName(String companyName);
    public List<JobDetail> findJobsByCompanyDetailsCompanyId(Long id);
}
