package com.mindtree.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TasksTest {
	
	Tasks tasks;
	Date date;
	List<TaskEmployee> listTaskEmployee;
	
	@Before
	public void setup() {
		listTaskEmployee = new ArrayList<TaskEmployee>();
		
		date = new Date();
		
		tasks = new Tasks();
		
		tasks.setProjectName("projectName");
		tasks.setTaskDescription("taskDescription");
		tasks.setEndTask(date);
		tasks.setStartTask(date);
		tasks.setListTaskEmployee(listTaskEmployee);
		
		tasks.toString();
		
	}
	
	@Test
	public void getProjectNameTest() {
		String pname = tasks.getProjectName();
		assertNotNull(pname);
	}
	
	@Test
	public void getTaskDescriptionTest() {
		String desc = tasks.getTaskDescription();
		assertNotNull(desc);
	}
	
	@Test
	public void getStartTask() {
		Date sdate = tasks.getStartTask();
		assertEquals(date, sdate);
	}
	
	@Test
	public void getEndTask() {
		Date edate = tasks.getEndTask();
		assertEquals(date, edate);
	}
	
	@Test
	public void getListTaskEmployee() {
		List<TaskEmployee> listTask = tasks.getListTaskEmployee();
		assertEquals(listTaskEmployee, listTask);
	}

}
