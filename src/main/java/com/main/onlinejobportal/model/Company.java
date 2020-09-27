package com.main.onlinejobportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="company_id")
	private Long company_id;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="company_desc")
	private String company_desc;
	
	@Column(name="company_address")
	private String company_address;
	
	@Column(name="active")
	private int active;
	
	public Company(){
		
	}

	public Long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_desc() {
		return company_desc;
	}

	public void setCompany_desc(String company_desc) {
		this.company_desc = company_desc;
	}

	public String getCompany_address() {
		return company_address;
	}

	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	
}
