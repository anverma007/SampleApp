package com.mindtree.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	Employee employee;
	Project project;
	Date date;
	
	
	@Before
	public void setup() {
		date = new Date();
		
		
		
		project = new Project();
		employee = new Employee();
		employee.setEmpId(1);
		employee.setName("xyz");
		employee.setProject(project);
		employee.setTaskDescription("description");
		employee.setEndDate(date);
		employee.setStartDate(date);
		employee.toString();
	}
	
	@Test
	public void getEmpIdTest() {
		int id = employee.getEmpId();
		assertNotNull(id);
	}

	@Test
	public void getNameTest() {
		String name = employee.getName();
		assertNotNull(name);
	}
	
	@Test
	public void getProjectTest() {
		Project project1 = employee.getProject();
		assertEquals(project, project1);
	}
	
	@Test
	public void getTaskDescriptionTest() {
		String dec = employee.getTaskDescription();
		assertNotNull(dec);
	}
	
	@Test
	public void getStartDateTest() {
		Date startDate = employee.getStartDate();
		assertEquals(date, startDate);
	}
	
	@Test
	public void getEndDateTest() {
		Date endDate = employee.getEndDate();
		assertEquals(date, endDate);
	}	
}
















