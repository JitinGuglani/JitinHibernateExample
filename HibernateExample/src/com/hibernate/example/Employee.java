package com.hibernate.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@NamedQuery(name="Employee.findAll",query="select e from Employee e")

@Entity
public class Employee 
{
	@Id
	private int empId;
	@ManyToOne
	private Department department;
	@OneToOne
	private Address myAddress;
	@OneToMany
	private List<Phone> phones;

	@ManyToMany
//    	@JoinTable(name="employee_project",joinColumns=@JoinColumn(name="employee_empid"),inverseJoinColumns=@JoinColumn(name="project_projid"))
	private List<Project> projects = new ArrayList<Project>();
	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Phone> getPhones() 
	{
		return phones;
	}

	public void setPhones(List<Phone> phones) 
	{
		this.phones = phones;
	}

	
	public int getEmpId() 
	{
		return empId;
	}

	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}
	private String name;
	
	public Address getMyAddress() 
	{
		return myAddress;
	}

	public void setMyAddress(Address myAddress) 
	{
		this.myAddress = myAddress;
	}
	
	
	
	Employee()
	{
		
	}

	public String getName()
	{
		return name;
	}
	public void  setName(String n)
	{
		name = n;
	}
	public void setDepartment(Department d)
	{
		department = d;
	}
	public Department getDepartment()
	{
		return department;
	}
}

