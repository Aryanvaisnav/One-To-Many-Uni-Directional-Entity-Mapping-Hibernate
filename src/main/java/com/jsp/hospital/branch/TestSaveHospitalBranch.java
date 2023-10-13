package com.jsp.hospital.branch;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitalBranch {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Hospital hospital = new Hospital();
		hospital.setName("Ashoka");
		
		HospitalBranch branch1 = new HospitalBranch();
		branch1.setCapacity(400);
		branch1.setCity("Mumbai");
		branch1.setState("Maharashtra");
		branch1.setCountry("India");
		
		HospitalBranch branch2 = new HospitalBranch();
		branch2.setCapacity(350);
		branch2.setCity("Banglore");
		branch2.setState("Karnataka");
		branch2.setCountry("India");
		
		HospitalBranch branch3 = new HospitalBranch();
		branch3.setCapacity(180);
		branch3.setCity("Bhopal");
		branch3.setState("Madhya Pradesh");
		branch3.setCountry("India");
		
		ArrayList<HospitalBranch> branches = new ArrayList<>();
		branches.add(branch1);
		branches.add(branch2);
		branches.add(branch3);
		
		hospital.setBranches(branches);
		
		
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
		

	}

}
