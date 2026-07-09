package com.example.mongoTest.service;

import java.util.List;

import com.example.mongoTest.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface EmployeeService {
	
	public List<Employee> getEmployee(String id) throws JsonProcessingException;
	
	public List<Employee> getEmployeeByFreeText(String id) throws JsonProcessingException;

	public void insertEmp(Employee emp);

	public void updateEmp(String deg);

	public void deleteEmp(String string);

	public List<Employee> getEmployesDetails();
}
