package com.example.mongoTest.entity;

import static java.util.Objects.requireNonNull;

public record CostAllocationCategoryValueId(Integer value) {
	
	public CostAllocationCategoryValueId {
		requireNonNull(value);
	}
	
	public CostAllocationCategoryValueId(Long value) {
		this(value.intValue());
	}
	
	public String asString() {
		return value.toString();
	}
	
	public Long asLong() {
		return value.longValue();
	}
}

