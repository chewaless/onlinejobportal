package com.main.onlinejobportal.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.onlinejobportal.model.Company;
import com.main.onlinejobportal.model.UserJobs;
import com.main.onlinejobportal.repo.CompanyRepo;
import com.main.onlinejobportal.repo.UserJobsRepo;

@Transactional
@Component
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyRepo companyRepo;
	@Autowired
	UserJobsRepo userJobsRepo;

	@Override
	public List<Company> getCompanyDetails() {
		companyRepo.findAll();
		return companyRepo.findAll();
	}
	public String save(Company company) {
		companyRepo.save(company);
		return "Company saved sucessfully";
    }
     
    public Company get(Long id) {
        return companyRepo.findById(id).get();
    }
    public String delete(Long id) {
    	companyRepo.deleteById(id);
    	return "Company deleted sucessfully";
    }
	@Override
	public List<UserJobs> getUserDetails(Long id) {
		return userJobsRepo.getUsersByJobId(id);
	}
	
}
