package com.NaukriChowk.Job_Wala.service;

import com.NaukriChowk.Job_Wala.dto.CompanyDto;
import com.NaukriChowk.Job_Wala.model.Company;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CompanyService {

    public CompanyDto addCompany(CompanyDto companyDto);

    public CompanyDto getCompany(Long companyId);
   public List<CompanyDto> getAllCompany();

   public void updateCompanyDetails(Long companyId, CompanyDto companyDetail);

   public void deleteComapny(Long companyId);


}
