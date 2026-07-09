package com.example.mongoTest.entity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface Cart extends Identifiable<CartId> {
	Version version();
	ZonedDateTime createdAt();
	ZonedDateTime lastModifiedAt();
	String anonymousId();
	BigDecimal totalPrice();
	String cartState();
	int numberofItems();
	
	String cartType();
	BigDecimal subtotalWithSavings();
	BigDecimal subtotalWithoutSavings();
	Optional<OrderCostAllocation> orderCostAllocation();
	
	String shipOrderNumber();
	String attentionTo();
	
	boolean isConsolidated();
	String consolidateLocation();
	
	boolean isCommercial();
	boolean isGovernment();
	
	Set<CampaignInfo> promotions();
	
	Optional<Payment> payment();
	
	List<LineItem> lineItems();
	List<AdditionalLineCharge> additionalCharges();
	Optional<LineItem> lineItemOf(LineItemId id);
	Optional<Address> shippingAddress();
	Optional<Address> billingAddress();
	
	String bpoVersion();
	String carrierAccountNumber();
	String carrierName();
	String carrierPhone();
	String customerIpAddress();
	String evendCartNum();
	String enhancedGuestCheckoutEmail();
	String exportFlag();
	String cartStatus();
	String legacyUltimateDestinationId();
	String customerPoNumber();
	String appPomId();
	String cartName();
	String cartDescription();
	String ultimateAddress();
	String emailIds();
	String fingerprintid();
	String poRelease();
	String purchaseOrderApplied();
	String wfCartStatus();
	String wfApproverId();
	String shipToAddress();
	String wfAppproverDetails();
	String requestorNotes();
	String rejectionNotes();
	String wfCartSubmittedAt();
	String customCartId();
	String guestPhoneNumber();
	String customerQuoteReference();
	String quoteStatus();
	String quoteType();
	String quoteLocked();
	String quoteUnderReview();
	String quoteComments();
	List<String> wfRejectedCartIds();
	String guestIdentifier();
	Set<String> workflowForward();
	String solutionCart();
	String contactRegistrationType();
	String marketChannel();
	String userName();
	String releaseNumber();
	String evmiBranchId();
	String avmiError();
	String abandonedCartId();
	String externalCreationDate();
	String expiryDate();
	String createdAtCustom();
	String costallocShopCartChosen();	
	boolean avmicart();
	boolean m1allowed();
	boolean contactTruckShip();
	boolean poCheckboxDefault();
	boolean hasItemPom();
	boolean shared();
	Long shippingScenario();
	Long purchaseOrderId();
	Long universalPurchaseOrderId();
	Long legacyQuoteID();
	BigDecimal totalTax();
	BigDecimal savings();
	BigDecimal shippingCharge();
	String customerEmail();
	String paymentReferenceNumber();
	String zipCodeForEstimate();
	List<LineItem> saveForLaterLineItems();
	String ctShippingAddressId();
}

