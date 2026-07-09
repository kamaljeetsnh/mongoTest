package com.example.mongoTest.entity;

import static java.util.Objects.requireNonNull;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public enum TruckShipMethodTypes {
	
	COLLECT("C", "10" , "TRUCK_COLLECT"),
	PREPAID("P", "11", "TRUCK_PREPAID"),
	PICKUP("W", "21", "TRUCK_PICKUP");
	
	private static final Lookup<String, TruckShipMethodTypes> LOOK_UP_TYPE =
		new Lookup<>(Stream.of(values()).collect(
			Collectors.toUnmodifiableMap(
				TruckShipMethodTypes::getType,
				Function.identity()
			)
		));
	
	private static final Lookup<String, TruckShipMethodTypes> LOOK_UP_CODE =
		new Lookup<>(Stream.of(values()).collect(
			Collectors.toUnmodifiableMap(
				TruckShipMethodTypes::getCode,
				Function.identity()
			)
		));
	
	public static Optional<TruckShipMethodTypes> lookupByType(final String type) {
		requireNonNull(type);
		return LOOK_UP_TYPE.apply(type);
	}
	
	public static Optional<TruckShipMethodTypes> lookupByCode(final String code) {
		requireNonNull(code);
		return LOOK_UP_CODE.apply(code);
	}
	
	TruckShipMethodTypes(final String type, final String code, final String description) {
		this.type = Objects.requireNonNull(type);
		this.code = Objects.requireNonNull(code);
		this.description = Objects.requireNonNull(description);
	}
	
	private String type;
	private String code;
	private String description;
	
	public String getType() {
		return type;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
}

