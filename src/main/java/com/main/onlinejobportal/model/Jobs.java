package com.main.onlinejobportal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "jobs")
public class Jobs {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "job_id", unique=true, nullable = false)
	private Long job_id;
	
	@Column(name = "job_name")
	private String job_name;
	
	
	@Column(name = "job_desc")
	private String job_desc;
	
	@Column(name = "posted_date")
	private Date posted_date;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
	
	@Column(name="active")
	private int active;
	
	/*@ManyToMany(mappedBy="userlists") 
	private Set<User> users;*/

	public Jobs(){
		
	}
	
	public Long getJob_id() {
		return job_id;
	}

	public void setJob_id(Long job_id) {
		this.job_id = job_id;
	}

	/*public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}*/

	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	public String getJob_name() {
		return job_name;
	}

	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}

	public String getJob_desc() {
		return job_desc;
	}

	public void setJob_desc(String job_desc) {
		this.job_desc = job_desc;
	}

	public Date getPosted_date() {
		return posted_date;
	}

	public void setPosted_date(Date posted_date) {
		this.posted_date = posted_date;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	
}
