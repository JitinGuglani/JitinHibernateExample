package com.hibernate.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Student 
{
	@Id
	private int studentId;
	private String StudentFName;

	Student()
	{
	}

	public int getStudentId()
	{
		return studentId;
	}

	public void setStudentId(int id)
	{
		studentId = id;
	}
	
	public String getStudentFName()
	{
		return StudentFName;
	}
	public void setStudentFName(String fname)
	{
		StudentFName = fname;
	}
}
