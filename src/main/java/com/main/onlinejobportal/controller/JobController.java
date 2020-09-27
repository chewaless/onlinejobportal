package com.main.onlinejobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.onlinejobportal.model.Jobs;
import com.main.onlinejobportal.service.JobService;

@RestController
public class JobController {

	@Autowired
    JobService jobService;
	
	@GetMapping("/jobDetails")
    public List<Jobs> getJobsDetails() {
        return jobService.getJobsDetails();
	}
	@PostMapping("/saveJobs")
    public String createJobs(@RequestBody Jobs jobs) {
		return jobService.save(jobs);
    }

    @GetMapping("/jobs/{id}")
    public Jobs getJobsById(@PathVariable(value = "id") Long jobId){
        return jobService.get(jobId);
    }
    
    @GetMapping("/deleteJobs/{id}")
    public String getDeleteJobsById(@PathVariable(value = "id") Long jobId){
        return jobService.delete(jobId);
    }
}
