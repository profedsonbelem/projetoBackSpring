package br.com.arq.back.service.pagsegurorequest;

import java.io.Serializable;

public class RequestShippingAddress implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idShippingAddress;
	private Integer shippingAddressNumber = 1384;
	private String shippingAddressStreet = "=Av.%20Brig.%20Faria%20Lima&";
	private String shippingAddressComplement = "5o%20andar";
	private String shippingAddressPostalCode = "5o%20andar";
	private String shippingAddressCity = "Jardim%20Paulistano";
	private String shippingAddressState = "01452002";
	private String shippingAddressCountry = "Sao%20Paulo";
	private String shippingType = "SP";
	private String shippingCost = "BRA";

	public RequestShippingAddress() {

	}

	public RequestShippingAddress(Integer idShippingAddress, Integer shippingAddressNumber,
			String shippingAddressStreet, String shippingAddressComplement, String shippingAddressPostalCode,
			String shippingAddressCity, String shippingAddressState, String shippingAddressCountry, String shippingType,
			String shippingCost) {
		super();
		this.idShippingAddress = idShippingAddress;
		this.shippingAddressNumber = shippingAddressNumber;
		this.shippingAddressStreet = shippingAddressStreet;
		this.shippingAddressComplement = shippingAddressComplement;
		this.shippingAddressPostalCode = shippingAddressPostalCode;
		this.shippingAddressCity = shippingAddressCity;
		this.shippingAddressState = shippingAddressState;
		this.shippingAddressCountry = shippingAddressCountry;
		this.shippingType = shippingType;
		this.shippingCost = shippingCost;
	}

	@Override
	public String toString() {
		return "ShippingAddress [idShippingAddress=" + idShippingAddress + ", shippingAddressNumber="
				+ shippingAddressNumber + ", shippingAddressStreet=" + shippingAddressStreet
				+ ", shippingAddressComplement=" + shippingAddressComplement + ", shippingAddressPostalCode="
				+ shippingAddressPostalCode + ", shippingAddressCity=" + shippingAddressCity + ", shippingAddressState="
				+ shippingAddressState + ", shippingAddressCountry=" + shippingAddressCountry + ", shippingType="
				+ shippingType + ", shippingCost=" + shippingCost + "]";
	}

	public Integer getIdShippingAddress() {
		return idShippingAddress;
	}

	public void setIdShippingAddress(Integer idShippingAddress) {
		this.idShippingAddress = idShippingAddress;
	}

	public Integer getShippingAddressNumber() {
		return shippingAddressNumber;
	}

	public void setShippingAddressNumber(Integer shippingAddressNumber) {
		this.shippingAddressNumber = shippingAddressNumber;
	}

	public String getShippingAddressStreet() {
		return shippingAddressStreet;
	}

	public void setShippingAddressStreet(String shippingAddressStreet) {
		this.shippingAddressStreet = shippingAddressStreet;
	}

	public String getShippingAddressComplement() {
		return shippingAddressComplement;
	}

	public void setShippingAddressComplement(String shippingAddressComplement) {
		this.shippingAddressComplement = shippingAddressComplement;
	}

	public String getShippingAddressPostalCode() {
		return shippingAddressPostalCode;
	}

	public void setShippingAddressPostalCode(String shippingAddressPostalCode) {
		this.shippingAddressPostalCode = shippingAddressPostalCode;
	}

	public String getShippingAddressCity() {
		return shippingAddressCity;
	}

	public void setShippingAddressCity(String shippingAddressCity) {
		this.shippingAddressCity = shippingAddressCity;
	}

	public String getShippingAddressState() {
		return shippingAddressState;
	}

	public void setShippingAddressState(String shippingAddressState) {
		this.shippingAddressState = shippingAddressState;
	}

	public String getShippingAddressCountry() {
		return shippingAddressCountry;
	}

	public void setShippingAddressCountry(String shippingAddressCountry) {
		this.shippingAddressCountry = shippingAddressCountry;
	}

	public String getShippingType() {
		return shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(String shippingCost) {
		this.shippingCost = shippingCost;
	}

}
