package com.NaukriChowk.Job_Wala.repo;

import com.NaukriChowk.Job_Wala.model.JobDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostRepository extends JpaRepository<JobDetail,Long> {
}
