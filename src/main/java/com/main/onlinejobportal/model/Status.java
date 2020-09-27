package com.main.onlinejobportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "status")
public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "status_id", unique = true)
	private long status_id;

	@Column(name = "status")
	private String status;

	@Column(name="active")
	private int active;

	public long getStatus_id() {
		return status_id;
	}

	public void setStatus_id(long status_id) {
		this.status_id = status_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	
}
