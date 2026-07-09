package com.example.mongoTest.entity;

public class Payment {
	
	private static final String EMPTY_STRING = "";

	private String paymentTerm;
	private String tokenId;
	private String purchaseCardReferenceNumber;
	private int expiryMonth;
	private int expiryYear;
	private String cardType;
	private String maskedNumber;
	private boolean isDefault;
	private boolean isOwner;
	private boolean isShared;
	private String nameOnTheCard;
	private String nickname;
	private Long xrefPolicyId;
	private Long xrefRecordId;
	
	public String getPaymentTerm() {
		return paymentTerm;
	}

	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

	public String getPurchaseCardReferenceNumber() {
		return purchaseCardReferenceNumber;
	}

	public void setPurchaseCardReferenceNumber(String purchaseCardReferenceNumber) {
		this.purchaseCardReferenceNumber = purchaseCardReferenceNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getMaskedNumber() {
		return maskedNumber;
	}

	public void setMaskedNumber(String maskedNumber) {
		this.maskedNumber = maskedNumber;
	}

	public boolean getIsDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public boolean getIsOwner() {
		return isOwner;
	}

	public void setOwner(boolean isOwner) {
		this.isOwner = isOwner;
	}

	public boolean getIsShared() {
		return isShared;
	}

	public void setShared(boolean isShared) {
		this.isShared = isShared;
	}

	public String getNameOnTheCard() {
		return nameOnTheCard;
	}

	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Long getXrefPolicyId() {
		return xrefPolicyId;
	}

	public void setXrefPolicyId(Long xrefPolicyId) {
		this.xrefPolicyId = xrefPolicyId;
	}

	public Long getXrefRecordId() {
		return xrefRecordId;
	}

	public void setXrefRecordId(Long xrefRecordId) {
		this.xrefRecordId = xrefRecordId;
	}

	public Payment() {
		super();
	}
}

	/*
	 * public Payment(CreditCardInfo defaultCreditCardInfo) { cardType =
	 * Optional.ofNullable(defaultCreditCardInfo.getCardType().name()).orElse(
	 * EMPTY_STRING); expiryMonth =
	 * Integer.parseInt(Optional.ofNullable(defaultCreditCardInfo.getExpiryMonth()).
	 * orElse("0")); expiryYear =
	 * Integer.parseInt(Optional.ofNullable(defaultCreditCardInfo.getExpiryYear()).
	 * orElse("0")); maskedNumber =
	 * Optional.ofNullable(defaultCreditCardInfo.getMaskedNumber()).orElse(
	 * EMPTY_STRING); nameOnTheCard =
	 * Optional.ofNullable(defaultCreditCardInfo.getNameOnTheCard()).orElse(
	 * EMPTY_STRING); nickname =
	 * Optional.ofNullable(defaultCreditCardInfo.getNickname()).orElse(EMPTY_STRING)
	 * ; tokenId =
	 * Optional.ofNullable(defaultCreditCardInfo.getTokenId()).orElse(EMPTY_STRING);
	 * xrefPolicyId = defaultCreditCardInfo.getXrefPolicyId(); xrefRecordId =
	 * defaultCreditCardInfo.getXrefRecordId(); isOwner =
	 * defaultCreditCardInfo.isOwner(); isShared = defaultCreditCardInfo.isShared();
	 * }
	 */

