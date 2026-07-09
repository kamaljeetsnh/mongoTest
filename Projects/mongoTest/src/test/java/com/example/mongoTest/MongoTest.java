package com.example.mongoTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mongoTest.entity.Employee;
import com.example.mongoTest.repository.EmployeeRepository;

@SpringBootTest
public class MongoTest {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	//@Test
	public void createEmployee() {
		Employee emp = new Employee();
		emp.setId("emp001");
		emp.setName("John Doe");
		emp.setAge("30");
		emp.setDepartment("IT");
		emp.setDesignation("Software Engineer");
		emp.setSalary(60000);
			
		
		employeeRepository.insert(emp);	}
	
	@Test
	public void contextLoads() {
		employeeRepository.findAll().forEach(System.out::println);
	}
	
	@Test
	public void testFindById() {
	System.out.println("Employye Name "+ employeeRepository.findById("123").orElse(null).getName().toString());
	}
}
