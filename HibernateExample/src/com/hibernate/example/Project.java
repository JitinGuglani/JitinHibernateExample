package com.hibernate.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Project 
{
	@Id
	private int projId;
	private String name;
	
	@ManyToMany(mappedBy="projects")
	private List<Employee> employees =new ArrayList<Employee>();
	
	
	
	public List<Employee> getEmployees() 
	{
		return employees;
	}
	public void setEmployees(List<Employee> employees) 
	{
		this.employees = employees;
	}
	public int getProjId() 
	{
		return projId;
	}
	public void setProjId(int projId) 
	{
		this.projId = projId;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	

	
	
	
	
	
}
