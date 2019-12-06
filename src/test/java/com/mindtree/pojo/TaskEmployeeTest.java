package com.mindtree.pojo;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class TaskEmployeeTest {

	TaskEmployee taskEmployee;
	
	@Before
	public void setup() {
		taskEmployee = new TaskEmployee();
		
		taskEmployee.setId(1);
		taskEmployee.setName("name");
		
		taskEmployee.toString();
	}
	
	@Test
	public void getIdTest() {
		int id = taskEmployee.getId();
		assertNotNull(id);
	}
	
	@Test
	public void getNameTest() {
		String name = taskEmployee.getName();
		assertNotNull(name);
	}
	
	
}

