package com.main.onlinejobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.onlinejobportal.model.Jobs;

@Service
public interface JobService {

	public List<Jobs> getJobsDetails();
	public String save(Jobs jobs);
    public Jobs get(Long id);
    public String delete(Long id);
}
