package com.example.mongoTest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongoTest.entity.Employee;
import com.example.mongoTest.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MongoController {
	
	@Autowired
	EmployeeService employeeService;
	
	MongoController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	@GetMapping("/home")
	public List<Employee> getEmployee() throws JsonProcessingException {
		List<Employee> emp = new ArrayList<>();
		emp = employeeService.getEmployee("@example.com");
		//Logger.info("Employee details: {}", emp);
		return emp;
	}
	
	@GetMapping("/listOfEmp")
	public List<Employee> getEmployesDetails() throws JsonProcessingException {
		List<Employee> emp = new ArrayList<>();
		emp = employeeService.getEmployesDetails();
		System.out.println("Employee details: "+  emp);
		return emp;
	}
	
	@GetMapping("/freeTextSearch")
	public List<Employee> getEmployeeByFreeText() throws JsonProcessingException {
		List<Employee> emp = new ArrayList<>();
		emp = employeeService.getEmployeeByFreeText("Management");
		//Logger.info("Employee details: {}", emp);
		return emp;
	}
	
	@PostMapping("/addEmp")
	public String addEmployee() {

		
		  Employee emp = new Employee();
		  /*
		 *  emp.setId("emp009");
		 * emp.setName("Hari kumar"); emp.setAge("66"); emp.setDepartment("IT");
		 * emp.setDesignation("CEO"); emp.setSalary(3000000);
		 */
		employeeService.insertEmp(emp);
		
	//	Employee emp5 = new Employee();
//		emp5.setId("emp005");
	//	emp5.setName("kishor raj");
	//	emp5.setAge("33");
	//	emp5.setDepartment("IT");
	//	emp5.setDesignation("Software");
	//	emp5.setSalary(22000);
	//	employeeService.insertEmp(emp5);
		
	//	Employee emp1 = new Employee();
	//	emp1.setId("emp006");
	//	emp1.setName("laxman kumar");
	//	emp1.setAge("31");
	//	emp1.setDepartment("IT");
	//	emp1.setDesignation("Software developer");
	//	emp1.setSalary(90000);
	//	employeeService.insertEmp(emp1);
		
//		Employee emp2 = new Employee();
//		emp2.setId("emp007");
//		emp2.setName("Kamaljeet");
//		emp2.setAge("38");
//		emp2.setDepartment("IT");
//		emp2.setDesignation("Senior Software");
//		emp2.setSalary(5550000);
//		employeeService.insertEmp(emp2);
		
//		Employee emp3 = new Employee();
//		emp3.setId("emp008");
//		emp3.setName("Umesh Kumar");
//		emp3.setAge("28");
//		emp3.setDepartment("IT");
//		emp3.setDesignation("Software Developer IT");
//		emp3.setSalary(20000);
//		employeeService.insertEmp(emp3);
		return "Employee Added Successfully";
	}
	
	@PutMapping("/updateEmp")
	public String updateEmployee() {
		employeeService.updateEmp("Software Engineer");

		return "Employee Updated Successfully";
	}
	
	@DeleteMapping("/deleteEmp")
	public String deleteEmployee() {
		employeeService.deleteEmp("emp008");

		return "Employee Deleted Successfully";
	}
}
