package com.main.onlinejobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.onlinejobportal.model.User;
import com.main.onlinejobportal.model.UserJobs;

@Service
public interface UserService {
	public List<User> getUserDetails();
	public String save(User user);
    public User get(Long id);
    public String delete(Long id);
    public List<UserJobs> getCompanyDetails(Long id);
}
