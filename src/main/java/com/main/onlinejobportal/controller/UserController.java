package com.main.onlinejobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.onlinejobportal.model.User;
import com.main.onlinejobportal.model.UserJobs;
import com.main.onlinejobportal.service.UserService;

@RestController
public class UserController {

	@Autowired
    UserService userService;
	
	@GetMapping("/userDetails")
    public List<User> getUserDetails() {
        return userService.getUserDetails();
	}
	
	@GetMapping("/userDetailsByCompanyId/:{id}")
    public List<User> userDetailsByCompanyId() {
        return userService.getUserDetails();
	}
	@PostMapping("/saveUser")
    public String createUser(@RequestBody User user) {
		return userService.save(user);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId){
        return userService.get(userId);
    }
    
    @GetMapping("/deleteUser/{id}")
    public String getDeleteUserById(@PathVariable(value = "id") Long userId){
        return userService.delete(userId);
    }
    @GetMapping("/getCompanyDetails/{id}")
    public List<UserJobs> getCompanyDetails(@PathVariable(value = "id") Long companyId) {
        return userService.getCompanyDetails(companyId);
	}
}
