package com.main.onlinejobportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.onlinejobportal.model.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
