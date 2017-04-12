package com.hibernate.example;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone 
{

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String number;
	@ManyToOne(fetch= FetchType.LAZY)
	Employee employee;
	public Employee getEmployee() 
	{
		return employee;
	}
	public void setEmployee(Employee employee) 
	{
		this.employee = employee;
	}
	public String getNumber() 
	{
		return number;
	}
	public void setNumber(String number) 
	{
		this.number = number;
	}
	Phone()
	{
		
	}

}
