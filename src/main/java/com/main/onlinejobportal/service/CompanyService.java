package com.main.onlinejobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.onlinejobportal.model.Company;
import com.main.onlinejobportal.model.UserJobs;

@Service
public interface CompanyService {
    public List<Company> getCompanyDetails();
    public String save(Company company);
    public Company get(Long id);
    public String delete(Long id);
    public List<UserJobs> getUserDetails(Long id);
}
