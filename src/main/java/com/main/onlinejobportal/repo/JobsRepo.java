package com.main.onlinejobportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.onlinejobportal.model.Jobs;

public interface JobsRepo extends JpaRepository<Jobs, Long>{

}
