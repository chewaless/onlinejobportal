package com.main.onlinejobportal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.main.onlinejobportal.model.UserJobs;

public interface UserJobsRepo extends JpaRepository<UserJobs, Integer>{

	@Query(value = "select * from user_job s where s.job_id = ?1", nativeQuery = true)
	List<UserJobs> getUsersByJobId(Long job_id);
	@Query(value = "select s.* from user_job s, jobs j where s.job_id=j.job_id and j.company_id = ?1", nativeQuery = true)
	List<UserJobs> getCompanyByCompantId(Long company_id);
}
