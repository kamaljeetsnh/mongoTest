package com.example.mongoTest.entity;

public record CostAllocation(CostAllocationCategoryId costAllocationCategoryId, String categoryName, CostAllocationCategoryValueId costAllocationCategoryValueId,
		String categoryValueName, String categoryValueDescription, String quantity, String isPurchaseOrder, String legacyPomId, String appPomId, String isRequired) { }

