package com.NaukriChowk.Job_Wala.repo;

import com.NaukriChowk.Job_Wala.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
