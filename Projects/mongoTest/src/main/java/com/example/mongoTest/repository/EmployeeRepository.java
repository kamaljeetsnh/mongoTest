package com.example.mongoTest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongoTest.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
