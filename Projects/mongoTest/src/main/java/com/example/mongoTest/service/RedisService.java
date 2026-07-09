package com.example.mongoTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.example.mongoTest.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RedisService {
	
	@Autowired
	RedisTemplate<String, String> redisTemplate;
	
	public <T> List<Employee> get(String key, Class<T> entity) throws JsonProcessingException {
		try {
			
			Object value = redisTemplate.opsForValue().get(key);
			ObjectMapper mapper = new ObjectMapper();
			mapper.registerModule(new JavaTimeModule());
			//mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			mapper.readValue(value.toString(), Employee.class);
			return (List<Employee>) mapper.readValue(value.toString(), entity);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void setValue(String key, Object value, Long tt) throws JsonProcessingException {
		try {
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		String jsonValue = mapper.writeValueAsString(value);
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		redisTemplate.opsForValue().set(key, jsonValue, tt , java.util.concurrent.TimeUnit.SECONDS);
		}
		catch (JsonProcessingException e) {
			//log.error("Error converting object to JSON: {}", e.getMessage());
			throw e;
		}
	}

}
