package com.main.onlinejobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.onlinejobportal.model.Company;
import com.main.onlinejobportal.model.UserJobs;
import com.main.onlinejobportal.service.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired(required=true)
    CompanyService companyService;
	
	@GetMapping("/companyDetails")
    public List<Company> getCompanyDetails() {
        return companyService.getCompanyDetails();
	}
	
	@PostMapping("/saveCompany")
    public String createCompany(@RequestBody Company company) {
		return companyService.save(company);
    }

    @GetMapping("/company/{id}")
    public Company getCompanyById(@PathVariable(value = "id") Long companyId){
        return companyService.get(companyId);
    }
    
    @GetMapping("/deleteCompany/{id}")
    public String getDeleteCompanyById(@PathVariable(value = "id") Long companyId){
        return companyService.delete(companyId);
    }
    
    @GetMapping("/getUserDetails/{id}")
    public List<UserJobs> getUserDetailsByJobId(@PathVariable(value = "id") Long jobId) {
        return companyService.getUserDetails(jobId);
	}
}
