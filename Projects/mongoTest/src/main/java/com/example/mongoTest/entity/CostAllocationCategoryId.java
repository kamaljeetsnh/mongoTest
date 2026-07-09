package com.example.mongoTest.entity;

import static java.util.Objects.requireNonNull;

public record CostAllocationCategoryId(Integer value) {
	
	public CostAllocationCategoryId {
		requireNonNull(value);
	}
	
	public CostAllocationCategoryId(Long value) {
		this(value.intValue());
	}
	
	public String asString() {
		return value.toString();
	}
	
	public Long asLong() {
		return value.longValue();
	}
}
