package com.main.onlinejobportal.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.onlinejobportal.model.Status;
import com.main.onlinejobportal.repo.StatusRepo;

@Transactional
@Component
public class StatusServiceImpl implements StatusService {

	@Autowired
	StatusRepo statusRepo;

	@Override
	public List<Status> getStatusDetails() {
		return statusRepo.findAll();
	}
	public String save(Status status) {
		statusRepo.save(status);
		return "Status saved sucessfully";
    }
     
    public Status get(Long id) {
        return statusRepo.findById(id).get();
    }
    public String delete(Long id) {
    	statusRepo.deleteById(id);
    	return "Status deleted sucessfully";
    }
}
