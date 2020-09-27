package com.main.onlinejobportal.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.onlinejobportal.model.User;
import com.main.onlinejobportal.model.UserJobs;
import com.main.onlinejobportal.repo.UserJobsRepo;
import com.main.onlinejobportal.repo.UserRepo;

@Transactional
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	@Autowired
	UserJobsRepo userJobsRepo;

	@Override
	public List<User> getUserDetails() {
		return userRepo.findAll();
	}
	public String save(User user) {
		userRepo.save(user);
		return "User saved sucessfully";
    }
     
    public User get(Long id) {
        return userRepo.findById(id).get();
    }
     
    public String delete(Long id) {
    	userRepo.deleteById(id);
    	return "User deleted sucessfully";
    }
	@Override
	public List<UserJobs> getCompanyDetails(Long id) {
		return userJobsRepo.getCompanyByCompantId(id);
	}
}
