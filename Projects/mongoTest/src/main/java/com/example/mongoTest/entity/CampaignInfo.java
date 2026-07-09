package com.example.mongoTest.entity;

public class CampaignInfo {

	private String code;
	private String campaignReferenceNumber;
	private String description;
	private String campaignMessage;
	private String campaignType;
	private boolean promoInstantOffer;
	private boolean autoPromo;

	public CampaignInfo(String code, String campaignReferenceNumber, String description, String campaignMessage,
			String campaignType) {
	    this(code, campaignReferenceNumber, description, campaignMessage, campaignType, false);
	}
	
	public CampaignInfo(String code, String campaignReferenceNumber, String description, String campaignMessage,
			String campaignType, boolean promoInstantOffer) {
		this.code = code;
		this.campaignReferenceNumber = campaignReferenceNumber;
		this.description = description;
		this.campaignMessage = campaignMessage;
		this.campaignType = campaignType;
		this.setPromoInstantOffer(promoInstantOffer);
	}

	public CampaignInfo() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCampaignReferenceNumber() {
		return campaignReferenceNumber;
	}

	public void setCampaignReferenceNumber(String campaignReferenceNumber) {
		this.campaignReferenceNumber = campaignReferenceNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCampaignMessage() {
		return campaignMessage;
	}

	public void setCampaignMessage(String campaignMessage) {
		this.campaignMessage = campaignMessage;
	}

	public String getCampaignType() {
		return campaignType;
	}

	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}
	
	/**
	 * @return the promoInstantOffer
	 */
	public boolean isPromoInstantOffer() {
		return promoInstantOffer;
	}

	/**
	 * @param promoInstantOffer the promoInstantOffer to set
	 */
	public void setPromoInstantOffer(boolean promoInstantOffer) {
		this.promoInstantOffer = promoInstantOffer;
	}
	
	@Override	
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append("{code=");
		builder.append(getCode());
		builder.append(",");
		builder.append("campaignReferenceNumber=");
		builder.append(getCampaignReferenceNumber());
		builder.append("}");
		return builder.toString();
	}

	public boolean isAutoPromo() {
		return autoPromo;
	}

	public void setAutoPromo(boolean autoPromo) {
		this.autoPromo = autoPromo;
	}
}
