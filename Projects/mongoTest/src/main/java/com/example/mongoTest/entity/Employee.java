package com.example.mongoTest.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Data;

@Data 
@Builder
@Document(collection = "Employee-Details")
public class Employee {
	@Id
	private String id;
	private String name;
	private String age;
	@TextIndexed(weight = 2)
	private String department;
	@TextIndexed
	private String designation;
	private int salary;
	@TextIndexed
	private String email;
	private String phone;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createdAt;
	
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Employee(String id, String name, String age, String department, String designation, int salary, String email,
			String phone, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
		this.email = email;
		this.phone = phone;
		this.createdAt = createdAt;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}

