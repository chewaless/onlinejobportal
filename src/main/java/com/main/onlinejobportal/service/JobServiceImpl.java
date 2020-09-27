package com.main.onlinejobportal.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.onlinejobportal.model.Jobs;
import com.main.onlinejobportal.repo.JobsRepo;

@Transactional
@Component
public class JobServiceImpl implements JobService {

	@Autowired
	JobsRepo jobsRepo;

	@Override
	public List<Jobs> getJobsDetails() {
		return jobsRepo.findAll();
	}
	public String save(Jobs jobs) {
		jobsRepo.save(jobs);
		return "Jobs saved sucessfully";
    }
     
    public Jobs get(Long id) {
        return jobsRepo.findById(id).get();
    }
    public String delete(Long id) {
    	jobsRepo.deleteById(id);
    	return "Jobs deleted sucessfully";
    }
}
