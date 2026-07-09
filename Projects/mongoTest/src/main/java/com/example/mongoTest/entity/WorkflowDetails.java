package com.example.mongoTest.entity;

import java.util.ArrayList;
import java.util.List;

public class WorkflowDetails {
	private List<CartItemRequestedBy> requestedBy = new ArrayList<>();
	
	public WorkflowDetails() {
		super();
	}

	public WorkflowDetails(List<CartItemRequestedBy> requestedBy) {
		super();
		this.requestedBy = requestedBy;
	}

	public List<CartItemRequestedBy> getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(List<CartItemRequestedBy> requestedBy) {
		this.requestedBy = requestedBy;
	}
	
	public String toString() {
		StringBuilder builder=new StringBuilder("{requestedBy=");
		builder.append(getRequestedBy());	
		builder.append("}");
		return builder.toString();	
	}
}
