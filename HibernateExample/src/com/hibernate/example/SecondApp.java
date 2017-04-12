package com.hibernate.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SecondApp {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SamplePU");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Employee> query1=   em.createNamedQuery("Employee.findAll",Employee.class);
		List<Employee> list11 = query1.getResultList();
		System.out.println("Printing Employee details");
		System.out.println("Employee Count :"+ list11.size());
		
		for (Employee employee : list11)
		{
			System.out.println("Id :   "+employee.getEmpId()+" "+"Name :   "+employee.getName());
			System.out.println();
		}
		System.out.println("Bye...");
		em.close();
		emf.close();

	}

}
