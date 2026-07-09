package com.example.mongoTest.entity;

public class CartItemRequestedBy {
	
	private String userId;
	private boolean leaf;

	public CartItemRequestedBy() {
		super();
	}

	public CartItemRequestedBy(String userId, boolean leaf) {
		super();
		this.userId = userId;
		this.leaf = leaf;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("{userId=");
		builder.append(getUserId());
		builder.append(",leaf=");
		builder.append(isLeaf());
		builder.append("}");
		return builder.toString();
	}
}
