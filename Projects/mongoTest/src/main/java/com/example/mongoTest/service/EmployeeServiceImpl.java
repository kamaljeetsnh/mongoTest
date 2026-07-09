package com.example.mongoTest.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.example.mongoTest.entity.Employee;
import com.example.mongoTest.repository.EmployeeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@Autowired
	RedisService redisService;

	public List<Employee> getEmployee(String id) throws JsonProcessingException {
		Query query = new Query();
		query//.addCriteria(Criteria.where("department").in("Narcotic"))
		        .addCriteria(Criteria.where("age").gt("10"))
		        .with(Sort.by(Sort.Direction.DESC, "age"))
		        .with(PageRequest.of(0, 10))
		        .limit(10);
		
		List<Employee> result;
		result = redisService.get("Employee from It Department" + id , Employee.class);
		if (result != null) {
			logger.info("Cache hit for department: {}", id);
			logger.info("Employee details from cache: {}", result);
			return result;
		}else {
		logger.info("Output from Redis Service Query: {}", query);
		 result = mongoTemplate.find(query, Employee.class);
		logger.info("Employee details: {}", result);
		logger.info("Query: {}", query);
		if (result != null) {
			redisService.setValue("Employee from It Department" + id, result, 60L);
			logger.info("Employee details stored in cache for department: {}", id);
		}
		return result;
		}
	}
	
	public List<Employee> getEmployesDetails() {
		List<Employee> result = mongoTemplate.findAll(Employee.class);
		logger.info("Employee details: {}", result);
		return result;
		
	}
	
	public List<Employee> getEmployeeByFreeText(String text) throws JsonProcessingException {
	
		//new TextCriteria();
		logger.info("text bu searching .....: {}", text);
		TextCriteria txtCriteria = TextCriteria.forDefaultLanguage().matching(text);
		Query query = TextQuery.queryText(txtCriteria).sortByScore().with(PageRequest.of(0, 3));
		 List<Employee> result = mongoTemplate.find(query, Employee.class);
		logger.info("Employee details: {}", result);
		logger.info("Query: {}", query);
		return result;
	}

	@Override
	public void insertEmp(Employee emp) {
		emp.setId("emp097");
		emp.setName("Raaaj kisshor Kumar");
		emp.setAge("54");
		emp.setDepartment("Narcotic");
		emp.setDesignation("Director");
		emp.setSalary(880000);
		emp.setEmail("Narcotic.co.in");
		emp.setPhone("9876543210");
		emp.setCreatedAt(java.time.LocalDateTime.now());
		logger.info("Inserting employee: {}", emp);
		logger.info("Employee ID: {}", emp.getId());
		employeeRepository.insert(emp);
	}

	@Override
	public void updateEmp(String deg) {
		
		 Query query = new Query(
	                Criteria.where("_id").is("emp008"));
		 
		 Update update = new Update()
	                .set("designation", deg);
		 logger.info("Updating employee with ID emp008 to designation: {}", deg);
		 logger.info("Query: {}", query);

	        mongoTemplate.updateFirst(
	                query,
	                update,
	                Employee.class
	        );
	}

	@Override
	public void deleteEmp(String string) {
		Query query = new Query(Criteria.where("_id").is(string));
		logger.info("Deleting employee with ID: {}", string);
		logger.info("Query: {}", query);
		mongoTemplate.remove(query, Employee.class);
	}

}
