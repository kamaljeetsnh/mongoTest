package com.example.mongoTest.entity;

import static java.util.Objects.requireNonNull;

import java.util.UUID;

public record CartId(UUID value) {
	
	public CartId {
		requireNonNull(value);
	}
	
	public CartId(final String value) {
		this(UUID.fromString(value));
	}
	
	public String asString() {
		return value.toString();
	}
}
