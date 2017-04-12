package com.hibernate.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test 
{
	@Id
	private int id;
	
	List<Test> testChild = new ArrayList<Test>();

	public List<Test> getTestChild() 
	{
		return testChild;
	}

	public void setTestChild(List<Test> testChild) 
	{
		this.testChild = testChild;
	}
	
	
}
