package com.main.onlinejobportal.model;

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
@Table(name = "user_job")
public class UserJobs {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "user_job_id", unique=true, nullable = false)
	private int user_job_id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "job_id")
	private Jobs jobs;
	
	@ManyToOne
	@JoinColumn(name = "status_id")
	private Status status;
	
	@Column(name="active")
	private int active;
	
	public UserJobs(){
		
	}

	public int getUser_job_id() {
		return user_job_id;
	}

	public void setUser_job_id(int user_job_id) {
		this.user_job_id = user_job_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Jobs getJobs() {
		return jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	/*public Set<User> getUserlists() {
		return userlists;
	}

	public void setUserlists(Set<User> userlists) {
		this.userlists = userlists;
	}

	public Set<Jobs> getJoblists() {
		return joblists;
	}

	public void setJoblists(Set<Jobs> joblists) {
		this.joblists = joblists;
	}*/
}
