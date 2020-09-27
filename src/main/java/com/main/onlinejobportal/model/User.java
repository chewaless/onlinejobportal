package com.main.onlinejobportal.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long user_id;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name ="last_name")
	private String last_name;
	
	@Column(name = "user_name")
	private String user_name;

	@Column(name = "password")
	private String password;

	@Column(name = "email_id")
	private String email_id;
	
	@Column(name = "role")
	private String role;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
	
	@Column(name="active")
	private int active;
	
	@ManyToMany
    @JoinTable (
       name="user_job",
       joinColumns = {@JoinColumn(name="user_id", nullable = false, updatable = false)},
       inverseJoinColumns = {@JoinColumn(name="job_id" )}
    )
	private Set<Jobs> joblists = new HashSet<Jobs>();
	
	public User(String username, String password, String role) {
		this.user_name = username;
		this.password = password;
		this.role = role;
		
	}

	public User() {
	
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String username) {
		this.user_name = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String firstName) {
		this.first_name = firstName;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String lastName) {
		this.last_name = lastName;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public Set<Jobs> getJoblists() {
		return joblists;
	}

	public void setJoblists(Set<Jobs> joblists) {
		this.joblists = joblists;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

}