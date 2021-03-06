package br.com.arq.back.mg;

public class PagSeguroGatewayMG {

	
	
	 private String title;
	 private String description;
	 private String email;
	 private String token;
	 private String sandBoxEmail;
	 private String sandBoxToken;
	 private String method;
	 private String tcCredit;
	 private String tcTransfer;
	 private String tcTicket;
	 private String tcTicketMesage;
	 private String sendOnlyTotal;
	 private String invoicePrefix;
	 private String sandBox;
	 private String debug;
	 
	 
	public PagSeguroGatewayMG(String title, String description, String email, String token, String sandBoxEmail,
			String sandBoxToken, String method, String tcCredit, String tcTransfer, String tcTicket,
			String tcTicketMesage, String sendOnlyTotal, String invoicePrefix, String sandBox, String debug) {
		super();
		this.title = title;
		this.description = description;
		this.email = email;
		this.token = token;
		this.sandBoxEmail = sandBoxEmail;
		this.sandBoxToken = sandBoxToken;
		this.method = method;
		this.tcCredit = tcCredit;
		this.tcTransfer = tcTransfer;
		this.tcTicket = tcTicket;
		this.tcTicketMesage = tcTicketMesage;
		this.sendOnlyTotal = sendOnlyTotal;
		this.invoicePrefix = invoicePrefix;
		this.sandBox = sandBox;
		this.debug = debug;
	}
	
	
	
	@Override
	public String toString() {
		return "PagSeguroGatewayMG [title=" + title + ", description=" + description + ", email=" + email + ", token="
				+ token + ", sandBoxEmail=" + sandBoxEmail + ", sandBoxToken=" + sandBoxToken + ", method=" + method
				+ ", tcCredit=" + tcCredit + ", tcTransfer=" + tcTransfer + ", tcTicket=" + tcTicket
				+ ", tcTicketMesage=" + tcTicketMesage + ", sendOnlyTotal=" + sendOnlyTotal + ", invoicePrefix="
				+ invoicePrefix + ", sandBox=" + sandBox + ", debug=" + debug + "]";
	}



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getSandBoxEmail() {
		return sandBoxEmail;
	}
	public void setSandBoxEmail(String sandBoxEmail) {
		this.sandBoxEmail = sandBoxEmail;
	}
	public String getSandBoxToken() {
		return sandBoxToken;
	}
	public void setSandBoxToken(String sandBoxToken) {
		this.sandBoxToken = sandBoxToken;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getTcCredit() {
		return tcCredit;
	}
	public void setTcCredit(String tcCredit) {
		this.tcCredit = tcCredit;
	}
	public String getTcTransfer() {
		return tcTransfer;
	}
	public void setTcTransfer(String tcTransfer) {
		this.tcTransfer = tcTransfer;
	}
	public String getTcTicket() {
		return tcTicket;
	}
	public void setTcTicket(String tcTicket) {
		this.tcTicket = tcTicket;
	}
	public String getTcTicketMesage() {
		return tcTicketMesage;
	}
	public void setTcTicketMesage(String tcTicketMesage) {
		this.tcTicketMesage = tcTicketMesage;
	}
	public String getSendOnlyTotal() {
		return sendOnlyTotal;
	}
	public void setSendOnlyTotal(String sendOnlyTotal) {
		this.sendOnlyTotal = sendOnlyTotal;
	}
	public String getInvoicePrefix() {
		return invoicePrefix;
	}
	public void setInvoicePrefix(String invoicePrefix) {
		this.invoicePrefix = invoicePrefix;
	}
	public String getSandBox() {
		return sandBox;
	}
	public void setSandBox(String sandBox) {
		this.sandBox = sandBox;
	}
	public String getDebug() {
		return debug;
	}
	public void setDebug(String debug) {
		this.debug = debug;
	} 
	 
	 
	 
}
