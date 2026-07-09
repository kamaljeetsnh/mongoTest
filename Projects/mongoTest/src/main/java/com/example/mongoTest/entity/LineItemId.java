package com.example.mongoTest.entity;

import static java.util.Objects.requireNonNull;

import java.util.UUID;

public record LineItemId(UUID value) {
	
	public LineItemId {
		requireNonNull(value);
	}
	
	public String asString() {
		return value.toString();
	}
}

