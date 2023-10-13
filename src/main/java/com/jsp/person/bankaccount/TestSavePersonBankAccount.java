package com.jsp.person.bankaccount;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonBankAccount {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("ABC");
		person.setEmail("abc@gmail.com");
		person.setCno(99273527262272l);
		person.setGender("Male");
		
		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.setBank_name("Axis");
		bankAccount1.setAcc_no(9647392756l);
		bankAccount1.setIfsc_code("Axis7365373");
		
		
		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.setBank_name("SBI");
		bankAccount2.setAcc_no(2639106485l);
		bankAccount2.setIfsc_code("SBI1736534233");
		
		
		BankAccount bankAccount3 = new BankAccount();
		bankAccount3.setBank_name("PNB");
		bankAccount3.setAcc_no(8365920475l);
		bankAccount3.setIfsc_code("PNB13653733");
		
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(bankAccount3);
		accounts.add(bankAccount2);
		accounts.add(bankAccount1);
		
		person.setAccounts(accounts);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(bankAccount1);
		entityManager.persist(bankAccount2);
		entityManager.persist(bankAccount3);
		entityTransaction.commit();
		
		

	}

}
