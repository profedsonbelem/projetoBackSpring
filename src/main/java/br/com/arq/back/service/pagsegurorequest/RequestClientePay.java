package br.com.arq.back.service.pagsegurorequest;

import java.io.Serializable;

public class RequestClientePay  implements Serializable{
 
	private static final long serialVersionUID = 1L;
	
	private Integer idRequestCliente=1;
	private String  senderName="Jose%20Comprador";
	private	String  senderCPF="22111944785";
	private	String  senderAreaCode="11";
	private String  senderPhone="56273440";
	private String  senderEmail="comprador40sandbox.pagseguro.com.br";
	private String  senderHash="hash_do_comprador";
	
	public RequestClientePay() {
	}
	
	public RequestClientePay(Integer idRequestCliente, String senderName, String senderCPF, String senderAreaCode,
			String senderPhone, String senderEmail, String senderHash) {
		this.idRequestCliente = idRequestCliente;
		this.senderName = senderName;
		this.senderCPF = senderCPF;
		this.senderAreaCode = senderAreaCode;
		this.senderPhone = senderPhone;
		this.senderEmail = senderEmail;
		this.senderHash = senderHash;
	}


	@Override
	public String toString() {
		return "RequestCliente [idRequestCliente=" + idRequestCliente + ", senderName=" + senderName + ", senderCPF="
				+ senderCPF + ", senderAreaCode=" + senderAreaCode + ", senderPhone=" + senderPhone + ", senderEmail="
				+ senderEmail + ", senderHash=" + senderHash + "]";
	}


	public Integer getIdRequestCliente() {
		return idRequestCliente;
	}
	public void setIdRequestCliente(Integer idRequestCliente) {
		this.idRequestCliente = idRequestCliente;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderCPF() {
		return senderCPF;
	}
	public void setSenderCPF(String senderCPF) {
		this.senderCPF = senderCPF;
	}
	public String getSenderAreaCode() {
		return senderAreaCode;
	}
	public void setSenderAreaCode(String senderAreaCode) {
		this.senderAreaCode = senderAreaCode;
	}
	public String getSenderPhone() {
		return senderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}
	public String getSenderEmail() {
		return senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	public String getSenderHash() {
		return senderHash;
	}
	public void setSenderHash(String senderHash) {
		this.senderHash = senderHash;
	}
	
	
}
