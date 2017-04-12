package com.hibernate.example;

import java.util.*;

import javax.persistence.*;

@Entity
public class Department 
{
	@Id
	private int deptId;

	@OneToMany(mappedBy="department")
	private List<Employee> employees = new ArrayList<Employee>();
	
	private String deptName;
	
	

	Department()
	{
		
	}
	public String getDeptName()
	{
		return deptName;
	}
	
	public void  setDeptName(String n)
	{
		deptName = n;
	}
	
	public int getdeptId()
	{
		return deptId;
	}
	public void setdeptId(int id)
	{
		deptId = id;
	}
	
	public void setEmployees(Employee e)
	{
		employees.add(e);
	}
	
	public List<Employee> getEmployees()
	{
		return employees;
	}
	
}
