package com.example.mongoTest.entity;

public class CustomBundleInfo {
	
	private String bundleId;
	private int bundleSequence;
	public String getBundleId() {
		return bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public int getBundleSequence() {
		return bundleSequence;
	}
	public void setBundleSequence(int bundleSequence) {
		this.bundleSequence = bundleSequence;
	}
	public int getBundleSize() {
		return bundleSize;
	}
	public void setBundleSize(int bundleSize) {
		this.bundleSize = bundleSize;
	}
	private int bundleSize;
	

}

