package com.example.mongoTest.entity;

public interface AdditionalLineCharge extends Identifiable<LineItemId> {
	
	String slug();
	Long quantity();
	String name();
	//TypedMoney money();

}