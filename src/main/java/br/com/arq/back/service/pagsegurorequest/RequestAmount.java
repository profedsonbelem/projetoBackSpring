package br.com.arq.back.service.pagsegurorequest;

import java.io.Serializable;

public class RequestAmount implements Serializable{
	
 
	 private static final long serialVersionUID = 1L;
	 private Double grossAmount=20301.00;
	 private Double discountAmount=0.00;
	 private Double feeAmount=0.00;
	 private Double netAmount=0.00;
	 private Double extraAmount=0.00;
	 
	 
	 public RequestAmount() {
	 }
	 
	 
	public RequestAmount(Double grossAmount, Double discountAmount, Double feeAmount, Double netAmount,
			Double extraAmount) {
		super();
		this.grossAmount = grossAmount;
		this.discountAmount = discountAmount;
		this.feeAmount = feeAmount;
		this.netAmount = netAmount;
		this.extraAmount = extraAmount;
	}
	public Double getGrossAmount() {
		return grossAmount;
	}
	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}
	public Double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public Double getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(Double feeAmount) {
		this.feeAmount = feeAmount;
	}
	public Double getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(Double netAmount) {
		this.netAmount = netAmount;
	}
	public Double getExtraAmount() {
		return extraAmount;
	}
	public void setExtraAmount(Double extraAmount) {
		this.extraAmount = extraAmount;
	}
	 
   
	 
	 
}
