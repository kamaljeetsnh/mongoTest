package com.example.mongoTest.entity;

public record Version(long value) {
	public Version {
		if (value < 0) {
			throw new IllegalStateException("Version number may not be less than 0.");
		}
	}
}