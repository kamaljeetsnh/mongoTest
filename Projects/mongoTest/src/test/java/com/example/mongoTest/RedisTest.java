package com.example.mongoTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTest {
	
	@Autowired
	private RedisTemplate<?, ?> redisTemplate;
	
	@Disabled
	@Test
	public void testRedis() {
        // Set a value in Redis
      //  redisTemplate.opsForValue().set("name", "kamaljeet");
        Object value = redisTemplate.opsForValue().get("salary");
        int result = value != null ? value.toString().length() : 0;
        System.out.println("Value: " + result);
	}
}
