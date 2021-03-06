package br.com.arq.back.service.pagsegurorequest;

import java.io.Serializable;

public class RequestBillingAddress implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	
	private Long    billingId=10l; 
	private String  billingAddressStreet="Av.%20Brig.%20Faria%20Lima&";
	private Number  billingAddressNumber=1384;
	private String  billingAddressComplement="5o%20andar";
	private String  billingAddressDistrict="Jardim%20Paulistano";
	private String  billingAddressPostalCode="01452002";
	private String  billingAddressCity="Sao%20Paulo";
	private String  billingAddressState="SP"; 
	private String  billingAddressCountry="BRA";
	
	public RequestBillingAddress() {
	}
	
	
	
	public RequestBillingAddress(Long billingId, String billingAddressStreet, Number billingAddressNumber,
			String billingAddressComplement, String billingAddressDistrict, String billingAddressPostalCode,
			String billingAddressCity, String billingAddressState, String billingAddressCountry) {
		super();
		this.billingId = billingId;
		this.billingAddressStreet = billingAddressStreet;
		this.billingAddressNumber = billingAddressNumber;
		this.billingAddressComplement = billingAddressComplement;
		this.billingAddressDistrict = billingAddressDistrict;
		this.billingAddressPostalCode = billingAddressPostalCode;
		this.billingAddressCity = billingAddressCity;
		this.billingAddressState = billingAddressState;
		this.billingAddressCountry = billingAddressCountry;
	}




	public Long getBillingId() {
		return billingId;
	}

	public void setBillingId(Long billingId) {
		this.billingId = billingId;
	}


	public String getBillingAddressStreet() {
		return billingAddressStreet;
	}
	public void setBillingAddressStreet(String billingAddressStreet) {
		this.billingAddressStreet = billingAddressStreet;
	}
	public Number getBillingAddressNumber() {
		return billingAddressNumber;
	}
	public void setBillingAddressNumber(Number billingAddressNumber) {
		this.billingAddressNumber = billingAddressNumber;
	}
	public String getBillingAddressComplement() {
		return billingAddressComplement;
	}
	public void setBillingAddressComplement(String billingAddressComplement) {
		this.billingAddressComplement = billingAddressComplement;
	}
	public String getBillingAddressDistrict() {
		return billingAddressDistrict;
	}
	public void setBillingAddressDistrict(String billingAddressDistrict) {
		this.billingAddressDistrict = billingAddressDistrict;
	}
	public String getBillingAddressPostalCode() {
		return billingAddressPostalCode;
	}
	public void setBillingAddressPostalCode(String billingAddressPostalCode) {
		this.billingAddressPostalCode = billingAddressPostalCode;
	}
	public String getBillingAddressCity() {
		return billingAddressCity;
	}
	public void setBillingAddressCity(String billingAddressCity) {
		this.billingAddressCity = billingAddressCity;
	}
	public String getBillingAddressState() {
		return billingAddressState;
	}
	public void setBillingAddressState(String billingAddressState) {
		this.billingAddressState = billingAddressState;
	}
	public String getBillingAddressCountry() {
		return billingAddressCountry;
	}
	public void setBillingAddressCountry(String billingAddressCountry) {
		this.billingAddressCountry = billingAddressCountry;
	}
	
	
}
