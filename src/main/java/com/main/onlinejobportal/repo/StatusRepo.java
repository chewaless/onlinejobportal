package com.main.onlinejobportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.onlinejobportal.model.Status;

public interface StatusRepo extends JpaRepository<Status, Long>{

}
