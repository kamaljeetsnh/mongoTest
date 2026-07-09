package com.example.mongoTest.entity;

public class WorkflowSourceCartItem {
	
	private String srcCartId;
	private String srcCartItemId;
	
	public WorkflowSourceCartItem() {
		super();
	}

	public WorkflowSourceCartItem(String srcCartId, String srcCartItemId) {
		super();
		this.srcCartId = srcCartId;
		this.srcCartItemId = srcCartItemId;
	}

	public String getSrcCartId() {
		return srcCartId;
	}

	public void setSrcCartId(String srcCartId) {
		this.srcCartId = srcCartId;
	}

	public String getSrcCartItemId() {
		return srcCartItemId;
	}

	public void setSrcCartItemId(String srcCartItemId) {
		this.srcCartItemId = srcCartItemId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{srcCartId=");
		builder.append(getSrcCartId());
		builder.append(",");
		builder.append("srcCartItemId=");
		builder.append(getSrcCartItemId());
		builder.append("}");
		return builder.toString();
	}
}

