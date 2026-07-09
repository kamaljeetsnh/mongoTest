package com.example.mongoTest.entity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;


public interface LineItem extends Identifiable<LineItemId> {
	
	String basePartNumber();
	ZonedDateTime lastModifiedAt();
	String description();
	String brand();
	int orderQuantity();
	List<OrderCostAllocation> orderCostAllocations();
	String taxExempt();
	int cutToLengthMeasurement();
	String partType();
	String partStatus();
	boolean isDropShip();
	int leadTimeInDays();
	String unitOfMeasure();
	boolean hastariff();
	String prop65Warning();
	String orderedAs();
	String routeNotes();
	String liftGateValue();
	Optional<TruckShipMethodTypes> truckCollectValue();
	String shipVia();
	long quoteItemNumber();
	String refernceNumber();
	String shipMethod();
	String upgradeshipmethod();
	String shipMethodDesc();
	String shipMethodCode();
	String shipMethodLocation();
	String shipCompleteLocation();
	String orderSource();
	String orderSourceValue();
	List<String> evmiBranchIds();
	String originCartName();
	long quoteNumber();
	String referenceNumber();
	int backOrderQuantity();
	List<String> shiptoRegulationCodes();
	BigDecimal itemUnitPrice();
	BigDecimal itemTotalPrice();
	String cpiItems();
	String cpiType();
	String imageLink();
	boolean orderCostAllocationOverridden();
	boolean canShipByTruck();
	String truckCarrierName();
	String truckCarrierPhone();
	String truckCarrierCac();
	String truckCarrierAccountNumber();
	String orderQuantityDescription();
	boolean lockedQuote();
	long quoteAddressId();
	int maxCoilLength();
	String originSource();
	String title();
	String subTitle();
	int sellMinQuantity();
	List<QuantityBreakPrice> quantityBreakPrices();
	String truckShipDescription();
	String abilityOneProducts();
	boolean isWebSellable();
	List<WorkflowSourceCartItem> workflow();
	Optional<CustomBundleInfo> customBundleInfo();
	boolean isFreeUpgrade();
	List<String> originCartIds();
	List<String> originCartLineIds();
	WorkflowDetails workflowDetails();
}

