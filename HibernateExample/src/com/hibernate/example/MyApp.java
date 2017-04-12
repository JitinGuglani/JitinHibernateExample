package com.hibernate.example;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class MyApp 
{

	Display display;

	Shell shell;




	MyApp()
	{
        Display display = new Display();
		shell = new Shell(display);
		shell.setText("WonderBunch Employee Maintainence");
		shell.setSize(1000, 1000);
		
		Menu menuBar = new Menu(shell, SWT.BAR);
		
		MenuItem	employeeMenu = new MenuItem(menuBar, SWT.CASCADE);
		employeeMenu.setText("Employee");
		Menu employeeSubMenu = new Menu(shell, SWT.DROP_DOWN);
		employeeMenu.setMenu(employeeSubMenu);
		// departmentMenu.setMenu(fileMenu);

		MenuItem addEmployeeMenu = new MenuItem(employeeSubMenu, SWT.PUSH);
		addEmployeeMenu.setText("&Add");

		MenuItem modifyEmployeeMenu = new MenuItem(employeeSubMenu, SWT.PUSH);
		modifyEmployeeMenu.setText("&Modify");
		
		MenuItem deleteEmployeeMenu = new MenuItem(employeeSubMenu, SWT.PUSH);
		deleteEmployeeMenu.setText("&Delete");

		
		MenuItem departmentMenu = new MenuItem(menuBar,SWT.CASCADE);
		departmentMenu.setText("Department");

		Menu departmentSubMenu = new Menu(shell, SWT.DROP_DOWN);
		departmentMenu.setMenu(departmentSubMenu);
		// departmentMenu.setMenu(fileMenu);

		MenuItem addDepartmentMenu = new MenuItem(departmentSubMenu, SWT.PUSH);
		addDepartmentMenu.setText("&Add");

		MenuItem modifyDepartmentMenu = new MenuItem(departmentSubMenu, SWT.PUSH);
		modifyDepartmentMenu.setText("&Modify");
		
		MenuItem deleteDepartmentMenu = new MenuItem(departmentSubMenu, SWT.PUSH);
		deleteDepartmentMenu.setText("&Delete");

		
		addDepartmentMenu.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				// TODO Auto-generated method stub
				AddDepartmentShell ch1 = new AddDepartmentShell(shell);
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
	    addEmployeeMenu.addSelectionListener(new SelectionListener() 
	    {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
		    	AddEmployeeShell ch1 = new AddEmployeeShell(shell);

			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	 //   fileSaveItem.addSelectionListener(new fileSaveItemListener());

	    
	    shell.setMenuBar(menuBar);
	    shell.open();
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch())
	        display.sleep();
	    }
	    display.dispose();

	}

	
	// Child Shell class
	
	
	public static void main(String[] args) 
	{
		MyApp myApp;
		myApp = new MyApp();
		// TODO Auto-generated method stub

//		List<Employee> list1 = new ArrayList<Employee>();
//		List<Employee> list2 = new ArrayList<Employee>();
//		Employee employee1 = new Employee();
//		Employee employee2 = new Employee();
//		Employee employee3 = new Employee();
//		Employee employee4 = new Employee();
//	
//		Address address1 = new Address();
//		Address address2 = new Address();
//		Address address3 = new Address();
//		Address address4  = new Address();
//		
//		address1.setId(1);
//		address1.setStreet("West Patel Nagar");
//		address1.setEmployee(employee1);
//		
//		address2.setId(2);
//		address2.setStreet("Subash Nagar");
//		address2.setEmployee(employee2);
//		
//		address3.setId(3);
//		address3.setEmployee(employee3);
//		address3.setStreet("Paschim Vihar");
//		
//		address4.setId(4);
//		address4.setEmployee(employee3);
//		address4.setStreet("Mayur Vihar Phase 3");
//
//		
//		employee1.setEmpId(1);
//		employee1.setName("Jatin");
//		employee1.setMyAddress(address1);
//
//		List<Phone> phlist1 = new ArrayList<Phone>();
//		Phone phone1 = new Phone();
//		phone1.setNumber("9953910650");
//		phlist1.add(phone1);
//		
//		Phone phone2 = new Phone();
//		phone2.setNumber("9013067246");
//		phlist1.add(phone2);
//		
//		employee1.setPhones(phlist1);
//		
//		
//		employee2.setEmpId(2);
//		employee2.setName("Lakhveer");
//		employee2.setMyAddress(address2);
//		
//		List<Phone> phlist2 = new ArrayList<Phone>();
//
//		Phone phone3 = new Phone();
//		phone3.setNumber("8285020609");
//		phlist2.add(phone3);
//
//		Phone phone4 = new Phone();
//		phone4.setNumber("8287020609");
//		phlist2.add(phone4);
//		employee2.setPhones(phlist2);
//		
//
//		employee3.setEmpId(3);
//		employee3.setName("Divya");
//		employee3.setMyAddress(address3);
//
//		List<Phone> phlist3 = new ArrayList<Phone>();
//
//		Phone phone5 = new Phone();
//		phone5.setNumber("9599911004");
//		phlist3.add(phone5);
//		employee3.setPhones(phlist3);
//		
//		employee4.setEmpId(4);
//		employee4.setName("Venu Saraswaaat");
//		employee4.setMyAddress(address4);
//		
//		List<Phone> phlist4 = new ArrayList<Phone>();
//
//		Phone phone6 = new Phone();
//		phone6.setNumber("1001001010");
//		phlist4.add(phone6);
//		employee4.setPhones(phlist4);
//
//		
//		Department department1 = new Department();
//		Department department2 = new Department();
//		
//		department1.setdeptId(100);
//		department1.setDeptName("Software - Design");
//		
//		department2.setdeptId(102);
//		department2.setDeptName("Software- Coding");
//
//		
//		Project project1 = new Project();
//		project1.setProjId(1);
//		project1.setName("Wonder Bunch--Main Program Coding");
//		list1.add(employee1);
//		list1.add(employee2);
//		project1.setEmployees(list1);
////		project1.getEmployees().add(employee1);
////		project1.getEmployees().add(employee2);
//		
//		Project project2 = new Project();
//		project2.setProjId(2);
//		project2.setName("Wonder Bunch--User Interface");
//		list2.add(employee3);
//		list2.add(employee4);
//		project2.setEmployees(list2);
////		project2.getEmployees().add(employee3);
////		project2.getEmployees().add(employee4);
//		
//	
//		
//		employee1.setDepartment(department1);
//		employee2.setDepartment(department2);
//		employee3.setDepartment(department2);
//		employee4.setDepartment(department2);
//		
//		employee1.getProjects().add(project1);
//		employee2.getProjects().add(project1);
//		employee3.getProjects().add(project2);
//		employee4.getProjects().add(project2);
//		
//		department1.getEmployees().add(employee1);
//		department2.getEmployees().add(employee2);
//		department2.getEmployees().add(employee3);
//		department2.getEmployees().add(employee4);
//		
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SamplePU");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		entityManager.getTransaction().begin();
//
//		entityManager.persist(address1);
//		entityManager.persist(address2);
//		entityManager.persist(address3);
//		entityManager.persist(address4);
//		
//		entityManager.persist(department1);
//		entityManager.persist(department2);
//		
//		entityManager.persist(project1);
//		entityManager.persist(project2);
//
//		entityManager.persist(phone6);
//		entityManager.persist(phone5);
//		entityManager.persist(phone4);
//		entityManager.persist(phone3);
//		entityManager.persist(phone2);
//		entityManager.persist(phone1);
//		
//		
//		entityManager.persist(employee1);
//		entityManager.persist(employee2);
//		entityManager.persist(employee3);
//		entityManager.persist(employee4);
//
//		
//		
//		
//		entityManager.flush();
//		
//		entityManager.getTransaction().commit();
//		
//		
//		
//		
//		System.out.println("Entity Stored");
//		
//		
//		
////		System.out.println("Now printing all records");
////		Query query = entityManager.createQuery("select s from Student s");
////		List<Student> students = query.getResultList();
////		for (Student student01  : students)
////		{
////			System.out.println("Student Id : "+ student01.getStudentId() + "    "+"Student Name :  "+ student01.getStudentFName());
////		}
//		
//		
//		System.out.println("The following data are stored in the tables...");
//		TypedQuery<Employee> query=   entityManager.createNamedQuery("Employee.findAll",Employee.class);
//		List<Employee> list = query.getResultList();
//		System.out.println("Printing Employee details");
//		System.out.println("");
//		for (Employee employee : list)
//		{
//			System.out.println("Id :   "+employee.getEmpId()+" "+"Name :   "+employee.getName());
//			System.out.println();
//		}
//		System.out.println("Bye...");
//		entityManager.close();
//		entityManagerFactory.close();
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SamplePU");
//		EntityManager em = emf.createEntityManager();
//		TypedQuery<Employee> query1=   em.createNamedQuery("Employee.findAll",Employee.class);
//		List<Employee> list11 = query1.getResultList();
//		System.out.println("Printing Employee details");
//		System.out.println("Employee Count :"+ list11.size());
//		
//		for (Employee employee : list11)
//		{
//			System.out.println("Id :   "+employee.getEmpId()+" "+"Name :   "+employee.getName());
//			System.out.println();
//		}
//		System.out.println("Bye...");
//		em.close();
//		emf.close();
//		
//		
//		
	}

}

class AddEmployeeShell 
{

  AddEmployeeShell(Shell parent) 
  {
		Shell child = new Shell(parent);
		child.setSize(1000, 1000);
		child.setText("Add New Employee");

		Label label = new Label(child, SWT.NONE);
		label.setBounds(30, 50, 100, 50);
		label.setText("Employee Name:");

		Text text = new Text(child, SWT.NONE);
		text.setBounds(130, 50, 120, 20);

		
		Button btn = new Button(child, SWT.NONE);
		btn.setText("Edit");
		btn.setBounds(50, 400, 50, 50);

	    	btn.addSelectionListener(new SelectionListener() 
    {
		
		@Override
		public void widgetSelected(SelectionEvent arg0) 
		{
			// TODO Auto-generated method stub
				System.out.println(text.getText());
		}
		
		@Override
		public void widgetDefaultSelected(SelectionEvent arg0) 
		{
		}
	});
    child.open();
  }
}

class AddDepartmentShell 
{

  AddDepartmentShell(Shell parent) 
  {
		Shell child = new Shell(parent);
		child.setSize(1000, 1000);
		child.setText("Add New Department");

		Label label = new Label(child, SWT.NONE);
		label.setBounds(30, 50, 100, 50);
		label.setText("Department Id:");

		Text text = new Text(child, SWT.NONE);
		text.setBounds(130, 50, 120, 20);

		Label label2 = new Label(child, SWT.NONE);
		label2.setBounds(30, 100, 100, 50);
		label2.setText("Department Name:");

		Text text2 = new Text(child, SWT.NONE);
		text2.setBounds(130, 100, 120, 20);
		
		
		
		Button btn = new Button(child, SWT.NONE);
		btn.setText("Add");
		btn.setBounds(50, 400, 50, 50);

	    	btn.addSelectionListener(new SelectionListener() 
    {
		
		@Override
		public void widgetSelected(SelectionEvent arg0) 
		{
			// TODO Auto-generated method stub
				System.out.println(text.getText());
		}
		
		@Override
		public void widgetDefaultSelected(SelectionEvent arg0) 
		{
		}
	});
    child.open();
  }
}





