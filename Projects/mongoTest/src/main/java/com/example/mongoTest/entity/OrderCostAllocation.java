package com.example.mongoTest.entity;

import java.util.Set;

public record OrderCostAllocation(int quantity, Set<CostAllocation> costAllocationCategories) { }