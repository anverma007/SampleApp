package com.mindtree.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest {
	
	Project project;
	List<Employee> employeeList;
	
	@Before
	public void setup() {
		
		project = new Project();
		
		employeeList = new ArrayList<Employee>();
		
		project.setProjectId(123);
		project.setProjectName("xyz");
		project.setEmployeeList(employeeList);
		
		project.toString();
	}
	
	@Test
	public void getProjectIdTest() {
		int id = project.getProjectId();
		assertNotNull(id);
		
	}
	@Test
	public void getProjectName() {
		String pname = project.getProjectName();
		assertNotNull(pname);
	}
	
	@Test
	public void getEmployeeListTest() {
		List<Employee> empList = project.getEmployeeList();
		assertEquals(employeeList, empList);
	}

}
