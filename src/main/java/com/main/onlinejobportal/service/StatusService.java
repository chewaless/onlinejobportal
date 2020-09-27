package com.main.onlinejobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.onlinejobportal.model.Status;

@Service
public interface StatusService {

	List<Status> getStatusDetails();
	public String save(Status status);
    public Status get(Long id);
    public String delete(Long id);
}
