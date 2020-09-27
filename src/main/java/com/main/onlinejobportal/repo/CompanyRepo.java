package com.main.onlinejobportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.onlinejobportal.model.Company;

public interface CompanyRepo extends JpaRepository<Company, Long>{

}
