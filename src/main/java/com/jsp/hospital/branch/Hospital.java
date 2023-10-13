package com.jsp.hospital.branch;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	
	@OneToMany
	private List<HospitalBranch> branches;
	
	
	// Id
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Name
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	// Branch
	
	public List<HospitalBranch> getBranches() {
		return branches;
	}

	public void setBranches(List<HospitalBranch> branches) {
		this.branches = branches;
	}
	
	

}
