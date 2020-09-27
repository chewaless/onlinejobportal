package com.main.onlinejobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.onlinejobportal.model.Company;
import com.main.onlinejobportal.model.Status;
import com.main.onlinejobportal.service.StatusService;

@RestController
public class StatusController {

	@Autowired
    StatusService statusService;
	
	@GetMapping("/statusDetails")
    public List<Status> getStatusDetails() {
        return statusService.getStatusDetails();
	}
	@PostMapping("/saveStatus")
    public String createCompany(@RequestBody Status status) {
		return statusService.save(status);
    }

    @GetMapping("/status/{id}")
    public Status getCompanyById(@PathVariable(value = "id") Long statusId){
        return statusService.get(statusId);
    }
    
    @GetMapping("/deleteStatus/{id}")
    public String getDeleteCompanyById(@PathVariable(value = "id") Long statusId){
        return statusService.delete(statusId);
    }
}
